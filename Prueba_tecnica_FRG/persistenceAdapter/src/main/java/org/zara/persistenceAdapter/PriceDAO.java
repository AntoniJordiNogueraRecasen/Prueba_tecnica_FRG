package org.zara.persistenceAdapter;

import org.springframework.stereotype.Repository;
import org.zara.application.dto.PriceDTO;


import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import org.springframework.jdbc.core.JdbcTemplate;
import org.simpleflatmapper.jdbc.spring.ResultSetExtractorImpl;
import org.simpleflatmapper.jdbc.spring.JdbcTemplateMapperFactory;
import org.simpleflatmapper.jdbc.spring.RowMapperImpl;
import org.springframework.dao.EmptyResultDataAccessException;
import org.zara.application.exception.PriceDoesNotExistException;

@Repository
public class PriceDAO implements org.zara.application.portOut.PriceDAO {
    private JdbcTemplate jdbcTemplate;

    public PriceDAO(JdbcTemplate jdbcTemplate) { this.jdbcTemplate = jdbcTemplate; }

    ResultSetExtractorImpl<PriceDTO> pricesRowMapper =
            JdbcTemplateMapperFactory
                    .newInstance()
                    .addKeys("price_list")
                    .newResultSetExtractor(PriceDTO.class);

    RowMapperImpl<PriceDTO> priceRowMapper =
            JdbcTemplateMapperFactory
                    .newInstance()
                    .addKeys("price_list")
                    .newRowMapper(PriceDTO.class);

    @Override
    public List<PriceDTO> getPrices() {
        final var query = "select * from prices";
        return jdbcTemplate.query(query, pricesRowMapper);
    }

    @Override
    public List<PriceDTO> getPriceCadena(int brand_id) {
        final var query = "select * from prices where brand_id = ?";
        try {
            return jdbcTemplate.query(query, pricesRowMapper, brand_id);
        } catch(EmptyResultDataAccessException ex) {
            throw new PriceDoesNotExistException(brand_id);
        }
    }

    @Override
    public List<PriceDTO> getPrice(String product_id) {
        final var query = "select * from prices where product_id = ?";
        try {
            return jdbcTemplate.query(query, pricesRowMapper, product_id);
        } catch(EmptyResultDataAccessException ex) {
            throw new PriceDoesNotExistException(product_id);
        }
    }

    @Override
    public List<PriceDTO> getPrice(Timestamp start_date, Timestamp end_date) {
        final var query = "select * from prices where start_date <= ? and ? <= end_date";
        try {
            return jdbcTemplate.query(query, pricesRowMapper, start_date, end_date);
        } catch(EmptyResultDataAccessException ex) {
            throw new PriceDoesNotExistException(start_date, end_date);
        }
    }

    @Override
    public List<PriceDTO> getPriceTesting(Timestamp start_date, Timestamp end_date, int brand_id, String product_id) {
        final var query = "select * from prices where start_date <= ? and ? <= end_date and brand_id = ? and product_id = ?";
        try {
            return jdbcTemplate.query(query, pricesRowMapper, start_date, end_date, brand_id, product_id);
        } catch(EmptyResultDataAccessException ex) {
            throw new PriceDoesNotExistException(start_date, end_date);
        }
    }

    @Override
    public PriceDTO getPrice(int price_list) {
        final var query = "select * from prices where price_list <= ?";
        try {
            return jdbcTemplate.queryForObject(query, priceRowMapper, price_list);
        } catch(EmptyResultDataAccessException ex) {
            throw new PriceDoesNotExistException(price_list);
        }
    }

    @Override
    public PriceDTO addPrice(PriceDTO priceDTO) {
        final var query = "INSERT INTO prices (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        jdbcTemplate.update(query, priceDTO.getBrand_id(), priceDTO.getStart_date(), priceDTO.getEnd_date(), priceDTO.getPrice_list(),
                            priceDTO.getProduct_id(), priceDTO.getPriority(), priceDTO.getPrice(), priceDTO.getCurr());

        return this.getPrice(priceDTO.getPrice_list());
    }
}

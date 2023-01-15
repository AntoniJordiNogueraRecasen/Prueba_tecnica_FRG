package org.zara.application.service;

import org.springframework.stereotype.Service;
import org.zara.application.dto.PriceDTO;
import org.zara.application.portIn.PriceUseCases;
import org.zara.application.portOut.PriceDAO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class PricesService implements PriceUseCases {

    PriceDAO priceDAO;

    public PricesService(PriceDAO priceDAO) {
        this.priceDAO = priceDAO;
    }

    @Override
    public List<PriceDTO> getPrices() {
        return priceDAO.getPrices();
    }

    @Override
    public List<PriceDTO> getPriceCadena(int brand_id) {
        return priceDAO.getPriceCadena(brand_id);
    }

    @Override
    public List<PriceDTO> getPrice(String product_id) {
        return priceDAO.getPrice(product_id);
    }

    @Override
    public List<PriceDTO> getPrice(LocalDateTime start_date, LocalDateTime end_date) {
        return priceDAO.getPrice(start_date, end_date);
    }

    @Override
    public List<PriceDTO> getPriceTesting(LocalDateTime start_date, LocalDateTime end_date, int brand_id, String product_id) {
        return priceDAO.getPriceTesting(start_date, end_date, brand_id, product_id);
    }

    @Override
    public PriceDTO getPrice(int price_list) {
        return priceDAO.getPrice(price_list);
    }

    @Override
    public PriceDTO addPrice(PriceDTO priceDTO) {
        return priceDAO.addPrice(priceDTO);
    }
}

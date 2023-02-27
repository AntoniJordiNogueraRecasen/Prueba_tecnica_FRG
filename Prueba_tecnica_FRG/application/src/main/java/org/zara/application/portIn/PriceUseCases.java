package org.zara.application.portIn;

import org.zara.application.dto.PriceDTO;

import java.sql.Timestamp;
import java.util.List;

public interface PriceUseCases {
    List<PriceDTO> getPrices();

    List<PriceDTO> getPriceCadena(int brand_id);

    List<PriceDTO> getPrice(String product_id);

    List<PriceDTO> getPrice(Timestamp start_date, Timestamp end_date);

    List<PriceDTO> getPriceTesting(Timestamp start_date, Timestamp end_date, int brand_id, String product_id);

    PriceDTO getPrice(int price_list);

    PriceDTO addPrice(PriceDTO priceDTO);
}

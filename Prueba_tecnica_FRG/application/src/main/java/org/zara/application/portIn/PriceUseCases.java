package org.zara.application.portIn;

import org.zara.application.dto.PriceDTO;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface PriceUseCases {
    List<PriceDTO> getPrices();

    List<PriceDTO> getPriceCadena(int brand_id);

    List<PriceDTO> getPrice(String product_id);

    List<PriceDTO> getPrice(LocalDateTime start_date, LocalDateTime end_date);

    List<PriceDTO> getPriceTesting(LocalDateTime start_date, LocalDateTime end_date, int brand_id, String product_id);

    PriceDTO getPrice(int price_list);

    PriceDTO addPrice(PriceDTO priceDTO);
}

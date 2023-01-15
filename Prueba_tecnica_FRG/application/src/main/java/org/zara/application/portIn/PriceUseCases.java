package org.zara.application.portIn;

import org.zara.application.dto.PriceDTO;

import java.util.Date;
import java.util.List;

public interface PriceUseCases {
    List<PriceDTO> getPrices();

    PriceDTO getPrice(String product_id);

    PriceDTO getPrice(Date start_date);

    PriceDTO getPrice(int price_list);
}

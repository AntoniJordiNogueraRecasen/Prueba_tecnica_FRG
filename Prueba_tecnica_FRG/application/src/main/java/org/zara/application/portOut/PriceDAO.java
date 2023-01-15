package org.zara.application.portOut;

import org.zara.application.dto.PriceDTO;

import java.util.Date;
import java.util.List;

public interface PriceDAO {
    List<PriceDTO> getPrices();

    PriceDTO getPrice(String product_id);

    PriceDTO getPrice(Date start_date);

    PriceDTO getPrice(int price_list);

    void addPrice(PriceDTO priceDTO);
}

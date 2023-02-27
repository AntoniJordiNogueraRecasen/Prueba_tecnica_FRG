package org.zara.webAdapter;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.zara.application.dto.PriceDTO;
import org.zara.application.portIn.PriceUseCases;
import org.zara.application.service.PricesService;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@Validated
@RestController
public class pricesRESTController {
    private PriceUseCases pricesService;

    public pricesRESTController(PricesService pricesService) {
        this.pricesService = pricesService;
    }

    @GetMapping("/prices")
    public List<PriceDTO> getPrices() { return pricesService.getPrices(); }

    @GetMapping("/prices/{brand_id}")
    public List<PriceDTO> getPricesCadena(@PathVariable int brand_id) {
        return pricesService.getPriceCadena(brand_id);
    }

    @GetMapping("/prices/{product_id}")
    public List<PriceDTO> getPrices(@PathVariable String product_id) {
        return pricesService.getPrice(product_id);
    }

    @GetMapping("/prices/start_date/{start_date}/end_date/{end_date}")
    public List<PriceDTO> getPrices(@PathVariable Timestamp start_date, @PathVariable Timestamp end_date) {
        return pricesService.getPrice(start_date, end_date);
    }

    @GetMapping("/prices/start_date/{start_date}/end_date/{end_date}/brand_id/{brand_id}/product_id/{product_id}")
    public List<PriceDTO> getPricesTesting(@PathVariable Timestamp start_date, @PathVariable Timestamp end_date, @PathVariable int brand_id, @PathVariable String product_id) {
        return pricesService.getPriceTesting(start_date, end_date, brand_id, product_id);
    }

    @GetMapping("/prices/{price_list}")
    public PriceDTO getPrices(@PathVariable int price_list) {
        return pricesService.getPrice(price_list);
    }

    @PostMapping("/prices")
    public PriceDTO postPrice(@RequestBody PriceDTO price) {
        return pricesService.addPrice(price);
    }
}

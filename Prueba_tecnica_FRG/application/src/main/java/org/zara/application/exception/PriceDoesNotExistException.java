package org.zara.application.exception;

import java.util.Date;

public class PriceDoesNotExistException extends RuntimeException {
    public PriceDoesNotExistException(String product_id) { super("Price of product " + product_id + " doesn't exist"); }

    public PriceDoesNotExistException(Date start_date) { super("Price with application date " + start_date + " doesn't exist"); }

    public PriceDoesNotExistException (int price_list) { super("Price with chain identifier " + price_list + " doesn't exist"); }
}

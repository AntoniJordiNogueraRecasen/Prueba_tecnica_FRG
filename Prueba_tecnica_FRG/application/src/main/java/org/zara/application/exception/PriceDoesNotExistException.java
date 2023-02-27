package org.zara.application.exception;

import java.sql.Timestamp;
import java.util.Date;

public class PriceDoesNotExistException extends RuntimeException {

    public PriceDoesNotExistException(String product_id) { super("Price of product " + product_id + " doesn't exist"); }

    public PriceDoesNotExistException(Timestamp start_date, Timestamp end_date) { super("Price with application date between " + start_date + " and " + end_date + " doesn't exist"); }

    public PriceDoesNotExistException (int price_list) { super("Price with chain identifier " + price_list + " doesn't exist"); }
}

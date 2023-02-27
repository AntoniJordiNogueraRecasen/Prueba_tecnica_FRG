DROP TABLE if EXISTS cadena_grup;
CREATE TABLE cadena_grup
(
    id        INT PRIMARY KEY
);

DROP TABLE if EXISTS prices;
CREATE TABLE prices
(
    brand_id    INT,
    start_date  TIMESTAMP,
    end_date    TIMESTAMP,
    price_list  INT AUTO_INCREMENT PRIMARY KEY,
    product_id  VARCHAR(256),
    priority    INT,
    price   DOUBLE,
    curr    VARCHAR(256),
    FOREIGN KEY (brand_id) REFERENCES cadena_grup (id)
);
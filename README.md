# Prueba_tecnica_FRG

## GET Mappings:
/prices

/prices/{brand_id} --> int brand_id

/prices/{product_id} --> String product_id

/prices/start_date/{start_date}/end_date/{end_date} --> LocalDateTime start_date, LocalDateTime end_date

/prices/start_date/{start_date}/end_date/{end_date}/brand_id/{brand_id}/product_id/{product_id} --> LocalDateTime start_date, LocalDateTime end_date, int brand_id, String product_id

/prices/{price_list} --> int price_list

## POST Mappings:
/prices --> El request body corresponde a los valores en la clase PriceDTO.


## Estructura del proyecto
Esta Rest-API ha sido creada siguiendo una arquitectura Hexagonal la cual hace uso de adaptadores de persistencia y adaptadores web. La estructura se organiza en diferentes carpetas:

### -Application

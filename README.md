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
En esta carpeta vemos que se encuentra un apartado para el AOP, el DTO, las excepciones, el PortIn, el PortOut y el microservicio para el Price.

### -Configuration
En esta carpeta encontramos el SpringBootApplication y una carpeta llamada configuration la cual contiene la configuración del RestTemplate y la configuración de la seguridad de la aplicación.

### -Domain
En esta carpeta encontramos la clase Price. En esta carpeta podremos en un futuro introducir las futuras clases del dominio.

### -Persistence Adapter
En esta carpeta encontramos los adaptadores de persistencia, en este caso el PriceDAO.

### -Web Adapter
En esta carpeta encontramos el REST Controller de Price.

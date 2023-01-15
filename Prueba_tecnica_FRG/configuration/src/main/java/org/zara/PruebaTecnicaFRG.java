package org.zara;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.zara.application", "org.zara.configuration.security"})
public class PruebaTecnicaFRG {
    public static void main(String[] args) {
        SpringApplication.run(PruebaTecnicaFRG.class, args);
    }
}

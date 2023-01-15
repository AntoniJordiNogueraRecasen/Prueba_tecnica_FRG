package org.zara.application.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
@Component
public class LoggerAdvice {
    private static final Logger logger = LoggerFactory.getLogger(LoggerAdvice.class);


    //A pointcut that matches methods with a single parameter of type StudentDTO
    @Pointcut("execution(* org.zara.application.service.PricesService.*(org.zara.application.dto.PriceDTO))")
    public void priceDTOParameter() {
    }

    //Before advice of a pointcut
    @Before("priceDTOParameter()")
    public void getPrice() {
        logger.info("Getting price information...");
    }
}

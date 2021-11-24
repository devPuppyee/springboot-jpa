package jpabook.jpashop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class AopConfig {
    private static final Logger logger = LoggerFactory.getLogger(AopConfig.class);

    @Before("execution(* jpabook.jpashop.AopController.*(..))")
    public void doSomethingBefore(){
        logger.info("AOP Test: Before");
    }

    @After("execution(* jpabook.jpashop.AopController.*(..))")
    public void doSomethingAfter(){
        logger.info("AOP Test: After");
    }

    @Around("within(jpabook.jpashop..*) && !@annotation(jpabook.jpashop.annotation.LogExclusion)")
    public Object logging(ProceedingJoinPoint pjp) throws Throwable{
        logger.info("AOP Test: Around");
        return null;
    }
}

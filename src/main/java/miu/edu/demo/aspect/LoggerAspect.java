package miu.edu.demo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggerAspect {

    @Pointcut("@annotation(miu.edu.demo.aspect.annotation.LogMe)")
    public void logMeAnnotation(){

    }

    @Pointcut("execution(* miu.edu.demo.controller.ProductController.*(..))")
    public void logMeExecution(){

    }

    @Pointcut("within(miu.edu.demo.controller.ProductController)")
    public void logMeWithin(){

    }

    @Pointcut("target(miu.edu.demo.controller.ProductController)")
    public void logMeTarget(){

    }

    @Before(" logMeAnnotation() || logMeExecution()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("Log before the method: " + joinPoint.getSignature().getName());
    }

    @After("logMeAnnotation() || logMeExecution()")
    public void logAfter(JoinPoint joinPoint){
        System.out.println("Log after the method: " + joinPoint.getSignature().getName());
    }

    @AfterReturning("logMeAnnotation() ")
    public void logReturning(JoinPoint joinPoint){
        System.out.println("Log after returning the method: " + joinPoint.getSignature().getName());
    }

    @AfterThrowing("logMeAnnotation()")
    public void logThrowing(JoinPoint joinPoint){
        System.out.println("Log after throwing the method: " + joinPoint.getSignature().getName());
    }


//    @Around("logMe()")
//    public void logAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
//        System.out.println("Log around before the method: " + proceedingJoinPoint.getSignature().getName());
//        proceedingJoinPoint.proceed();
//        System.out.println("Log around after the method: " + proceedingJoinPoint.getSignature().getName());
//
//    }



}

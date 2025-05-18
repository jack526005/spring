package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class StudentAOP {
    public void afterStudy(JoinPoint point) {
        System.out.println("为什么毕业了他们都继承家产，我还倒给他们打工，我努力的意义在哪里..."+point.getArgs()[0]);
    }
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("方法开始之前");
        Object value = joinPoint.proceed();   //调用process方法来执行被代理的原方法，如果有返回值，可以使用value接收
        System.out.println("方法执行完成，结果为："+value);
        return value;
    }
}

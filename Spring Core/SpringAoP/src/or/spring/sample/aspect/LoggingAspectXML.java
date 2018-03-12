package or.spring.sample.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
public class LoggingAspectXML {

	
	
	public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint){
		System.out.println("Before to call method");
		Object returnValue = null;
		try {
			returnValue=proceedingJoinPoint.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		System.out.println("End of the call mehtod");
		return returnValue.toString()+"!!!!";
	}
}

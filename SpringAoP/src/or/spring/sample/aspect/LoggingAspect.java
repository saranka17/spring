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
@Aspect
public class LoggingAspect {
	/*@Before("allCircleMethods()")
	public void loggingAdvice(JoinPoint joinpoint){
		System.out.println(joinpoint.toString());
	}
	@After("execution(public String or.spring.sample.model.Circle.getName())")
	public void afterLoggingAdvice(){
		System.out.println("Get Name is being after advice...");
	}*/
/*	@AfterReturning(pointcut="args(test)",returning="returnString")
	public void stringArgMethods(String test, String returnString){
		System.out.println("A method whihc takes the string argument hsa been called:"+test+":return String:"+returnString);
	}
	@AfterThrowing(pointcut="args(test)",throwing="ex")
	public void stringArgMethodswithtrhrow(String test, Exception ex){
		System.out.println("After exception throwed:"+test+":ex=="+ex);
	}*/
	
	@Pointcut("execution(public * or.spring.sample.model.*.get*())")
	public void allGetters(){}
	
	@Pointcut("within(or.spring.sample.model.Circle)")
	public void allCircleMethods(){}
	
	@Around("@annotation(or.spring.sample.aspect.Loggable)")
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

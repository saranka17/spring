package javaConfiguration;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Lazy;

@Lazy(true)
public class MessageBean {
	private String message="";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	public void init(){
		System.out.println("Message Bean Intiialixed");
	}
	public void destroy(){
		System.out.println("Message Bean desriyed");
	}
}

package javaConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class MessageBeanConfigTwo {
	@Autowired MessageBeanConfig messageBeanConfig;
	
	@Bean(name="messageBean2")
	public MessageBean getMessageBean2(){
		return messageBeanConfig.getMessageBean();
	}
}

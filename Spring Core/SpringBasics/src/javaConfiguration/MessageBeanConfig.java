package javaConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MessageBeanConfig {
		@Bean(initMethod="init",destroyMethod="destroy")
		public MessageBean getMessageBean(){
			MessageBean bean= new MessageBean();
			bean.setMessage("Welocme!!!!!!!");
			return bean;
		}
}

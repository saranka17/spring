package javaConfiguration;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class MessageBeanConfig {
		@Bean(name="messageBean",initMethod="init",destroyMethod="destroy",autowire=Autowire.BY_NAME)
		public MessageBean getMessageBean(){
			MessageBean bean= new MessageBean();
			bean.setMessage("Welocme!!!!!!!");
			return bean;
		}
}

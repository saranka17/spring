package org.spring.sample.component;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class MyEventlistener implements ApplicationListener {

	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println(event.toString());
		
	}

}

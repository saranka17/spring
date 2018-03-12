package org.spring.sample.component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
@Component
public class Circle implements Shape, ApplicationEventPublisherAware {
	@Autowired
	private MessageSource messageSource;
	private Point center;
	
	private ApplicationEventPublisher eventPublisher;
	
	public void draw() {
		//System.out.println("Drawing the Circle with Points:("+center.getX()+","+center.getY()+")");
		DrawEvent drawEvent= new DrawEvent(this);
		eventPublisher.publishEvent(drawEvent);
		//System.out.println(drawEvent.toString());
		System.out.println(this.getMessageSource().getMessage("greeting", null, "default hello", null));
		System.out.println(this.getMessageSource().getMessage("drawing.point", new Object[]{center.getX(),center.getY()}, "default drawing", null));
	}
	public Point getCenter() {
		return center;
	}
	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}
	@PostConstruct
	public void init(){
		System.out.println("Initialized!!!");
	}
	@PreDestroy
	public void destroy(){
		System.out.println("Destroyed!!!");
	}
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	
	public void setEventPublisher(ApplicationEventPublisher eventPublisher) {
		this.eventPublisher = eventPublisher;
	}
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.eventPublisher=publisher;
	}
}

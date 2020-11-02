package ru.startpack;

import Classes.HelloWorldMessageProvider;
import Classes.StandardOutMessageRenderer;
import Interface.MessageProvider;
import Interface.MessageRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationProject.class);

        MessageRender renderer = context.getBean("render", MessageRender.class);
        renderer.render();
    }
}

package ru.startpack;

import Classes.HelloWorldMessageProvider;
import Classes.StandardOutMessageRenderer;
import Interface.MessageProvider;
import Interface.MessageRender;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        MessageRender rend = context.getBean("render", StandardOutMessageRenderer.class);
        rend.render();
    }
}

package ru.homework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.homework.outputResult.AbstractOut;
import ru.homework.outputResult.ResultTest;

public class Start {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

        AbstractOut result = context.getBean("result", AbstractOut.class);

        System.out.println(result.getResult());
        System.out.println("End line");
    }
}

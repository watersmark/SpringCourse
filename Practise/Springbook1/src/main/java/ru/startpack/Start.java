package ru.startpack;

import Classes.HelloWorldMessageProvider;
import Classes.StandardOutMessageRenderer;
import Interface.MessageProvider;
import Interface.MessageRender;

public class Start {
    public static void main(String[] args) {

        MessageRender render = new StandardOutMessageRenderer();
        MessageProvider provider = new HelloWorldMessageProvider();

        render.setMessageProvider(provider);
        render.render();


    }
}

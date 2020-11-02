package ru.startpack;

import Classes.HelloWorldMessageProvider;
import Classes.StandardOutMessageRenderer;
import Interface.MessageProvider;
import Interface.MessageRender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationProject {

    @Bean
    public MessageProvider provider() {
        return new HelloWorldMessageProvider();
    }

    @Bean
    public MessageRender render(){
        MessageRender render = new StandardOutMessageRenderer();
        render.setMessageProvider(provider());
        return render;
    }
}

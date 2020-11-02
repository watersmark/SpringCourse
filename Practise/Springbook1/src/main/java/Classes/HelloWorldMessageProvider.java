package Classes;

import Interface.MessageProvider;

public class HelloWorldMessageProvider implements MessageProvider {

    @Override
    public String getMessage(){
        return "Hello world";
    }
}

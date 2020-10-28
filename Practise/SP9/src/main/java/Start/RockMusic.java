package Start;


import org.springframework.stereotype.Component;

@Component
public class RockMusic implements Music
{

    @Override
    public String getSongs(){
        return "We we we will rock you";
    }

}

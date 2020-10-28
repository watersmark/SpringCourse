package Start;
import org.springframework.stereotype.Component;


@Component
public class ClassicMusic implements Music {
    @Override
    public String getSongs() {
        return "Bohemia Rhapsody";
    }
}

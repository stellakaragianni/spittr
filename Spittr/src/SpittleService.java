import java.util.Date;

public interface SpittleService {
    Spittle createSpittle(Long id, String text, Date postedTime);
}

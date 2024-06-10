import java.util.Date;
import java.util.List;

public interface SpittleService {
    Spittle createSpittle(long id, String text, Date postedTime);
    Spittle deleteSpittle(long id, List<Spittle> spittles, Spittle spittle);
    Spittle addSpittle(Spittle spittle, List<Spittle> spittles);
}

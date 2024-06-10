import java.util.Date;

public interface SpittleService {
    Spittle createSpittle(long id, String text, Date postedTime);
    Spittle deleteSpittle(long id, Spitter spitter);
    Spittle addSpittle(Spittle spittle, Spitter spitter);
}

import java.util.Date;

public class SpittleServiceImpl implements SpittleService{
    public Spittle createSpittle(Long id, String text, Date postedTime){
        Spittle xx = new Spittle(id, text, postedTime);
        return xx;
    }
}

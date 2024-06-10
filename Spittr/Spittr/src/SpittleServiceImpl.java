import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpittleServiceImpl implements SpittleService{

    public Spittle createSpittle(Long id, String text, Date postedTime){
        Spittle xx = new Spittle(id, text, postedTime);
        return xx;
    }

    public Spittle addSpittle(Spittle spittle, Spitter spitter) {
        List<Spittle> spittles = new ArrayList<>();
        String thisText = spittle.getText();
        for ( Spittle s : spittles ) {
            spittles.add(spittle);
        }
        return spittle;
    }

    public deleteSpittle(long id, Spitter spitter) {
        List<Spittle> spittles = new ArrayList<>();
        for ( Spittle s : spittles ) {
            spittles.remove(Spittle spittle);
        }
    }
}

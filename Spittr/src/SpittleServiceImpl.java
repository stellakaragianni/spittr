import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SpittleServiceImpl implements SpittleService{

    List<Spittle> spittles = new ArrayList<>();

    public Spittle createSpittle(Long id, String text, Date postedTime){
        Spittle xx = new Spittle(id, text, postedTime);
        return xx;
    }

    public Spittle addSpittle(Spittle spittle, Spitter spitter) {
            this.spittles.add(spittle);
        return (Spittle) spittles;
    }

    public void deleteSpittle(long id, List spittles, Spittle spittle) {
        Spittle spittleToDelete = null;
        for (Spittle spittle : spittles) {
            if (spittle.getId().equals(id)) {
                spittleToDelete = spittle;
                break;
            }
        }
        if (spittleToDelete != null) {
            spittles.remove(spittleToDelete);
        }
    }
}

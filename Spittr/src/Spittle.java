import java.util.Date;

interface FirstInterface {
    public void myMethod(); // interface method
}

public class Spittle{

    private Long id;
    private String text;
    private Date postedTime;
    private Spitter spitter;

    public Spittle(Long id, String text, Date postedTime, Spitter spitter){
        this.id = id;
        this.text = text;
        this.postedTime = postedTime;
        this.spitter = new Spitter();;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getPostedTime() {
        return postedTime;
    }

    public void setPostedTime(Date postedTime) {
        this.postedTime = postedTime;
    }

    public Spitter getSpitter() {
        return spitter;
    }

    public void setSpitter(Spitter spitter) {
        this.spitter = spitter;
    }

    @Override
    public String toString() {
        return "Spittle{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", postedTime=" + postedTime +
                ", spitter=" + spitter +
                '}';
    }

}

import java.util.ArrayList;
import java.util.List;


public class Spitter{
    private Long spitterId;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;

    List<String> spittles = new ArrayList<String>();

    public Spitter(String username, String firstname, String lastname, String email, String password){
        this.spitterId = spitterId;
        this.username = username;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.spittles = new ArrayList<String>(); // Initialize empty list of Spittles
    }

    public Long getspitterId() {
        return spitterId;
    }

    public void setspitterId(Long spitterId) {
        this.spitterId = spitterId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Spitter{" +
                "spitterId=" + spitterId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", spittles=" + spittles +
                '}';
    }


//
//
//        //To connect through list spitter w spittle
//        /* public Spittle create(String text) {
//            Spittle spittle = new Spittle(text, this); // Create a new Spittle with this Spitter as owner
//            this.spittles.add(spittle); // Add the Spittle to the user's list
//            return spittle; // Optionally return the created Spittle
//        }*/
//
//        private List<Spitter> spitters;
//
//	    /*public Spitter() {
//            this.spitters = new ArrayList<Spitter>();
//        }*/
//
//        public List<Spitter> findAll() {
//            return spitters;
//        }
//
//        public Spitter save(Spitter spitter) {
//            spitters.add(spitter);
//            return spitter;
//        }
//
//        public Spitter findByUsername(String username) {
//            for (Spitter s : spitters) {
//                String currentUsername = s.getUsername();
//                if ( currentUsername.equals(username) ) {
//                    return s;
//                }
//            }
//            return null;
//        }
}

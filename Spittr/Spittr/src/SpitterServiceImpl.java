import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class SpitterServiceImpl implements SpitterService{

    public Spitter addSpitter(String username, String firstname, String lastname, String email, String password) {
        Spitter bb = new Spitter(username, firstname, lastname, email, password);
        return bb;
    }

    public Spitter updateSpitter(Long id, String newFirstName, String newLastName) {
        if(addSpitter().getId().equals(long id)){
            addSpitter().setFirstname(String newFirstName);
            addSpitter().setLastname(String newLastName);
        }
    }

    public deleteSpitter(String username){
        if(getAllUsers(username).equals(this.username)){
        //delete Spitter
        }
    }

    public boolean isUsernameAvailable(String username, Spitter spitter){
        List<Spitter> spitters = new ArrayList<>();
        if(spitters.username.exists() == TRUE){
            return true;
        }
        return false;
    }
}

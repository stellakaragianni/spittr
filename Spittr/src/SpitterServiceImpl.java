import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class SpitterServiceImpl implements SpitterService{

    public Spitter addSpitter(String username, String firstname, String lastname, String email, String password) {
        Spitter spitter = new Spitter(username, firstname, lastname, email, password);
        return spitter;
    }

    public List<Spitter> spitterRepository = new ArrayList<Spitter>();
    //spitterRepository = spitterRepository.addSpitter(getId);

    public Spitter updateSpitter(Long spitterId, String firstname, String lastname, String email, String password) {
            Spitter spitterToUpdate = spitterRepository.get(Math.toIntExact(spitterId));

            if (spitterToUpdate != null) {
                spitterToUpdate.setFirstname(firstname);
                spitterToUpdate.setLastname(lastname);
                spitterToUpdate.setEmail(email);

                // Update password if provided
                if (password != null && !password.isEmpty()) {
                    spitterToUpdate.setPassword(password);
                }
                // Save updated Spitter object to storage
                spitterRepository.add(spitterToUpdate);
            } else {
                System.out.println("Spitter not found.");
            }

            return spitterRepository;
        }

    }

    public void deleteSpitter(String username, ArrayList spitterRepository){
        Spitter spitterToRemove = null;
        for (Spitter spitter : spitterRepository) {
            if (spitter.getUsername().equals(username)) {
                spitterToRemove = spitter;
                break;
            }
        }
        if (spitterToRemove != null) {
            spitterRepository.remove(spitterToRemove);
        }
    }

    public boolean isUsernameAvailable(List<Spitter> spitterRepository, String username){
        for (Spitter spitter : spitterRepository){
            if (spitter.getUsername().equalsIgnoreCase(username)){
                return false; }
        }
        return true;
    }
}

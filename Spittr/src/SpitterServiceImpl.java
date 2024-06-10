import java.util.ArrayList;
import java.util.List;

import static java.lang.Boolean.TRUE;

public class SpitterServiceImpl implements SpitterService{

    public Spitter addSpitter(String username, String firstname, String lastname, String email, String password) {
        Spitter spitter = new Spitter(username, firstname, lastname, email, password);
        return spitter;
    }

    List<Spitter> spitterRepository = new ArrayList<Spitter>();
    //spitterRepository = spitterRepository.addSpitter(getId);

    public Spitter updateSpitter(Long spitterId, String firstname, String lastname, String email, String password) {
            // Find Spitter by ID (replace with actual Spring Data JPA methods)
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

    public deleteSpitter(String username, List spitterRepository){
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

    public boolean isUsernameAvailable(String username, Spitter spitter){
        List<Spitter> spitters = new ArrayList<>();
        if(spitters.username.exists() == TRUE){
            return true;
        }
        return false;
    }
}

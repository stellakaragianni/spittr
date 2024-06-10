import java.util.List;

public interface SpitterService {

    Spitter addSpitter(String username, String firstname, String lastname, String email, String password);

    Spitter updateSpitter(Long spitterId, String newFirstName, String newLastName);

    List<Spitter> getAllUsers();

    Spitter deleteSpitter(String username);
    boolean isUsernameAvailable(String username);
}

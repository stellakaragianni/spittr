import java.util.List;

public interface SpitterService {

    Spitter addSpitter(String username, String firstname, String lastname, String email, String password);

    Spitter updateSpitter(Long spitterId, String firstname, String lastname, String email, String password);

    List<Spitter> getAllUsers();

    Spitter deleteSpitter(String username, Spitter spitterRepository);
    boolean isUsernameAvailable(String username, Spitter spitter);
}

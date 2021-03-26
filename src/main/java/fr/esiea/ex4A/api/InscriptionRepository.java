package fr.esiea.ex4A.api;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Random;

@Repository
class InscriptionRepository {
    final List<InscriptionData> defaultUsers = List.of(
        new InscriptionData("test@gmail.com","Isabelle", "isatweet", "FR", "F", "H"),
        new InscriptionData("test@gmail.com","Michelle", "michelletweet","FR", "F", "H"),
        new InscriptionData("test@gmail.com","Bernadette", "bernatweet", "FR", "F", "H")
    );
    private final Random random = new Random();

    List<InscriptionData> defaultUsers() {
        return defaultUsers;
    }
}

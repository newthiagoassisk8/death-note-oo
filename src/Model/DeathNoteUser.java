package Model;

import java.time.LocalDate;

public class DeathNoteUser extends Human {
    public boolean hasShinigamiEyes;
    public String useShinigamiEyes(Human human) {
        if (!hasShinigamiEyes) {
           return "this Death Note User doesn't have shinigame Eyes";
        }
        return human.getName() + " - " + human.getRemainingLifeSpan();
    };
    public void writeInDeathNote(Human human, LocalDate DeathDay) {

    };
}

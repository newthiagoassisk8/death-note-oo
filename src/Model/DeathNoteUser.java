package Model;

import java.time.LocalDate;

public class DeathNoteUser extends Human {
    public boolean hasShinigamiEyes;

    public DeathNoteUser(String name, boolean alive, boolean hasShinigamiEyes) {
        super(name, alive);
        // O super aqui está invocando o contrutor da super classe nesse caso Human
        this.hasShinigamiEyes = hasShinigamiEyes;
    }

    public void setShinigamiEyes() {
       hasShinigamiEyes = true;

    }

    public String useShinigamiEyes(Human human) {
        if (!hasShinigamiEyes) {
           return "this Death Note User doesn't have shinigame Eyes";
        }
      // TODO: Corggir esse retorno
        return human.getName() + " - " + human.getRemainingLifeSpan();
    };


    public void writeInDeathNote(Human human, LocalDate DeathDay) {

    };
}

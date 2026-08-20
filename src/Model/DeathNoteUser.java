package Model;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

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
        var lifespan = human.getRemainingLifeSpan();

        return String.format(
                "%s - %d anos, %d meses e %d dias de vida restantes",
                human.getName(),
                lifespan.getYears(),
                lifespan.getMonths(),
                lifespan.getDays()
                //Como iss funcionou se eu nao defini meus métodos?

        );
    };

// TODO: FAZER MÉTODO PERMITIR ESCREVER O NOME DA VÍTIMA, A CUSA DE SUA MORTE E O TEMPO ATÉ QUE ELA MORRA.
    public void writeInDeathNote(Human human)   {

    };
}

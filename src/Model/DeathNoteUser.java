package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class DeathNoteUser extends Human {
    public boolean hasShinigamiEyes;

public DeathNoteUser(String name, boolean alive, boolean hasShinigamiEyes) {
    super(name, alive );
    this.hasShinigamiEyes =  hasShinigamiEyes;}

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

    // Sobrecarga de método (method overloading):
    // este writeInDeathNote recebe a vítima e uma data/hora específica para a morte.
    public void writeInDeathNote(Human victim, LocalDateTime deathDate) {
        System.out.println(victim.getName() + " morrerá em " + deathDate);

    }

    // Sobrecarga de método (method overloading):
    // este writeInDeathNote tem o mesmo nome, mas recebe apenas a vítima.
    // Quando a data/hora não é informada, a regra padrão é contar 40 segundos.
    public void writeInDeathNote(Human victim) {
        for (int seconds = 40; seconds >= 0; seconds--) {
            System.out.println(seconds);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("A contagem foi interrompida.");
                return;
            }
        }

        System.out.println(victim.getName() + " morreu.");
    }


}

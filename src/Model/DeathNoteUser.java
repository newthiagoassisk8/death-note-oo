package Model;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

/*
 * Uma interface funciona como um contrato.
 * Ela não diz se o usuário é Human ou Shinigami; ela apenas define quais
 * operações qualquer usuário de Death Note deve disponibilizar.
 */
public interface DeathNoteUser {

    boolean hasShinigamiEyes();
    String sayAnything(String foo);
    void setShinigamiEyes(boolean hasShinigamiEyes);

    /*
     * Um método default também faz parte do contrato, mas já oferece uma
     * implementação padrão. Human e Shinigami podem reutilizar esta lógica
     * ou sobrescrevê-la com @Override caso tenham uma regra diferente.
     */
    default String useShinigamiEyes(Human human) {
        if (!hasShinigamiEyes()) {
           return "this Death Note User doesn't have shinigame Eyes";
        }
        var lifespan = human.getRemainingLifeSpan();

        return String.format(
                "%s - %d anos, %d meses e %d dias de vida restantes",
                human.getName(),
                lifespan.getYears(),
                lifespan.getMonths(),
                lifespan.getDays()
        );
    }

    // Sobrecarga de método (method overloading):
    // este writeInDeathNote recebe a vítima e uma data/hora específica para a morte.
    // Por ser default, esta implementação fica disponível para todas as classes
    // que cumprem o contrato DeathNoteUser.
    default void writeInDeathNote(Human victim, LocalDateTime deathDate) {
        System.out.println(victim.getName() + " morrerá em " + deathDate);

    }

    // Sobrecarga de método (method overloading):
    // este writeInDeathNote tem o mesmo nome, mas recebe apenas a vítima.
    // Quando a data/hora não é informada, a regra padrão é contar 40 segundos.
    default void writeInDeathNote(Human victim) {
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

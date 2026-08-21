import Model.DeathNoteUser;
import Model.Human;
import Model.Shinigami;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Human light = new Human("Light Yagami", true, false, "oi");
        Human lind = new Human("Lind L. Taylor", true, false, "oi");
        Shinigami ryuk = new Shinigami("Ryuk", true);

        /*
         * O tipo da variável é a interface. Isso é possível porque tanto light
         * quanto ryuk cumprem seu contrato, embora sejam classes diferentes.
         * Esse uso de objetos diferentes pelo mesmo tipo é polimorfismo.
         */
        DeathNoteUser humanUser = light;
        DeathNoteUser shinigamiUser = ryuk;

        humanUser.writeInDeathNote(
                lind,
                LocalDateTime.of(2026, 8, 21, 23, 30)
        );

        System.out.println(shinigamiUser.useShinigamiEyes(lind));

    }
}

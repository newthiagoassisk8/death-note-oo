import Model.DeathNoteUser;
import Model.Human;

import java.time.LocalDateTime;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        DeathNoteUser kira = new DeathNoteUser("light Yagami", true, false);
        var human1 = new Human("Lind L Taylor", true);

        System.out.println(kira.useShinigamiEyes(human1));

        kira.writeInDeathNote(human1,   LocalDateTime.of(2026, 8, 21, 23, 30)
        );

    }
}

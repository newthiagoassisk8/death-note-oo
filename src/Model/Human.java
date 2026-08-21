package Model;
import java.time.Period;
import java.util.Random;

/*
 * "implements DeathNoteUser" declara que Human aceita o contrato da interface.
 * Por isso, Human precisa implementar todos os métodos sem corpo definidos nela.
 */
public class Human implements DeathNoteUser {
    Random random = new Random();
    private String name;
    private boolean alive;
    private boolean hasShinigamiEyes;
    private Period remainingLifeSpan;
    int years = random.nextInt(80);
    int months = random.nextInt(12);
    int days = random.nextInt(31);
    String anything;


    public Human(String name, boolean alive, boolean hasShinigamiEyes, String anything) { this.name = name; this.alive = alive; this.hasShinigamiEyes = hasShinigamiEyes; this.anything = anything; }

    public String getName() {
        return name;
    }

    public Period getRemainingLifeSpan() {
        this.remainingLifeSpan = Period.of(years, months, days);
        return  this.remainingLifeSpan;
    }



    @Override
    public String toString() {
        return "Human{" +
                ", name='" + name + '\'' +
                ", alive=" + alive +
                ", remainingLifeSpan=" + remainingLifeSpan +
                ", years=" + years +
                ", months=" + months +
                ", days=" + days +
                '}';
    }

    @Override
    public boolean hasShinigamiEyes() {
        // Esta é a implementação que Human fornece para o contrato.
        return hasShinigamiEyes;
    }

    @Override
    public String sayAnything(String foo) {
        return foo;
    }

    @Override
    public void setShinigamiEyes(boolean hasShinigamiEyes) {
        // Cada Human guarda seu próprio estado; a interface não guarda atributos.
        this.hasShinigamiEyes = hasShinigamiEyes;
    }
}

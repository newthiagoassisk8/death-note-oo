package Model;
import java.time.Period;
import java.util.Random;

public class Human {
    Random random = new Random();


    private String name;
    private boolean alive;
    private Period remainingLifeSpan;
    int years = random.nextInt(80);
    int months = random.nextInt(12);
    int days = random.nextInt(31);

    public String getName() {
        return name;
    }

    public Period getRemainingLifeSpan() {
        this.remainingLifeSpan = Period.of(years, months, days);
        return  this.remainingLifeSpan;
    }
}

package Model;

/*
 * Shinigami não herda de Human. Mesmo assim, pode cumprir o mesmo contrato
 * DeathNoteUser e, com isso, oferecer as mesmas operações de usuário.
 */
public class Shinigami implements DeathNoteUser {
    private String name;
    private boolean alive;
    private boolean hasShinigamiEyes;

    public Shinigami(String name, boolean alive) {
        this.name = name;
        this.alive = alive;

        this.hasShinigamiEyes = true;
    }
    public String getName() {
        return name;
    }

    @Override
    public boolean hasShinigamiEyes() {
        // Implementação do contrato adaptada ao estado deste Shinigami.
        return hasShinigamiEyes;
    }

    @Override
    public String sayAnything(String foo) {
        return foo;
    }

    @Override
    public void setShinigamiEyes(boolean hasShinigamiEyes) {
        this.hasShinigamiEyes = hasShinigamiEyes;
    }
}

package Homework2.office;

/**
 *  Класс охранник
 */
public class SecurityGuard {
    private String name;

    public SecurityGuard(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void askForAdvance() {
        System.out.println("Выдайте мне аванс!");
    }
}
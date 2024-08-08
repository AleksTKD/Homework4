package Homework2.office;

/**
 *  Класс охранник
 */
public class SecurityGuard {
    String nameSecurityGuard = "";

    public SecurityGuard(String nameSecurityGuard) {
        this.name = nameSecurityGuard;
    }
    public String getName() {
        return nameSecurityGuard;
    }
    public void askForAdvance() {
        System.out.println("Выдайте мне аванс!");
    }
}
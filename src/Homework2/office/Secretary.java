package Homework2.office;
/**
 *  Класс секретарь
 */
public class Secretary {
    public void calmDown(Boss boss, Manager manager, SecurityGuard guard) {
        System.out.println(boss.getName() + " не волнуйтесь, " + manager.getName() + " все успеет. " + guard.getName()
                + " - подождите!");
    }
}
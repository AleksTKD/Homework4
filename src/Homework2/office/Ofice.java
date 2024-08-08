package Homework2.office;

/**
 * Класс офис
 */
public class Ofice {
    Boss boss;
    Manager manager;
    Secretary secretary;
    SecurityGuard guard;

    public Office (Boss boss, Manager manager, Secretary secretary, SecurityGuard guard) {
        this.boss = boss;
        this.manager = manager;
        this.secretary = secretary;
        this.guard = guard;
    }

    public void workingDay() {
        boss.pushManager(manager.getName());
        manager.scream();
        guard.askForAdvance();
        secretary.calmDown(boss, manager, guard);
    }
}

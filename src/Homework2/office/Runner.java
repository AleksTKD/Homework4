package Homework2.office;


public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Петр Николаевич");
        Manager manager = new Manager("Володя");
        SecurityGuard guard = new SecurityGuard("Петрович");
        Secretary secretary = new Secretary();

        Office office = new Office(boss, manager, secretary, guard);
        office.workingDay();
    }
}
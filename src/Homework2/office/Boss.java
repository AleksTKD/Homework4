package Homework2.office;

/**
 *  Класс босс
 */
public class Boss {
    private String name;

    public Boss(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void pushManager(String managerName) {
        System.out.println(managerName + " быстрее!");
    }
}

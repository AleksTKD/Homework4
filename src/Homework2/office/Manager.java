package Homework2.office;

/**
 *  Класс менеджер
 */
public class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void scream() {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
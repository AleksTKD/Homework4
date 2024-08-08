package Homework2.office;

/**
 *  Класс менеджер
 */
public class Manager {
    String nameManager = "";

    public Manager (String nameManager) {
        this.name = nameManager;
    }
    public String getName() {
        return nameManager;
    }
    public void managerScream () {
        System.out.println("Я ничего не успеваю, помогите!");
    }
}
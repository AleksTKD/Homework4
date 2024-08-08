package Homework2.office;

/**
 *  Класс босс
 */
public class Boss {
    String nameBoss = "";

    public Boss (String nameBoss) {
        this.name = nameBoss;
    }
    public String getName() {
        return nameBoss;
    }
    public void phraseManager(String nameManager) {
        System.out.println(nameManager + "быстрее!");
    }
}

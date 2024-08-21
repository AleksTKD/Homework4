package homework3.homework4.ex3;

public class Runner {
    public static void main(String[] args) {
        Human human = new Human();
        Builder builder = new Builder();
        Driver driver = new Driver();
        Bird bird = new Bird();

        Sound[] sounds = {human, builder,driver,bird};

        for (Sound sound : sounds) {
            System.out.println(sound.makeSound());
        }
    }
}

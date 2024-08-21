package homework2;

public class Exercise1 {
    public static void main(String[] args) {
        String[] words = {"Это", "шашлык", "на", "шампуре"};

        String result = "";

        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0);
            if (i < words.length - 1) {
                result += "-";
            }
        }

        System.out.println(result);
    }
}
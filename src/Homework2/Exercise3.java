package Homework2;

import java.util.Random;

public class Exercise3 {
    public static void main(String[] args) {
        //Дан распределитель случайных чисел
        Random random = new Random(1);
        //Получение случайного числа
        int number = random.nextInt(1000);

        int randomNumber = 0;
        int numberAttempt = 0;

        //Написать код, генерирующий случайные числа до тех пор, пока не сгенерируется 999.


        while (randomNumber != 999) {
            randomNumber = random.nextInt(1000); // Генерация случайного числа от 0 до 999
            numberAttempt++;
        }
        //Вывести номер попытки, с которой получилось получить случайным образом число 999.
        System.out.println("Число получино с попытки №:" + numberAttempt);
    }
}


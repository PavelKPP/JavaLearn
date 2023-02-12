import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int xMin = 3;
        int xMax = 7;
        int yMin = -4;
        int yMax = 2;

        int randomX;
        int randomY;

        randomX = (int)Math.floor(Math.random()*(xMax - xMin + 1) + xMin);
        randomY = (int)Math.floor(Math.random()*(yMax - yMin + 1) + yMin);

        System.out.println("Random X: " + randomX + ";" + " Random Y: " + randomY);

        int xInput;
        int yInput;
        int counter = 0;

        System.out.println("Вас вітає гра 'Угадай кординати'!");
        System.out.println("Правила гри: ");
        System.out.println("У вас э 5 спроб!. Кординати загадані рандомно!");
        System.out.println("Відставити хвилювання. З вами буде мій помічник!");

        do {
            System.out.println("Введіть X: ");
            xInput = sc.nextInt();
            System.out.println("Введіть Y: ");
            yInput = sc.nextInt();

            if (xInput < randomX){
                System.out.println("Збілшіть X!");
            } else if (xInput > randomX) {
                System.out.println("Зменшіть X!");
            } else if (xInput == randomX) {
                System.out.println("Ви вгадали X!");
            }

            if (yInput < randomY){
                System.out.println("Зменшіть Y!");
            } else if(yInput > randomY){
                System.out.println("Зменшіть Y!");
            } else if (yInput == randomY){
                System.out.println("Ви вгадали Y!");
            }
            counter++;

            if (counter == 5){
                System.out.println("Ви програли! Бовдур!");
                break;
            }

            System.out.println("Спроба: " + counter + "/5");

        }while(((xInput != randomX) && (yInput != randomY)) || counter > 5);

        if(xInput == randomX && yInput == randomY){
            System.out.println("Вітаю з перемогою! Ви вгадали з: " + counter + " спроби." );
        }

    }
}


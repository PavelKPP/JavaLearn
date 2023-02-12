import java.util.Scanner;

public class AnotherWay {
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
        int counterForX = 0;
        int counterForY = 0;

        System.out.println("Вас вітає гра 'Угадай кординати'!");
        System.out.println("Правила гри: ");
        System.out.println("У вас э 5 спроб!. Кординати загадані рандомно!");
        System.out.println("Відставити хвилювання. З вами буде мій помічник!");
        System.out.println("Почнемо з осі Х!");

        do {
            System.out.println("Введіть занчення X: ");
            xInput = sc.nextInt();
            if (xInput < randomX){
                System.out.println("Збілшіть X!");
            } else if (xInput > randomX) {
                System.out.println("Зменшіть X!");
            } else if (xInput == randomX) {
                System.out.println("Ви вгадали X!");
                break;
            }
            counterForX++;
            System.out.println("Спроба " + counterForX + " /5");
            if (counterForX == 5){
                System.out.println("Ви програли!");
                System.exit(1);
            }
        }while(xInput != randomX);

        System.out.println("Огого! Якщо ви тут, то ви вгадали X! Добре...");

        do{
            System.out.println("Введіть свій Y:");
            yInput = sc.nextInt();
            if (yInput < randomY){
                System.out.println("Зменшіть Y!");
            } else if(yInput > randomY){
                System.out.println("Зменшіть Y!");
            } else if (yInput == randomY){
                System.out.println("Ви вгадали Y!");
            }
            counterForY++;
            System.out.println("Спроба " + counterForY + " /5");
            if (counterForY == 5){
                System.out.println("Ви були так близькі...");
                System.exit(1);
            }
            counterForY++;
        }while(yInput != randomY);

        if(xInput == randomX && yInput == randomY){
            System.out.println("Вітаю з перемогою!");
        }

    }
}

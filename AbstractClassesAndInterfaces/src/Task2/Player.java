package Task2;

import java.util.Scanner;

public class Player implements Playable, Recodable{


    @Override
    public void play() {
        System.out.println("Play your fragment of audio");
    }

    @Override
    public void stop() {
        System.out.println("Stop your fragment of audio ");
    }

    @Override
    public void record() {
        System.out.println("Record your own audio fragment");
    }

    @Override
    public void pause() {
        System.out.println("Pause your own audio fragment");
    }

    public static void main(String[] args) {

        Player player = new Player();

        Scanner sc = new Scanner(System.in);

        String firstInput, secondInput;

        System.out.println("Choose your option: Play, Stop, Record, Pause");

        firstInput = sc.nextLine();

        switch (firstInput){
            case "Play":
                player.play();
                break;
            case "Stop":
                player.stop();
                break;
            case "Record":
                player.record();
                break;
            case "Pause":
                player.pause();
                break;
        }
    }
}

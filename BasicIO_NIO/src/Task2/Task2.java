package Task2;

import java.io.*;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
         int min_value = 1;
         int max_value = 100;
         int range =  max_value - min_value + 1;

        try(DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\BasicIO_NIO\\src\\Task2.txt")));
            DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\BasicIO_NIO\\src\\Task2.txt")));) {
            for(int i = 0; i < 10; i++){
                dataOutputStream.writeInt((int)(Math.random() * range) + min_value);
            }
            dataOutputStream.flush();

            int[] array = new int[10];
            for(int a = 0; a < array.length; a++){
                array[a] = dataInputStream.readInt();
            }

            Arrays.sort(array);

            System.out.println("Sorted file: ");

            for(int j = 0; j < 10; j++){
                dataOutputStream.writeInt(array[j]);
            }
            dataOutputStream.flush();

            for(int i = 0; i < 10; i++){
                System.out.println(dataInputStream.readInt());
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

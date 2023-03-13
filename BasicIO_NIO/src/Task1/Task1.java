package Task1;

import java.io.*;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        try(DataOutputStream outputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("Task1.Task1.txt")));
            DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("Task1.Task1.txt")));) {
            outputStream.writeInt(sc.nextInt());
            outputStream.writeDouble(sc.nextDouble());
            outputStream.writeShort(sc.nextShort());
            outputStream.writeUTF("Example for Task1.Task1");
            outputStream.flush();

            System.out.println("Integer: " + inputStream.readInt());
            System.out.println("Double: " + inputStream.readDouble());
            System.out.println("Short: " + inputStream.readShort());
            System.out.println("UTF/String: " + inputStream.readUTF());


        } catch(FileNotFoundException e){
            e.printStackTrace();;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

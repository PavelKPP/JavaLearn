package AdditionalTask;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        try(InputStream is = new FileInputStream("C:\\Users\\Pavel Kuzhel\\IdeaProjects\\BasicIO_NIO\\src\\AdditionalTask\\Text.txt")){
           int size = is.available();
           for(int i = 0; i < size; i++){
               System.out.print((char) is.read());
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package AdditionalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {



static void addStringToList(ArrayList<String> listForInput) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Put your words in here: " );
    System.out.println("If you want to stop just print 'end'");

    for (int i = 0; i < 10; i++){
        String stringInp;
        stringInp = reader.readLine();
        listForInput.add(stringInp);

        if(stringInp.equals("end")){
            listForInput.remove(i);
            break;
        }
    }

}
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();

        addStringToList(list);

        System.out.println(list);
    }
}

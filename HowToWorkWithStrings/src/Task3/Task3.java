package Task3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String sentences = "Yo, wassupasdasdasdasdasdasdasdasdasda?\n"+
                "Hey, everything?\n"+
                "Hello how are you, buddyaaas?";

        String[] substring;

        substring = sentences.split("\\?");





        for(int i = 0; i < substring.length; i++){
            for(int j = i + 1; j < substring.length; j++){
                if(substring[i].length() > substring[j].length()){
                    String mover = substring[i];
                    substring[i] = substring[j];
                    substring[j] = mover;
                }
            }
        }
        System.out.println(Arrays.toString(substring));

    }
}

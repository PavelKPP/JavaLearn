package Task2;

import java.sql.SQLOutput;

public class Title {
    private String Title;
    public Title(){

    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    void show(){
        System.out.println("Title:" + Title);
        }

}

package Task1;

public class Monitor {
    int resolutionX;
    int resolutionY;



    Monitor(int resolutionX, int resolutionY){
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;

    }

    @Override
    public String toString(){
        return String.format("X= %d , Y= %d", resolutionX, resolutionY);
    }

}


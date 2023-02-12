package Task2;

public class Monitor {
    int resolutionX;
    int resolutionY;

    Monitor(int resolutionX, int resolutionY){
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Monitor monitor = (Monitor) obj;
        if (resolutionX != monitor.resolutionX && resolutionY != monitor.resolutionY) return false;
        return true;
    }


    @Override
    public int hashCode(){

        int result = 17;

        result = 37 * result + (resolutionX ^ (resolutionX >>> 32));
        result = 37 * result + (resolutionY ^ (resolutionY >>> 32));

        return result;
    }

}

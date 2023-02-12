package Task2;

public class EthernetAdapter {
    int speed;
    String Mac;


    EthernetAdapter(int speed, String Mac){
        this.speed = speed;
        this.Mac = Mac;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) obj;
        if (speed != ethernetAdapter.speed && Mac != ethernetAdapter.Mac) return false;
        return true;
    }


    @Override
    public int hashCode(){

        int result = 17;

        result = 37 * result + (speed ^ (speed >>> 32));
        result = 37 * result + (Mac == null ? 0 : Mac.hashCode());

        return result;
    }
}

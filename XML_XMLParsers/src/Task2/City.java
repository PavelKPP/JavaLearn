package Task2;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "city")
public class City {
    private String name;
    private String adress;
    private int block;


    City(){

    }

    City(String name, String adress, int block){
        this.name = name;
        this.adress = adress;
        this.block = block;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", block=" + block +
                '}';
    }
    public String getName() {
        return name;
    }
    @XmlElement
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    @XmlElement
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public int getBlock() {
        return block;
    }
    @XmlElement
    public void setBlock(int block) {
        this.block = block;
    }
}

package Task1.entity;

public class Adress {
    private String street;
    private String block;
    private String subway;


    Adress(){

    }

    Adress(String street, String block, String subway){
        this.street = street;
        this.block = block;
        this.subway = subway;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getSubway() {
        return subway;
    }

    public void setSubway(String subway) {
        this.subway = subway;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", block='" + block + '\'' +
                ", subway='" + subway + '\'' +
                '}';
    }
}

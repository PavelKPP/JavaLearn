package Task2;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@XmlRootElement(name = "units_catalog")
public class Units {
    @XmlElement(name = "city")
    private List<City> cities = new ArrayList<>();

    public void add(City city){
        cities.add(city);
    }

    @Override
    public String toString() {
        return Arrays.deepToString(cities.toArray());
    }
}

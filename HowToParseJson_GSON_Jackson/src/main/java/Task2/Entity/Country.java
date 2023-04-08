package Task2.Entity;

import Task1.entity.Adress;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Country {

    @SerializedName("country")
    private String countryName;
    @SerializedName("adress")
    private Task1.entity.Adress adress;
    @SerializedName("personalContacts")
    private List<String> personalContacts;

    Country(){

    }

    Country(String countryName, Task1.entity.Adress adress, List<String> personalContacts){
        this.countryName = countryName;
        this.adress = adress;
        this.personalContacts = personalContacts;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Task1.entity.Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<String> getPersonalContacts() {
        return personalContacts;
    }

    public void setPersonalContacts(List<String> personalContacts) {
        this.personalContacts = personalContacts;
    }

    @Override
    public String toString() {
        return "Country{" +
                "countryName='" + countryName + '\'' +
                ", adress=" + adress +
                ", personalContacts=" + personalContacts +
                '}';
    }
}

package Task1.entity;

import java.util.List;

public class Country {
    private String countryName;
    private Adress adress;
    private List<String> personalContacts;

    Country(){

    }

    Country(String countryName, Adress adress, List<String> personalContacts){
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

    public Adress getAdress() {
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

package AdditionalTask;

import com.google.gson.annotations.SerializedName;

import java.math.BigDecimal;

public class Currency {
    @SerializedName("txt")
    private String name;
    @SerializedName("rate")
    private BigDecimal rate;
    @SerializedName("cc")
    private String cc;
    @SerializedName("exchangedate")
    private String date;



    Currency(){

    }


    Currency(String name, BigDecimal rate, String cc, String date){
        this.name = name;
        this.rate = rate;
        this.cc = cc;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", cc='" + cc + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}

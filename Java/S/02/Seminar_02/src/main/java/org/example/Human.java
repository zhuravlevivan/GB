package org.example;

public abstract class Human {
    private static int count = 0;
    private String fi = "";
    private String dateOfBirth = "";
    private String city = "";
    private String country = "";
    private Integer id;
    {
        id = count;
        count++;
    }

    public Integer getId() {
        return id;
    }

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public abstract void getInfo();

}

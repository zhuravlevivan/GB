package org.example;

import java.util.ArrayList;
import java.util.List;

public class Child extends Human{


    private String fi;
    private String dateOfBirth;
    private String city;
    private String country;

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

    Child(String fi, String dateOfBirth, String city, String country) {
        this.fi = fi;
        this.dateOfBirth = dateOfBirth;
        this.city = city;
        this.country = country;
    }

    Child(){

    }

    @Override
    public void getInfo() {
        System.out.printf(" Name %s%n date of birth %s%n city %s%n country %s%n",
                fi,
                dateOfBirth,
                city,
                country);

    }

}

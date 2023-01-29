package org.example;

public class Mother extends Human{
    Mother(String fi, String dateOfBirth, String city, String country){
        this.setFi(fi);
        this.setDateOfBirth(dateOfBirth);
        this.setCity(city);
        this.setCountry(country);
    }

    Mother(){}

    @Override
    public void getInfo() {
        System.out.printf(" Name %s%n date of birth %s%n city %s%n country %s%nid %d%n",
                this.getFi(),
                this.getDateOfBirth(),
                this.getCity(),
                this.getCountry(),
                getId());
    }
}

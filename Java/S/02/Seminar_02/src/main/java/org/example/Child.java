package org.example;

public class Child extends Human{
    Child(String fi, String dateOfBirth, String city, String country) {
        this.setFi(fi);
        this.setDateOfBirth(dateOfBirth);
        this.setCity(city);
        this.setCountry(country);

    }

    Child(){
        super();
    }

    @Override
    public void getInfo() {
        System.out.printf(" Name %s%n date of birth %s%n city %s%n country %s%n id %d%n",
                this.getFi(),
                this.getDateOfBirth(),
                this.getCity(),
                this.getCountry(),
                getId());

    }

}

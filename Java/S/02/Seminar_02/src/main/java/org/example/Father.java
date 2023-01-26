package org.example;
public class Father extends Human{
    Father(String fi, String dateOfBirth, String city, String country) {
        this.setFi(fi);
        this.setDateOfBirth(dateOfBirth);
        this.setCity(city);
        this.setCountry(country);
    }
    Father() {
        super();
    }
    @Override
    public void getInfo() {
        System.out.printf("Name %s%ndate of birth %s%ncity %s%ncountry %s%nid %d%n",
                this.getFi(),
                this.getDateOfBirth(),
                this.getCity(),
                this.getCountry(),
                getId()
        );
    }
}

package org.example;

public class Father extends Child{

    private String childFi;

    Father(String fi, String dateOfBirth, String city, String country, String childFi) {
        super(fi, dateOfBirth, city, country);
        setChildFi(childFi);
    }

    Father(String childFi){
        super();
        setChildFi(childFi);
    }

    public String getChildFi() {
        return childFi;
    }

    public void setChildFi(String childFi) {
        this.childFi = childFi;
    }

    public void fatherInfo(){
        getInfo();
    }

    @Override
    public void getInfo() {
        System.out.printf("Name %s%ndate of birth %s%ncity %s%ncountry %s%nChildName %s%n",
                super.getFi(),
                super.getDateOfBirth(),
                super.getCity(),
                super.getCountry(),
                getChildFi()
        );
    }

}

package design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.entities;


import design_patterns.com.milko.training.java_refactoring.java_refactoring_best_practices.m6.country.Country;

public class Address {

    private Country country;
    private String province;
    private String street;

    public Address(Country country){
        this.country = country;
    }

    public Address(Country country, String province, String street){
        this.country = country;
        this.province = province;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public Country getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

}

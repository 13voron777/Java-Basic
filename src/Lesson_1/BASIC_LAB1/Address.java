package Lesson_1.BASIC_LAB1;

public class Address {
    String country;
    String city;
    String street;
    String index;
    int house;
    int apartment;

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getIndex() {
        return index;
    }

    public int getHouse() {
        return house;
    }

    public int getApartment() {
        return apartment;
    }
}

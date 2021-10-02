package Lesson_1.BASIC_LAB1;

public class Run {
    public static void main(String[] args) {
        Address address = new Address();
        address.setCountry("Poland");
        address.setCity("Warszawa");
        address.setStreet("Wilenska");
        address.setIndex("00-000");
        address.setHouse(37);
        address.setApartment(17);
        System.out.println("Country: " + address.getCountry());
        System.out.println("City: " + address.getCity());
        System.out.println("Street: " + address.getStreet());
        System.out.println("Index: " + address.getIndex());
        System.out.println("House: " + address.getHouse());
        System.out.println("Apartment: " + address.getApartment());
        System.out.println();
        address.showAddress();
    }
}

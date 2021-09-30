package Lesson_1.BASIC_LAB1;

public class Run {
    public static void main(String[] args) {
        Address address = new Address();
        address.country = "Poland";
        address.city = "Warszawa";
        address.street = "Wilenska";
        address.index = "00-000";
        address.house = 37;
        address.apartment = 17;
        System.out.println("Country: " + address.country);
        System.out.println("City: " + address.city);
        System.out.println("Street: " + address.street);
        System.out.println("Index: " + address.index);
        System.out.println("House: " + address.house);
        System.out.println("Apartment: " + address.apartment);
    }
}

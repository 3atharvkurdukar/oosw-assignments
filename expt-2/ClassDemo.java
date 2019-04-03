class Place {
    String name, city, district, country;

    public void printDetails() {
        System.out.println(name);
        System.out.println("City: " + city);
        System.out.println("District: " + district);
        System.out.println("Country: " + country);
    }
}

public class ClassDemo {
    public static void main(String[] args) {
        Place p = new Place();
        p.name = "DBATU, Lonere";
        p.city = "Lonere";
        p.district = "Raigad";
        p.country = "India";

        p.printDetails();
    }
}
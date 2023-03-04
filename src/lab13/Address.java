package lab13;

import java.util.StringTokenizer;


public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;
    public Address() {
    }
    public Address(String country, String region, String city, String street, String house, String building, String apartment) {
        this.country = country;
        this.region = region;
        this.city = city;
        this.street = street;
        this.house = house;
        this.building = building;
        this.apartment = apartment;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public static Address parseAddress(String addressString) {
        Address address = new Address();


        String[] parts = addressString.split(",");
        if (parts.length >= 7) {
            address.setCountry(parts[0].trim());
            address.setRegion(parts[1].trim());
            address.setCity(parts[2].trim());
            address.setStreet(parts[3].trim());
            address.setHouse(parts[4].trim());
            address.setBuilding(parts[5].trim());
            address.setApartment(parts[6].trim());
        }


        return address;
    }
    public static Address parseAddressUsingTokenizer(String addressString) {
        Address address = new Address();

        StringTokenizer tokenizer = new StringTokenizer(addressString, ",.;");
        address.setCountry(tokenizer.nextToken().trim());
        address.setRegion(tokenizer.nextToken().trim());
        address.setCity(tokenizer.nextToken().trim());
        address.setStreet(tokenizer.nextToken().trim());
        address.setHouse(tokenizer.nextToken().trim());
        address.setBuilding(tokenizer.nextToken().trim());
        address.setApartment(tokenizer.nextToken().trim());

        return address;
    }
    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}

import java.util.*;

class Laptop {
    private int laptopId;
    private String brand;
    private String osType;
    private double price;
    private int rating;

    public Laptop(int laptopId, String brand, String osType, double price, int rating) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.osType = osType;
        this.price = price;
        this.rating = rating;
    }

    public int getLaptopId() { return laptopId; }
    public String getBrand() { return brand; }
    public String getOsType() { return osType; }
    public double getPrice() { return price; }
    public int getRating() { return rating; }

    public void setLaptopId(int laptopId) { this.laptopId = laptopId; }
    public void setBrand(String brand) { this.brand = brand; }
    public void setOsType(String osType) { this.osType = osType; }
    public void setPrice(double price) { this.price = price; }
    public void setRating(int rating) { this.rating = rating; }
}

public class MyClass {

    static int countOfLaptopsByBrand(Laptop[] laptops, String brand) {
        int count = 0;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getBrand().equalsIgnoreCase(brand) && laptops[i].getRating() > 3) {
                count++;
            }
        }
        return count;
    }

    static Laptop[] searchLaptopByOsType(Laptop[] laptops, String os) {
        int matchCount = 0;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getOsType().equalsIgnoreCase(os)) matchCount++;
        }
        if (matchCount == 0) return null;

        Laptop[] matched = new Laptop[matchCount];
        int index = 0;
        for (int i = 0; i < laptops.length; i++) {
            if (laptops[i].getOsType().equalsIgnoreCase(os)) {
                matched[index++] = laptops[i];
            }
        }

        for (int i = 0; i < matched.length - 1; i++) {
            for (int j = i + 1; j < matched.length; j++) {
                if (matched[i].getLaptopId() < matched[j].getLaptopId()) {
                    Laptop temp = matched[i];
                    matched[i] = matched[j];
                    matched[j] = temp;
                }
            }
        }
        return matched;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Laptop[] laptops = new Laptop[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String brand = sc.nextLine();
            String os = sc.nextLine();
            double price = sc.nextDouble(); sc.nextLine();
            int rating = sc.nextInt(); sc.nextLine();
            laptops[i] = new Laptop(id, brand, os, price, rating);
        }

        String brand = sc.nextLine();
        String os = sc.nextLine();

        int count = countOfLaptopsByBrand(laptops, brand);
        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("The given brand is not available");
        }

        Laptop[] result = searchLaptopByOsType(laptops, os);
        if (result != null) {
            for (int i = 0; i < result.length; i++) {
                System.out.println(result[i].getLaptopId());
                System.out.println(result[i].getRating());
            }
        } else {
            System.out.println("The given os is not available");
        }
    }
}

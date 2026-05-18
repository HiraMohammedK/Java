import java.util.*;

class Hotel {
    private int hotelId;
    private String hotelName;
    private String dateOfBooking;
    private int noOfRoomsBooked;
    private String wifiFacility;
    private double totalBill;

    public Hotel(int hotelId, String hotelName, String dateOfBooking, int noOfRoomsBooked, String wifiFacility, double totalBill) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.dateOfBooking = dateOfBooking;
        this.noOfRoomsBooked = noOfRoomsBooked;
        this.wifiFacility = wifiFacility;
        this.totalBill = totalBill;
    }

    public int getHotelId() { return hotelId; }
    public String getDateOfBooking() { return dateOfBooking; }
    public int getNoOfRoomsBooked() { return noOfRoomsBooked; }
    public String getWifiFacility() { return wifiFacility; }
    public double getTotalBill() { return totalBill; }
}

public class MyClass {

    static int noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month) {
        int total = 0;
        for (int i = 0; i < hotels.length; i++) {
            String mon = hotels[i].getDateOfBooking().split("-")[1];
            if (mon.equalsIgnoreCase(month)) {
                total += hotels[i].getNoOfRoomsBooked();
            }
        }
        return total;
    }

    static Hotel searchHotelByWifiOption(Hotel[] hotels, String wifi) {
        double highest = -1;
        double second = -1;
        Hotel secondHotel = null;

        for (int i = 0; i < hotels.length; i++) {
            if (hotels[i].getWifiFacility().equalsIgnoreCase(wifi)) {
                double bill = hotels[i].getTotalBill();
                if (bill > highest) {
                    second = highest;
                    secondHotel = null;
                    highest = bill;
                } else if (bill > second) {
                    second = bill;
                    secondHotel = hotels[i];
                }
            }
        }
        return secondHotel;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel[] hotels = new Hotel[4];

        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt(); sc.nextLine();
            String name = sc.nextLine();
            String date = sc.nextLine();
            int rooms = sc.nextInt(); sc.nextLine();
            String wifi = sc.nextLine();
            double bill = sc.nextDouble(); sc.nextLine();
            hotels[i] = new Hotel(id, name, date, rooms, wifi, bill);
        }

        String month = sc.nextLine();
        String wifi = sc.nextLine();

        int total = noOfRoomsBookedInGivenMonth(hotels, month);
        if (total > 0) {
            System.out.println(total);
        } else {
            System.out.println("No rooms booked in the given month");
        }

        Hotel result = searchHotelByWifiOption(hotels, wifi);
        if (result != null) {
            int id = result.getHotelId();
            System.out.println(id);
        } else {
            System.out.println("No such option available");
        }
    }
}

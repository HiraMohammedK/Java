### Question

Create a class `Hotel` with the following private attributes:

- `hotelId` - int
- `hotelName` - String
- `dateOfBooking` - String (format: dd-mon-yyyy, e.g. 01-Jan-2022)
- `noOfRoomsBooked` - int
- `wifiFacility` - String
- `totalBill` - double

Include getters, setters, and a parameterized constructor.

Create a `MyClass` class with a `main` method and two static methods:

**`noOfRoomsBookedInGivenMonth(Hotel[] hotels, String month)`**
- Returns the total number of rooms booked across all hotels for the given month
- Returns 0 if no bookings found for that month
- Case insensitive

**`searchHotelByWifiOption(Hotel[] hotels, String wifi)`**
- Returns the Hotel object with the second highest `totalBill` from hotels matching the given wifi option
- Returns null if no hotel with the given wifi option exists
- Case insensitive
- The array always has at least two hotels with the specified wifi option, or none at all

### Input Format
- 4 Hotel objects (hotelId, hotelName, dateOfBooking, noOfRoomsBooked, wifiFacility, totalBill)
- 1 String for month
- 1 String for wifi option

### Output Format
- If rooms booked > 0: print total, else print `No rooms booked in the given month`
- If wifi match found: print the `hotelId`, else print `No such option available`

### Sample Input
```
101
Best Stay
01-jan-2022
10
Yes
20000
102
Apple Stay
12-Feb-2022
3
Yes
4000
103
Accord
11-May-2022
5
Yes
15000
104
Royal Park
22-Dec-2021
7
Yes
12000
May
Yes
```

### Sample Output
```
5
103
```

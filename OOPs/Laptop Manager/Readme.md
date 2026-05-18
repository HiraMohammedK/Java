Create a class `Laptop` with the following private attributes:

- `laptopId` - int
- `brand` - String
- `osType` - String
- `price` - double
- `rating` - int

Include getters, setters, and a parameterized constructor.

Create a `MyClass` class with a `main` method and two static methods:

**`countOfLaptopsByBrand(Laptop[] laptops, String brand)`**
- Returns the count of laptops matching the given brand whose rating is greater than 3
- Returns 0 if no match found
- Case insensitive

**`searchLaptopByOsType(Laptop[] laptops, String os)`**
- Returns an array of Laptop objects matching the given OS, sorted by `laptopId` in descending order
- Returns null if no match found
- Case insensitive

### Input Format
- 4 Laptop objects (laptopId, brand, osType, price, rating)
- 1 String for brand
- 1 String for OS

### Output Format
- If brand count > 0: print the count, else print `The given brand is not available`
- If OS match found: print each laptop's `laptopId` and `rating` on separate lines, else print `The given os is not available`

### Sample Input
```
123
HP
Windows
35000
5
124
Apple
Mac OS
70000
5
125
Dell
Ubuntu
30000
4
126
HP
windows
40000
4
HP
windows
```

### Sample Output
```
2
126
4
123
5
```

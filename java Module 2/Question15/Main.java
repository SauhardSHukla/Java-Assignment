class Passport {
    private String passportNo;
    private String issueDate;
    private String expiryDate;

    Passport(String passportNo, String issueDate, String expiryDate) {
        this.passportNo = passportNo;
        this.issueDate = issueDate;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Passport: " + passportNo +
               " Issue: " + issueDate +
               " Expiry: " + expiryDate;
    }
}

class Citizen {
    private String name;
    private String dob;
    private String address;
    private Passport passport;

    Citizen(String name, String dob, String address, Passport passport) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.passport = passport;
    }

    @Override
    public String toString() {
        return "Citizen: " + name +
               " DOB: " + dob +
               " Address: " + address +
               "\n" + passport;
    }
}

public class Main {
    public static void main(String[] args) {

        String citizenInput = "Ravi,01-01-1990,Delhi";
        String passportInput = "P123456,01-01-2020,01-01-2030";

        String[] citizenData = citizenInput.split(",");
        String[] passportData = passportInput.split(",");

        Passport passport = new Passport(
            passportData[0],
            passportData[1],
            passportData[2]
        );

        Citizen citizen = new Citizen(
            citizenData[0],
            citizenData[1],
            citizenData[2],
            passport
        );

        System.out.println(citizen);
    }
}
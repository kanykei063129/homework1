import java.util.Scanner;

public class Student {
    private String fullName;
    private String address;
    private int phoneNumber;
    private int bankAccount;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void livein(Apartment[] apartments){
        int result = 0;
        for (Apartment apartment:apartments) {
            if(apartment.getAddress().equals(address)) result = bankAccount / apartment.getPrice();
        }
        System.out.println("Live in : "+result);
    }

    public void changeInfo(){
        System.out.print("Enter a Full Name : ");
        this.fullName = new Scanner(System.in).nextLine();
        System.out.print("Enter an Address : ");
        this.address = new Scanner(System.in).nextLine();
        System.out.print("Enter a phone number : ");
        phoneNumber = new Scanner(System.in).nextInt();
        System.out.print("Enter a Bank Account : ");
        bankAccount = new Scanner(System.in).nextInt();
        System.out.println("Info Changed Successfully!");
    }
}




public class Apartment {
    private String name;
    private String address;
    private int price;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void payPerMonth(Student[] students){
        int counter = 0;
        for (Student student: students) {
            if(student.getAddress().equals(address)) counter++;
        }
        System.out.println(price / counter);
    }
}


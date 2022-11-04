import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // APARTMENT
        Apartment apartment1 = new Apartment();
        apartment1.setName("aparment1");
        apartment1.setAddress("Address 1");
        apartment1.setPrice(10000);

        Apartment apartment2 = new Apartment();
        apartment2.setName("aparment2");
        apartment2.setAddress("Address 2");
        apartment2.setPrice(500);

        // STUDENTS
        Student student1= new Student();
        student1.setFullName("Alibek Altynbek uulu");
        student1.setAddress("Address 1");
        student1.setPhoneNumber(37567389);
        student1.setBankAccount(20000);

        Student student2 = new Student();
        student2.setFullName("Kanykei Akzholtoi kyzy");
        student2.setAddress("Address 1");
        student2.setPhoneNumber(48579834);
        student2.setBankAccount(10000);

        Student student3 = new Student();
        student3.setFullName("Eliza Ashyrbaeva");
        student3.setAddress("Address 1");
        student2.setPhoneNumber(65647327);
        student2.setBankAccount(30000);

        Student student4 = new Student();
        student4.setFullName("Arunchik Janyshbekov");
        student4.setAddress("Address 2");
        student4.setPhoneNumber(574698203);
        student4.setBankAccount(50000);

        Student student5 = new Student();
        student5.setFullName("Nuriza Muratova");
        student5.setAddress("Address 2");
        student5.setPhoneNumber(46512789);
        student5.setBankAccount(40000);

        Student student6 = new Student();
        student6.setFullName("Aigerim Bektenova");
        student6.setAddress("Address 2");
        student6.setPhoneNumber(46328979);
        student6.setBankAccount(60000);

        Student[] students = {student1,student2,student3,student4,student5,student6};
        Apartment[] apartments = {apartment1,apartment2};

        while(true){
            System.out.print("1) Get Students By Address. 2) Pay Per Month. 3) Live In. 4) Change Info. ");
            int input = new Scanner(System.in).nextInt();
            if(input == 1) {
                System.out.print("Enter an ADDRESS : ");
                String address = new Scanner(System.in).nextLine();
                getStudentsByAddress(address,students);
            }else if(input == 2) {
                System.out.print("Enter an apartment number : ");
                int apartmentNumber = new Scanner(System.in).nextInt();
                if(apartmentNumber == 1) apartment1.payPerMonth(students);
                else if(apartmentNumber == 2) apartment2.payPerMonth(students);
                else System.out.println("Please enter a valid apartment number :(");
            }else if(input == 3) {
                System.out.print("Enter a student full name : ");
                String fullName = new Scanner(System.in).nextLine();
                for (Student student : students) {
                    if (student.getFullName().equals(fullName)) {
                        student.livein(apartments);
                        break;
                    }
                }
            }else if(input == 4){
                System.out.print("Enter a student full name : ");
                String fullName = new Scanner(System.in).nextLine();
                for (Student student: students) {
                    if(student.getFullName().equals(fullName)) {
                        student.changeInfo();
                        break;
                    }
                }
            } else {
                System.out.println("Please enter a valid input!");
            }
        }
    }

    public static void getStudentsByAddress(String address,Student[] students){
        for(Student student : students){
            if(student.getAddress().equals(address)){
                System.out.printf("""
                        Student Full Name : %s
                        Student address : %s
                        Student Phone Number : %d
                        Student Bank Account : %d
                        
                        
                        """,student.getFullName(),student.getAddress(),student.getPhoneNumber(),student.getBankAccount());
            }
        }
    }
}











































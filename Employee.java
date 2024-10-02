public class Employee {
    private String firstName = "Дмитрий";
    private String lastName = "Морозов";
    private String position = "Директор";
    private String email = "Morozov@gmail.com";
    private int salary = 15000;
    private int age = 54;
    public Employee (String firstName, String lastName, String position, String email, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("ФИО: " + firstName + "" + lastName);
    }
}

public class Employee {
    private String firstName;
    private String lastName;
    private String position ;
    private String email;
    private int salary;
    private int age;

    public Employee (String firstName, String lastName, String position, String email, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }
    public static void main(String[] args) {
        Employee president = new Employee("Дмитрий", "Морозов", "Президент", "morozov@gmail.com", 1500000, 60);
        System.out.println("ФИО: " + president.firstName + " " + president.lastName + ";");
        System.out.println("Должность: " + president.position + ";");
        System.out.println("Почта: " + president.email + ";");
        System.out.println("Оклад: " + president.salary + "$;");
        System.out.println("Возраст: " + president.age + " лет;");
    }
}

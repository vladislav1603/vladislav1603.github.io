public class Employee {
    private String firstName;
    private String lastName;
    private String position ;
    private String email;
    private int salary;
    private int age;
    public Employee (String firstName, String lastName, String position, String email, int salary, int age) {
        this.firstName = "Дмитрий";
        this.lastName = "Морозов";
        this.position = "Директор";
        this.email = "Morozov@gmail.com";
        this.salary = 15000;
        this.age = 54;
    }

    public static void main(String[] args) {
        
    }

    public void printInfo() {
        System.out.println("ФИО: " + firstName + "" + lastName);
        System.out.println("Должность: " + position);
        System.out.println("Почта: " + email);
        System.out.println("Зарплата: " + salary + " рублей");
        System.out.println("Возраст: " + age + " лет");
    }

    public void employeeArray() {

        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivan", "Ivanov", "Enginner", "ivanov@yandex.ru", 50000, 23);
        persArray[1] = new Employee("Jhon", "JavaScript", "IT", "jvIT@gmail.ru", 690000, 41);
        persArray[2] = new Employee("", "lastName", "position", "email", 502300, 31);
        persArray[3] = new Employee("", "lastName", "position", "email", 986700, 63);
        persArray[4] = new Employee("", "lastName", "position", "email", 167800, 83);

    }
}

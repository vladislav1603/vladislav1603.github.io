
public class Person {
    private String firstName;
    private String lastName;
    private String position ;
    private String email;
    private int salary;
    private int age;

    public Person (String firstName, String lastName, String position, String email, int salary, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.email = email;
        this.salary = salary;
        this.age = age;
    }

    public static void main(String[] args) {
        Person[] persArray = new Person[5];
        persArray[0] = new Person("Ivan", "Ivanov", "Enginner", "ivanov@yandex.ru", 50000, 23);
        persArray[1] = new Person("Jhon", "JavaScript", "IT", "jvIT@gmail.ru", 690000, 41);
        persArray[2] = new Person("Vika", "Demich", "manager", "demich@gmail.ru", 502300, 31);
        persArray[3] = new Person("@#$%", "lastName", "position", "email", 986700, 63);
        persArray[4] = new Person("23145", "lastName", "position", "email", 167800, 83);

        for (int i = 0; i < persArray.length; i++) {
            System.out.println(persArray[i].firstName + " " + persArray[i].lastName + "; " + persArray[i].position + "; " + persArray[i].email + "; " + persArray[i].salary + "; " + persArray[i].age + ";");
        }
    }

}

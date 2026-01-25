import java.util.Random;

class Person {
    String firstname;
    String lastname;
    int age;
    double salary;

    public void getSalary() {
        salary += 500;
    }


    @Override
    public String toString() {
        return
                "Person firstname: " + this.firstname +
                        ", lastname :" + this.lastname +
                        ", age ;" + this.age +
                        ", salary :" + this.salary;

    }
}
//
//public class Main {
//    public static void main(String[] args) {
//
//        Random random = new Random();
//        Person[] people = new Person[5];
//
//        for (int i = 0; i < people.length; i++) {
//            people[i] = new Person();
//            people[i].firstname = "Name" + i;
//            people[i].lastname = "Fa mily" + i;
//            people[i].age = random.nextInt(0, 100);
//        }
//
//        people[0].getSalary();
//
//        for (Person person : people) {
//            System.out.println(person.toString());
//            System.out.println();
//
//        }
//
//
//    }
//}
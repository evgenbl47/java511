package lection;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lecture {
    String HOME = "C:\\Users\\Мой дом\\IdeaProjects\\java511\\git\\Lesson29 FileWriter FileReader\\data\\file.txt";
    String currentDir = HOME;
    File file = new File(HOME);
    String rout = file.getParent();


    public void run() {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
//            file.mkdirs();
//            file.delete();

            List<Person> people = new ArrayList<>();
            people.add(new Person("Martin", "Aston", 24));
            people.add(new Person("Tati", "Deva", 41));
            people.add(new Person("Tom", "Smith", 37));
            people.add(new Person("Kat", "Chester", 29));
            people.add(new Person("Kat", "Chester", 29));


            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(currentDir));) {

                System.out.println(currentDir);
                for (Person unit : people) {
//                    System.out.println(unit);
                    bufferedWriter.append(unit.toString() + "\n");


                }
                bufferedWriter.flush();
                bufferedWriter.close();
            }

            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(currentDir));) {
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    String[] data = line.split(" ");
                    String name = data[0];
                    String surname = data[1];
                    int age = Integer.parseInt(data[2]);
                    Person person = new Person(name, surname, age);
                    people.add(person);
                }
            }

            for (Person p : people) {
                System.out.println(p.toString());
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

/////////////////READ & WRITE FILE/////////////////////
/*
/////////////////////readFile()///////////////////////
        private void readFile() throws IOException {
        FileReader fileReader = new FileReader(file);

//        int data = fileReader.read();
//        char symbl = (char) data;

        int l = (int) file.length();
        char[] buffer = new char[l];
        int count = fileReader.read(buffer);
//        System.out.println(symbl);
        String s = Arrays.toString(buffer);
        System.out.println(s);

        fileReader.close(); // close file


//        try (BufferedReader bufferedReader = new BufferedReader(new FileWriter(file.txt))){}
//        BufferedReader br = new BufferedReader(new FileReader(currentDir));
//        String line;
//        while ((line = br.readLine()) != null) {
//            System.out.println(line);
//        }
//        br.close();
//        String s;
    }

/////////////////writeFile()///////////////////////
    private void writeFile() throws IOException {
        FileWriter fileWriter = new FileWriter(file, true);

//            fileWriter.write('O');

        Prepared cloud = new Prepared();
//            for (Character p : cloud.arr) {
//                System.out.print(p + " ");
//            }
        String s = "Hello Java !";
        fileWriter.write(s);


        fileWriter.flush(); // force buffer clear
        fileWriter.close(); // close file


//            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.txt))){}
//            BufferedWriter bw = new BufferedWriter(new FileWriter(currentDir));
//            bw.newLine();
////            bw.write("Java learning in progress");
//            bw.append("Java learning in progress");
//            bw.flush();
//            bw.close();
    }

    private void printCurrentDir() {
        System.out.println("curDir: " + currentDir);
    }
*/
}

class Prepared {

    char[] arr = new char[90 - 65 + 1];

    public Prepared() {
        fillArr();
    }

    void fillArr() {
        for (int i = 0, val = 65; i < arr.length; i++, val++) {
            arr[i] = (char) val;
        }
    }

}

class Person {
    String name;
    String surname;
    int age;


    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person() {

    }

    @Override
    public String toString() {
        return name + ' ' + surname + ' ' + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
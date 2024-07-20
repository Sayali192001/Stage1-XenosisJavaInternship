package Level1;

import java.util.Scanner;

public class Person {
    String name;
    int age;
    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //gette r
    public String getName() {
        return name;
    }
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //displaying the info
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of a person:");
        String name=sc.nextLine();
        System.out.println("Enter the age of that person:");
        int age=sc.nextInt();
        Person person=new Person(name,age);
        person.display();
    }
}




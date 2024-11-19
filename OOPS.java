
class Pen {
    String color;
    String type;

    public void write() {
        System.out.println("Writing something");
    }

    public void printcolor()
    {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student()
    {
        System.out.println("this is a constructor");
    }
}

public class OOPS {
    public static void main(String args[]) {
        Student s1=new Student();
        s1.name="akshita";
        s1.age=18;

        s1.printInfo();
    }
}

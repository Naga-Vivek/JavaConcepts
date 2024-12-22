package JavaBasics.TypesOfInterfaces;

interface Animal {
    void eat();
    void sleep();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat is eating");
    }
    public void sleep() {
        System.out.println("Cat is sleeping");
    }
}

public class normalInterfaceDemo {
    public static void main(String args[]){
        Animal a = new Dog();
        a.eat();
        a.sleep();
        Animal a1 = new Cat();
        a1.eat();
        a1.sleep();

    }
}

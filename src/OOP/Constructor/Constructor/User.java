package OOP.Constructor.Constructor;

import java.util.Objects;

/**
 * Created by Dmytro on 19.06.2015.
 */
public class User {
    private String name;
    private int age;

    public User() {
    }

    public User(int age) {
        this.age = age;
        System.out.println("age:"+age);
        System.out.println("this.age:"+this.age);
    }

    public User(String name) {
        this(12);// викликаємо котструктор  public User(int age)
        //повинно бути на першому місці
        System.out.println("this.name:" + this.name);
        this.name = name;
        System.out.println("name:" + name);
        System.out.println("this.name:" + this.name);
        //Object o=new Object();

    }
}

class Test {
    public static void main(String[] args) {
        new User("A");
    }
}
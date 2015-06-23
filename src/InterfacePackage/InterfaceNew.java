package InterfacePackage;

/**
 * Created by Dmytro on 23.06.2015.
 */
public interface InterfaceNew {
    public static String MESSAGE_HELLO = "HELLO";
    String MESSAGE_BAY = "BAY";

    void print(String mes);

    void print(String mes, int num);

    void mess();
}

class Main {
    public static void main(String[] args) {
        User user = new User("Dima", 22, "Dmytro.Chernenko@gmail.com");

        System.out.println(user);
        System.out.println(user.equals(new User("Dima", 22, "Dmytro.Chernenko@gmail.com")));
        System.out.println(user.hashCode());
        System.out.println(user.MESSAGE_HELLO);
        System.out.println(user.MESSAGE_BAY);
        user.mess();
    }
}

class User implements InterfaceNew {
    public int age;
    protected String email;
    private String name;

    public User(String name, int age, String email) {

        this.name = name;
        this.age = age;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (age != user.age) return false;
        if (email != null ? !email.equals(user.email) : user.email != null) return false;
        if (name != null ? !name.equals(user.name) : user.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        System.out.println("result=" + result);
        result = 31 * result + age;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void print(String mes) {
        System.out.println(mes);
    }

    @Override
    public void print(String mes, int num) {
        System.out.println(mes);
        System.out.println(num);
    }

    @Override
    public void mess() {
        System.out.println(this.getClass());
    }

}

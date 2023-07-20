package week5;

public class Dog {
    int age;
    String name;
    double weight;
    boolean isHappy;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 10.0;
        this.isHappy = true;
    }

    public void eat(double amount) {
        this.weight += amount;
    }

    public void happyBirthday() {
        this.age++;
    }

    public static void bark() {
        System.out.println("woof woof");
    }
}

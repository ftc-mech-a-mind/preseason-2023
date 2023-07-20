package week5;

public class Main {
    public static void main(String[] args) {
        Dog doug = new Dog("Doug", 3);
        doug.eat(0.5);
        doug.happyBirthday();
        System.out.println(doug.age);

        Dog.bark(); // This works without using an object because the method is static

        if (doug.isHappy) {
            System.out.println("Doug is happy!");
        } else {
            System.out.println("Doug is not happy");
        }

        if (doug.age > 2) {
            System.out.println("Doug is older than 2");
            // this wil print if doug.age is greater than 2, but not if it is equal to 2
        } else if (doug.age <= 1) {
            System.out.println("Doug is a puppy");
            // This will print if doug.age is less than or equal to 1
        } else if (doug.age == 2) {
            System.out.println("Doug is 2 years old");
            // This will print if doug.age is exactly equal to 2
        } else if (doug.age != 0) {
            System.out.println("Doug is not 0 years old");
            // This won't print, because at least one of the other conditions is already true
        }

        // AND
        if (doug.isHappy && doug.age < 10){
            System.out.println("Doug is young and happy");
            // This will run only if both doug.isHappy is true AND doug.age is less than 10
        }

        // OR
        if (doug.isHappy || doug.age < 10) {
            System.out.println("Doug is either young or happy");
            // This will run if either doug.isHappy is true OR doug.age is less than 10
            // Either one could be true, or both could be true
        }

        // NOT
        if (!doug.isHappy) {
            System.out.println("Doug is not happy");
            // This will run if doug.isHappy is false
        }

        // WHILE LOOP
        while (doug.age < 10) {
            doug.age++;
            // This will loop and increase doug's age until it is 10
        }

        // FOR LOOP
        for (int i = 0; i < 10; i++) {
            // before the loop starts, it creates an int called i
            // it checks if i is less than 10, and if it's not then the loop breaks (condition like a while loop)
            System.out.println(i);
            // every time the loop runs, it increments i by 1
        }

        // WHILE LOOP
        int j = 0;
        while (j < 10) {
            System.out.println(j);
            j++;
        } // this does the same as the for loop above
    }
}

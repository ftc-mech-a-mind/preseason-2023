public class Strings {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        //this will print out "JohnDoe"
        //we can add a space between the first and last name by adding a space in between

        String fullNameWithSpace = firstName + " " + lastName;
        System.out.println(fullNameWithSpace);
        //this will print "John Doe"

        System.out.println(firstName);
        //this will print out "John"
        firstName += "athon";
        System.out.println(firstName);
        //this will now print out "Johnathon"

        System.out.println(firstName + " is " + 18 + " years old");
        //this will print out "Johnathon is 18 years old"

        int nameLength = firstName.length();
        System.out.println("length of name: " + nameLength);
        System.out.println("First character: " + firstName.charAt(0));
        //this will print out the first letter of the name, which is "J"
        System.out.println(firstName.toUpperCase());
        //this will print out "JOHNATHON", but the variable firstName will still be "Johnathon"
    }
}

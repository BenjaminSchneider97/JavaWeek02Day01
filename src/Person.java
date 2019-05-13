


// A00
public class Person {

    String firstName;
    String familyName;

    public Person(String name, String lastName){
        this.firstName = name;
        this.familyName = lastName;
    }

    public void printFullName(){
        System.out.println(this.firstName + " " + this.familyName.toUpperCase());
    }
}

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person("Jenny", "Tang");
        Person person2 = new Person("Benjamin", "Schneider");
        Person person3 = new Person("Simon", "Blaha");
        Person person4 = new Person("Annina", "Henninger");
        Person person5 = new Person("Christian", "Simic");
        Person person6 = new Person("Judith", "Lang-Ladurner");

        Person[] fullnames = {person1, person2, person3, person4, person5, person6};

        for(int i = 0; i < fullnames.length; i++){
            fullnames[i].printFullName();
        }
    }
}

public class Main {

    public static void main(String[] args) {

        /*
        Person person1 = new Person("Jenny", "Tang");
        Person person2 = new Person("Benjamin", "Schneider");
        Person person3 = new Person("Simon", "Blaha");
        Person person4 = new Person("Annina", "Henninger");
        Person person5 = new Person("Christian", "Simic");
        Person person6 = new Person("Judith", "Lang-Ladurner");

        Person[] fullnames = {person1, person2, person3, person4, person5, person6};

        for(int i = 0; i < fullnames.length; i++){
            fullnames[i].printFullName();
        } */



        movies m1 = new movies (8.9, "2019-05-13" ,"16:30" , "Avengers 4", 1);
        movies m2 = new movies (9.9, "2019-05-14" ,"17:30" , "Avengers 3", 2);
        movies m3 = new movies (7.9, "2019-05-15" ,"18:30" , "Avengers 2", 5);
        movies m4 = new movies (6.9, "2019-05-13" ,"19:30" , "Avengers", 8);

        movies[] allMovies = {m1,m2,m3,m4};
        for ( int i = 0; i <allMovies.length; i++){
            allMovies[i].getTotalPrice();
        }

    }
}

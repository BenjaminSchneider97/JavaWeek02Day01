public class Main {

    public static void main(String[] args) {

        /* A00
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


        /* A01
        movies m1 = new movies (8.9, "2019-05-13" ,"16:30" , "Avengers 4", 1);
        movies m2 = new movies (9.9, "2019-05-14" ,"17:30" , "Avengers 3", 2);
        movies m3 = new movies (7.9, "2019-05-15" ,"18:30" , "Avengers 2", 5);
        movies m4 = new movies (6.9, "2019-05-13" ,"19:30" , "Avengers", 8);

        movies[] allMovies = {m1,m2,m3,m4};

        for(int i = 0; i < allMovies.length; i++){
            allMovies[i].getAllMovies();
        }

        double totalprice = 0;

        for ( int i = 0; i <allMovies.length; i++){
            totalprice += allMovies[i].price;
        }

        System.out.println("The total price is: " + totalprice);
         */

        /*
        // A03
        BankAccount account1 = new BankAccount(5000, 0);
        BankAccount account2 = new BankAccount(6000,1);
        BankAccount account3 = new BankAccount(7000,3);

        BankAccount[] allAccounts = {account1, account2, account3};

        account1.addMoney(-5);
        account2.withdrawMoney(500);
        account3.addMoney(200);


        for (int i = 0; i < allAccounts.length; i++){
            allAccounts[i].getAccountBalance();
        }
*/

        // A4
        TimeClass time1 = new TimeClass(23, 59, 10);

        time1.printTime();
        time1.addSecond(60);
        time1.printTime();


    }
}

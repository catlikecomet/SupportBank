package training.supportbank;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;


public class Main {


    public static void main(String args[]) throws IOException {

        List<String> line = Files.readAllLines(Paths.get("Transactions2014.csv"), Charset.forName("windows-1252"));
        line.remove(0);
        ArrayList<Person> people = new ArrayList<Person>();
        int userIndex = 0;
        int x;

        for (int i = 0; i < line.size(); i++) {

            String[] items = line.get(i).split(",");


            if (checkUserExists(people, items[1])) {
                //people.get(people.size() - 1).changeBalance(new BigDecimal(people.));

/*
                //We need to loop backwards through the person record from this point until we get the same name again and then add the value
                people.get(people.size() - 1).addToBalance(new BigDecimal(items[4]));
                for (x = i; x > -1; x--) {
                    if (x==0) {
                        break;
                    }
                    // Check the persons name and if a match then we have a match
                    if (people.get(x).getName().contains(items[1])) { // Getting the name of the previous record and comparing for a match
                        System.out.println("MATCH: " + people.get(x).getName());
                        // Then get amount from x indexed record and add to current records amount
                        people.get(x).addToBalance(new BigDecimal(items[4]));

                        break;
                    }
                }

*/

            } else {
                people.add(new Person(items[1]));
                people.get(people.size() - 1).changeBalance(new BigDecimal(items[4]));


            }


        }

        for (Person record : people) {
            System.out.println(record.getName() + " has a balance of: " + record.getBalance());

        }


    }

    private static boolean checkUserExists(ArrayList<Person> people, String userName) {
        boolean userExists = false;
        int l;
        for (l = 0; l <= people.size() - 1; l++) {

            if (people.get(l).getName().equals(userName)) {
                userExists = true;
            }
        }
        return userExists;
    }
}







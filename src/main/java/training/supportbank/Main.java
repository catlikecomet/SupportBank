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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String args[]) throws IOException {

        List<String> line = Files.readAllLines(Paths.get("Transactions2014.csv"), Charset.forName("windows-1252"));
        line.remove(0);
        ArrayList<Person> people = new ArrayList<Person>();
        int userIndex = 0;

        for (int i = 0; i < line.size(); i++) {

            String[] items = line.get(i).split(",");


            if (checkUserExists(people, items[1])) {
                people.get(people.size() - 1).getBalance().add(new BigDecimal(items[4]));
            } else {
                people.add(new Person(items[1]));
                people.get(people.size() - 1).changeBalance(new BigDecimal(items[4]));


            }


        }

        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i).getName()+" has a balance of: "+people.get(i).getBalance());


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







package training.supportbank;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Main {

    private static final Logger LOGGER = LogManager.getLogger();

    public static void main(String args[]) throws IOException {
        List<String> line = Files.readAllLines(Paths.get("Transactions2014.csv"), Charset.forName("windows-1252"));
        line.remove(0);
        ArrayList<Person> people = new ArrayList<Person>();
        ArrayList<Transaction> transactions = new ArrayList<Transaction>();


        for (int i = 0; i < line.size(); i++) {

            String[] items = line.get(i).split(",");


            if (!checkUserExists(people, items[1])) {
                people.add(new Person(items[1]));
            }
            if (!checkUserExists(people, items[2])){
                people.add(new Person(items[2]));
            }


            for(int x = 0; x < people.size(); x++){
                if (people.get(x).getName().equals(items[1])){
                    people.get(x).subtractBalance(items[4]);
                } else if (people.get(x).getName().equals(items[2])) {
                    people.get(x).addBalance(items[4]);
                }
            }
        }

        for (Person record : people) {
            System.out.println(record.getName() + " has a balance of: " + record.getBalance());

        }


    }


    private static boolean checkUserExists(ArrayList<Person> people, String userName) {
        boolean userExists = false;
        int l;
        for (l = 0; l < people.size(); l++) {

            if (people.get(l).getName().equals(userName)) {
                userExists = true;
            }
        }
        return userExists;
    }

}







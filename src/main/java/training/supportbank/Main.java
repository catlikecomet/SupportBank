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

        for(int i = 0; i < line.size(); i++) {
            System.out.println(people.size());
            boolean userExists = false;
            int userIndex;
            String[] items = line.get(i).split(",");

            for (int l = 0; l <= people.size() - 1; l++){

                if (people.get(l).getName().equals(items[1])) {
                    userExists = true;
                    userIndex = l;
                }

            }
                 if (userExists == true){


                 }else {
                     people.add(new Person(items[1]));
                 }

        }

    }
}

                /*each.name = items[1];


                each.balance = new BigDecimal(items[4]);

                System.out.println(each.name);
                System.out.println(each.balance);*/



               /* Transaction eachTransaction = new Transaction();
                eachTransaction.date = new Date(items[0]);
                eachTransaction.toName = each.name;
                eachTransaction.fromName = items[2];
                eachTransaction.narrative = items[3];*/




package training.supportbank;

import java.io.IOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String args[]) throws IOException {

        List<String> transactions = Files.readAllLines(Paths.get("Transactions2014.csv"), Charset.forName("windows-1252"));

        for(String seperate: transactions) {

            System.out.println(seperate);

            Person each = new Person();

        /*Person Jon = new Person();
        Jon.name = "Jon A";
        Jon.balance = new BigDecimal("7.8");


        System.out.println(Jon.name);
        System.out.println(Jon.balance);*/

        }





    }
}

package training.supportbank;

import javax.imageio.IIOException;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {


    /*class person {
        String name;
        BigDecimal balance;
    }

    class transfer {
        Date dates;
        BigDecimal initialbalance;
        BigDecimal newbalance;

    }*/

    public static void main(String args[]) {


        List<String> transactions = Files.readAllLines(Paths.get("Transactions2014.csv"), Charset.forName("windows-1252"));

        try {
            List<String> lines = Files.readAllLines(transactions);
            for (String line : lines) {
                System.out.println(line);
            }
        }catch (IIOException e) {
            System.out.println(e);
        }



        // Your code here!
        System.out.println("Test!");
    }
}

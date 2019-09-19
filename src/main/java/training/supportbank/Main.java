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

        for(int i = 0; i < line.size(); i++) {



            if(i>0){
                String[] items = line.get(i).split(",");


                Person each = new Person();
                each.name = items[1];
                each.balance = new BigDecimal(items[4]);
                System.out.println(each.name);
                System.out.println(each.balance);


            }

        }

    }
}

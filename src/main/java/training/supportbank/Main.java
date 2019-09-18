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

        List<String> list = Files.readAllLines(Paths.get("Transactions2014.csv"), Charset.forName("windows-1252"));

        for(int i = 0; i < list.size(); i++) {
            list.get(i).split((","));



        Person each = new Person();
        each.name = list.get(1);



        System.out.println(each.name);


        }





    }
}

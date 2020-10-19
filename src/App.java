import time.Time1;
import time.Time2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

import static java.lang.Math.*;

public class App {

    private static final Time1 t3 = Time1.create(12);
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args){

        cos(34);
        sin(34);

        try {
            Time2 t1 = new Time2(23);
            Time2 t2 = new Time2(t1);

            t3.setTime(13,0,0);;

//            t1.setTime(13,34,34);
            System.out.println(t1);
            System.out.println(t3);
        }
        catch(Exception e){
            System.out.println("An error occurred: " + e.getMessage());
        }

        LocalDate t2 = LocalDate.of(2019,10,5);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMM, yyyy");
        System.out.println(formatter.format(t2));

        for(Book b: Book.values()) {
            System.out.println(b.getTitle());
        }
        System.out.println(Book.JHTP.getTitle());

    }
}
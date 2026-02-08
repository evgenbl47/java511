package hWork;

import java.util.*;
import java.util.stream.Collectors;

public class Home {
    List<String> list = new ArrayList<>();
    List<Integer> example = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //    Реализовать пагинацию
    int totalMovies = 30;
    int view = 3; // skolko filmov na 1 stranicu
    int pageSize = totalMovies / view; //  skolko vseqo filmov podskazka totalMovies/view
    int page = 5;  // kakaya stranica



    public void start() {


        for (int i = 1; i <= totalMovies; i++) {
            list.add("Movie #" + i);
        }
        do {
            sc = new Scanner(System.in);
            for (int i = 1; i <= pageSize; i++) {
                System.out.print(i + " ");
            }
            System.out.println();  // Otobrazitsa vozmojnie stranici
            int page = sc.nextInt();
            //choice

            list.stream().limit(10).forEach(System.out::println); // pecataet pravilniy diapazon

            //
        } while (true);


    }


}

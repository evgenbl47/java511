package hWork;

import java.util.*;

public class Home {
    List<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    //    Реализовать пагинацию
    int totalMovies = 10; //общее количество фильмов
    int pageCapacity = 3; // Фильмов на одной странице
    int totalPage = totalMovies / pageCapacity;  //Количество страниц
    int currentPage = 1;  // kakaya stranica



    public void start() {


        for (int i = 1; i <= totalMovies; i++) {
            list.add("Movie #" + i);
        }
        do {
              currentPage = Integer.parseInt(sc.next());
            if (currentPage < 1 || currentPage >= totalMovies / totalPage) {
                System.out.println("page is unreacheble");
                continue;
            }
            System.out.println("--- Страница " + currentPage + " ---");
            list.stream()
                    .skip((long) (currentPage - 1) * totalPage)
                    .limit(pageCapacity)
                    .forEach(System.out::println);

            if (currentPage * totalPage >= totalMovies) {
                System.out.println("it is a last page");
                break;
            }

        } while (true);


    }


}

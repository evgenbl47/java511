package exampl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CPrep {
    Scanner scanner = new Scanner(System.in);;
    List<String> list = new ArrayList<>();
    boolean run = true;
    int totalItems = 60;
    int currentPage;
    int itemsPerPage = 7;
    int pageAvailable = (int) Math.ceil((double) totalItems / itemsPerPage);
    //int totalPages = (totalItems + itemsPerPage - 1) / itemsPerPage;
    //int end = Math.min(start + pageSize - 1, total - 1);

    public void start() {
        for (int i = 1; i <= totalItems; i++) {
            list.add("Movie #" + i);
        }

        do {

            System.out.print("Page ");
            for (int i = 1; i <= pageAvailable; i++) {
                if (i == currentPage) {
                    if (currentPage < 10) {
                        System.out.print("\u001B[33m" + " |_| " + "\u001B[0m");
                    } else {
                        System.out.print("\u001B[33m" + " |__| " + "\u001B[0m");
                    }
                } else System.out.print(" |"+ i + "| ");
            }

            System.out.print("\nEnter paage number (or 0 to exit): ");
            currentPage = scanner.nextInt();

            if (currentPage == 0) {
                System.out.println("GoodBye");
                run = false;
                break;
            }

            if (currentPage < 0 || currentPage > pageAvailable) {
                System.out.println("Invalid page!");
                continue;
            }

            int startIndex = (currentPage - 1) * (itemsPerPage);

            System.out.println("--- Page " + currentPage + " ---");
            list.stream()
                    .skip(startIndex)
                    .limit(itemsPerPage)
                    .forEach(System.out::println);
        } while (run);

    }
}

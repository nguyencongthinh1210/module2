package ss01_introduction_java.exercise;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double USD,VND;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter USD: ");
        USD = Double.parseDouble(scanner.nextLine());
        VND = 23000 * USD;
        System.out.println("USD to VND = " +VND);
    }
}

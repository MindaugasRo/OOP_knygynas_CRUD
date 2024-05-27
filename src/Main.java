import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author1 = new Author(12, "Mindaugas", "Ročys");

        ArrayList<Author> authorList = new ArrayList();

        Scanner sc = new Scanner(System.in);


        while (true) {
            menuOptionsMessage();
            int item = numberInput(sc);
            sc.nextLine();

            switch (item) {
                case 1:
                    Author.createAuthor(authorList,sc);
                    break;
                case 2:
                    Author.readList(authorList,sc);
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    programExit();
                default:
                    System.out.println("Įveskite skaitmenį iš patekto meniu");


            }

        }
    }
    public static void menuOptionsMessage() {
        System.out.println();
        System.out.println("---------------");
        System.out.println(" 1 - Įvesti naują autorių");
        System.out.println(" 2 - Rodyti autorių sąrašą");
        System.out.println(" 3 - Redaguoti autorių sąrašą");
        System.out.println(" 4 - Ištrinti autorių");
        System.out.println(" 5 - Stabdyti programą");
        System.out.println("---------------");
    }

    public static int numberInput(Scanner sc) {
        while (true) {
            try {
                return sc.nextInt();
            } catch (Exception e) {
                System.out.println("Įveskite savo pasirinkimą skaitmenimis");
                sc.nextLine();
            }
        }
    }

    public static void programExit () {
        System.out.println("Programa uždaryta");
        System.exit(1);
    }

}
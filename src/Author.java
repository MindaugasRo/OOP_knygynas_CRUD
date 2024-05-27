import java.util.ArrayList;
import java.util.Scanner;

public class Author {
    private long id;
    private String name;
    private String sureName;

    public Author() {

    }

    public Author(long id, String name, String sureName) {
        this.id = id;
        this.name = name;
        this.sureName = sureName;
    }

    //Geteriai ir seteriai

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSureName() {
        return sureName;
    }

    public void setSureName(String sureName) {
        this.sureName = sureName;
    }

    // Create Array list
    public static void createAuthor(ArrayList<String> authorList, Scanner sc) {
        while(true) {
            System.out.println("Įveskite naują autorių");
            String input = sc.nextLine();
            if (authorList.contains(input)) {
                System.out.println("Įvestas autorius jau egzistuoja");
            } else
                authorList.add(input);
            break;
        }
    }


    // Read Array list
    public static void readList(ArrayList<String> authorList, Scanner sc) {
        System.out.println("------ Autorių sąrašas ------");
        for (int i = 0; i < authorList.size(); i++) {
            System.out.println(authorList.get(i));
        }
        System.out.println("------------------");
        if (authorList.isEmpty()) {
            System.out.println("Sąrašas yra tuščias");
            createAuthor(authorList, sc);
        }
    }


}

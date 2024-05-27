import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Author {
    private long id;
    private String name;
    private String surName;

    public Author() {

    }

    public Author(long id, String name, String sureName) {
        this.id = id;
        this.name = name;
        this.surName = sureName;
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

    public String getSurName() {
        return surName;
    }

    public void setSurName(String sureName) {
        this.surName = sureName;
    }

    // Create Array list
    public static void createAuthor(ArrayList<Author> authorList, Scanner sc) {
            System.out.println("Naujo autoriaus įvedimas");
            System.out.println("Įveskite autoriaus ID skaitmenimis");
            int id = sc.nextInt();
            sc.nextLine();
            boolean unique = true;
            for (int i = 0; i < authorList.size(); i++) {
                if (authorList.get(i).id == id) {
                    unique = false;
                    break;
                }
            }
            if (!unique) {
                System.out.println("!!! Įvestas autoriaus ID jau egzistuoja !!!");
                System.out.println(" _____________________________________ ");
                createAuthor(authorList, sc);
            } else {
                Author newAuthor = new Author();
                newAuthor.id = id;
                System.out.println("Įveskite autoriaus vardą");
                newAuthor.name = sc.nextLine();
                System.out.println("Įveskite autoriaus pavardę");
                newAuthor.surName = sc.nextLine();
                authorList.add(newAuthor);
            }
    }

//    @Override
//    public int hashCode() {
//        return Objects.hashCode(id);
//    }

    @Override
    public boolean equals(Object obj) {
        Author a = (Author) obj;
        return this.id == a.id;
    }

    @Override
    public String toString() {
        return  "ID [ " + id + " ]" +
                " " + name +
                " " + surName ;
    }

    // Read Array list
    public static void readList(ArrayList<Author> authorList, Scanner sc) {
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

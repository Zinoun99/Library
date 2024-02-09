
import java.awt.*;
import java.util.*;
import java.util.List;

public class Library {
    static List<Book> livres;
    List<Student> apprenants;



    public List<Book> GetListLivre(){
        return this.livres;
    }
    public List<Student> GetListApprenants(){
        return this.apprenants;
    }
    public static boolean rechercherLivre(String title){
        for (Book livre : livres) {
            if (livre.getTitle() == livre.title) {
                return true;
            }
        }
        return false;
    }

    public boolean ajouterLivre(Book livre){
        if(rechercherLivre(livre.getTitle())){
            System.out.println("Ce livre déja existe");
            return false;
        }
        else {
            livres.add(livre);
            return true;
        }
    }
    public boolean supprimerLivre(String title){
        for (Book livre : livres){
            if(livre.getTitle().equals(title)){
                livres.remove(livre);
                System.out.println("le livre a été supprimé");
                return true;
            }
        }
        System.out.println("le livre n'existe pas");
        return false;
    }

    public void reservation(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("entrer the name of book :");
        String nameBook = scanner.nextLine();
        Book book1 = new Book();
        for(Book book : livres){
            if (book.title.equalsIgnoreCase(nameBook)){
                System.out.println("Entre the name of student!");
                String idStudent = scanner.nextLine();
                for(Student student : apprenants){
                    if(student.Nom.equalsIgnoreCase(idStudent)){
                        book.student = student; /* Reservation*/
                        student.books.add(book);
                    }
                }
                /* il rsete la reservation d'un book déja reservé, il faut que afficher error car le book est reservé'*/
            }
        }
    }
}



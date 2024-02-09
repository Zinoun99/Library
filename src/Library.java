
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
}

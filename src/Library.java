import java.util.*;
public class Library{
    ArrayList <Book> livres = new ArrayList<>();
    ArrayList <Student> students = new ArrayList<>();

    public boolean rechercherLivre(String titre_livre){
        for (Book livre : livres) {
            if (livre.titre.equals(titre_livre)) {
                return true;
            }
        }
        return false;
    }
    public void ajouterLivre() {
        Scanner scanner = new Scanner(System.in);
        Book nouveauLivre = new Book();
        System.out.println("Entrez le titre de livre:");
        String titre = scanner.nextLine();
        while (rechercherLivre(titre)) {
            System.out.println("Livre déjà existe! Veuillez entrer un nouveau titre: ");
            titre = scanner.nextLine();
        }
        nouveauLivre.titre = titre;
        System.out.println("Entrez l'auteur de livre:");
        nouveauLivre.auteur = scanner.nextLine();

        System.out.println("Entrez l'isbn du livre:");
        nouveauLivre.isbn = scanner.nextLine();

        System.out.println("Entrez l'année de publication:");
        nouveauLivre.annee = scanner.nextInt();
        livres.add(nouveauLivre);
        System.out.println("Le livre a été ajouté!");
    }

    public void afficherLivre(){
        for (Book book : livres) {
            System.out.println("Titre :  " + book.titre );
            System.out.println("Auteur :  " + book.auteur);
            System.out.println("Isbn :" + book.isbn);
            System.out.println("Année :  " + book.annee);
            System.out.println("-----------------------");
        }

    }

    public void supprimerLivre() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le titre de livre à supprimer :");
        String supprime = scanner.nextLine();

        for (int i = 0; i < livres.size(); i++) {
            Book livre = livres.get(i);
            if (livre.titre.equals(supprime)) {
                livres.remove(i);
                System.out.println("Livre a été supprimer! ");
                i--;
            }
        }
    }


    public void Rechercher() {
        if (livres.isEmpty()){
            System.out.println("Biblio est vide !");
        }
        else {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez le titre de livre à cherché !: ");
            String titre1 = scanner.nextLine();
            for (Book livre : livres) {
                if (livre.titre.equalsIgnoreCase(titre1)) {
                    System.out.println("Titre de livre :  " + livre.titre);
                    System.out.println("l'auteur :" + livre.auteur);
                    System.out.println("Isbn :  " + livre.isbn);
                    System.out.println("annee de livre :  " + livre.annee);
                }
            }

        }
    }

    public void modifierLivre() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le titre du livre à modifier: ");
        String titre = scanner.nextLine();
        boolean livreTrouve = false;
        for (Book livre : livres) {
            if (livre.titre.equalsIgnoreCase(titre)) {
                livreTrouve = true;
                System.out.println("Entrez le nouveau titre du livre: ");
                livre.titre = scanner.nextLine();

                System.out.println("Entrez le nouveau auteur du livre: ");
                livre.auteur = scanner.nextLine();

                System.out.println("Entre le nouveau ISBN du livre: ");
                livre.isbn = scanner.nextLine();

                System.out.println("Entrez la nouvelle année de publication (YYYY): ");
                livre.annee = scanner.nextInt();

                System.out.println("Le livre a été modifié avec succès!");
                return;
            }
        }
        if (!livreTrouve) {
            System.out.println("Le livre n'existe pas.");
        }
    }

    public void ajouterStudent(){
        Scanner scanner = new Scanner(System.in);
        Student nouveauStudent = new Student();

        System.out.println("Entrez le nom de l'étudiant :");
        nouveauStudent.Nom = scanner.nextLine();

        System.out.println("Entrez l'adresse de l'étudiant :");
        nouveauStudent.adresse = scanner.nextLine();

        System.out.println("Entrez le numero de l'étudiant :");
        nouveauStudent.numero = scanner.nextInt();
        System.out.println("Entrez Id de l'étudiant :");
        nouveauStudent.Id = scanner.nextInt();

        students.add(nouveauStudent);

        System.out.println("Student a été ajouté!");
    }


    public void reservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le titre du livre à réserver: ");
        String titreLivre = scanner.nextLine();

        // Recherche du livre dans la liste des livres de la bibliothèque
        Book livreAReserver = null;
        for (Book livre : livres) {
            if (livre.titre.equalsIgnoreCase(titreLivre)) {
                livreAReserver = livre;
                break;
            }
        }

        // Vérifie si le livre est trouvé
        if (livreAReserver == null) {
            System.out.println("Le livre n'existe pas.");
            return;
        }

        // Vérifie si le livre est déjà réservé
        if (livreAReserver.student != null) {
            System.out.println("Le livre est déjà réservé par " + livreAReserver.student.Nom);
            return;
        }

        // Recherche de l'étudiant dans la liste des apprenants de la bibliothèque
        System.out.print("Entrez le nom de l'étudiant: ");
        String nomEtudiant = scanner.nextLine();
        Student etudiant = null;
        for (Student student : students) {
            if (student.Nom.equalsIgnoreCase(nomEtudiant)) {
                etudiant = student;
                break;
            }
        }

        // Vérifie si l'étudiant est trouvé
        if (etudiant == null) {
            System.out.println("L'étudiant n'existe pas.");
            return;
        }

        // Effectue la réservation en associant l'étudiant au livre
        livreAReserver.student = etudiant;
        etudiant.books.add(livreAReserver);

        System.out.println("La réservation du livre " + titreLivre + " par " + etudiant.Nom + " est terminée.");
    }

    public void afficherReservations() {
        System.out.println("Liste des réservations en cours :");
        for (Book livre : livres) {
            if (livre.student != null) {
                System.out.println("Livre : " + livre.titre + ", Réservé par : " + livre.student.Nom);
            }
        }
    }

}
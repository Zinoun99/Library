import java.time.LocalDate;
import java.util.Scanner;

public class Menu {
    private Library library;

    public Menu(Library library) {
        this.library = library;
    }

    public void afficherMenu() {
        System.out.println("Menu:");
        System.out.println("1. Ajouter un livre");
        System.out.println("2. Ajouter un étudiant");
        System.out.println("3. Supprimer un livre");
        System.out.println("4. Rechercher un livre");
        System.out.println("5. Afficher un livre");
        System.out.println("6. Modifier un livre");
        System.out.println("7. Faire une reservation");
        System.out.println("8. Afficher les reservations");
        System.out.println("9. Quitter");
    }

    public void gererMenu() {
        Scanner scanner = new Scanner(System.in);
        int choix = 0;

        do {
            afficherMenu();
            System.out.print("Entrez votre choix : ");
            choix = scanner.nextInt();
            scanner.nextLine(); // Pour consommer la ligne en trop après le nextInt()

            switch (choix) {
                case 1:
                    library.ajouterLivre();
                    break;
                case 2:
                    library.ajouterStudent();
                    break;
                case 3:
                   library.supprimerLivre();
                    break;
                case 4:
                    library.Rechercher();
                    break;
                case 5:
                    library.afficherLivre();
                    break;
                case 6:
                    library.modifierLivre();
                    break;
                case 7:
                    library.reservation();
                    break;
                case 8:
                    library.afficherReservations();
                    break;

                default:
                    System.out.println("Choix invalide. Veuillez choisir un nombre entre 1 et 8.");
            }
        } while (choix != 9);
    }

}

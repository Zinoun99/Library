import java.util.Scanner;

public class Menu {
    public void afficherMenu() {
        System.out.println("Bienvenue dans la bibliothèque !");
        System.out.println("1. Afficher la liste des livres");
        System.out.println("2. Ajouter un livre");
        System.out.println("3. Rechercher un livre");
        System.out.println("4. Emprunter un livre");
        System.out.println("5. Retourner un livre");
        System.out.println("0. Quitter");
    }

    public int recueillirChoix() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez votre choix : ");
        return scanner.nextInt();
    }

    public void Choix(int choix) {
        switch (choix) {
            case 1:

                break;
            case 2:

                break;
            case 3:
                // Appeler une méthode pour rechercher un livre
                break;
            case 4:
                // Appeler une méthode pour emprunter un livre
                break;
            case 5:
                // Appeler une méthode pour retourner un livre
                break;
            case 0:
                System.out.println("Merci d'avoir utilisé la bibliothèque. Au revoir !");
                System.exit(0);
                break;
            default:
                System.out.println("Choix invalide. Veuillez réessayer.");
        }
    }
}


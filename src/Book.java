public class Book {
    String title;
    String auteur;
    int ISBN;
    int datePublication;


    public Book (){
        this.title=title;
        this.auteur=auteur;
        this.ISBN=ISBN;
        this.datePublication=datePublication;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(int datePublication) {
        this.datePublication = datePublication;
    }

    public String toString(){
        return title+" "+auteur+" "+ISBN+" "+datePublication;
    }
    Book recherche = new Book();
    String livre;
    public void modifierLivre(String title, String auteur, int ISBN, int datePublication){
        if(Library.rechercherLivre() ){

        }
    }
}

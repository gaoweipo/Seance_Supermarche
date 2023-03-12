public class Test {
    public static void main(String[] args) {
        Article a1=new Article("Art001","apple", 3.99, 500);
        Article a2=new Article("Art002", "banana", 0.68, 800);
        Article a3=new Article("Art003", "fraise", 2.99, 400);
        Article a4=new Article("Art004", "orange", 5.99, 200);
        a1.getNom();
        a2.setPrixHT(1.28);
        a3.approvisionner(50);
        a4.vendre(201);
        a1.vendre(100);

        a1.afficher();
        a2.afficher();
        a3.afficher();
        a4.afficher();
    }
}
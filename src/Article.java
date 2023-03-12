public class Article {
    private String reference;
    private String nom;
    private double prixHT;
    private int quantiteEnStock;
    public Article(String reference, String nom, double prixHT, int quantiteEnStock){
        this.reference=reference;
        this.nom=nom;
        this.prixHT=prixHT;
        this.quantiteEnStock=quantiteEnStock;
    }

    public String getReference() {
        return reference;
    }

    public String getNom() {
        return nom;
    }

    public double getPrixHT() {
        return prixHT;
    }

    public int getQuantiteEnStock() {
        return quantiteEnStock;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrixHT(double prixHT) {
        this.prixHT = prixHT;
    }

    public void setQuantiteEnStock(int quantiteEnStock) {
        this.quantiteEnStock = quantiteEnStock;
    }
    public int approvisionner(int nb){
        quantiteEnStock+=nb;
        return quantiteEnStock;
    }
    public int vendre(int nbVendre){
        if (nbVendre>quantiteEnStock){
            System.out.println("Vente non-réussite !");
        }else {
            quantiteEnStock-=nbVendre;
            System.out.println("Vente réussite et la quantité restante est: "+quantiteEnStock);
        }
        return quantiteEnStock;
    }
    public void prixTTC(int nb){
        double TTC=prixHT*nb*1.1497;
        System.out.println("Le prix total est: "+TTC);
    }
    public void afficher(){
        System.out.println("La reference: "+reference+", le nom: "+nom+", le prixHT: "+prixHT+", la quantité en stock: "+quantiteEnStock);
    }
}

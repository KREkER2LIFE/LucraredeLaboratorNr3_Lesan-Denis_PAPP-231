public class RezervareEvSpec extends Rezervare{
    static int pret_Pers = 200;
    static int taxa_ora = 50;

    public void rezerv_taxa(){
        System.out.println(" Taxa este de: " + (200 + ( DurataRez * 50))+" lei");
    }
}

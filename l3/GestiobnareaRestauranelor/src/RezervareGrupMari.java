public class RezervareGrupMari extends Rezervare{
    static int Pret_pers = 0;
    public void rezerv_grup(){
        if(NumarulDePersoane == 20){
            Pret_pers = 500;
        }else if(NumarulDePersoane > 20){
            Pret_pers = 500 + (NumarulDePersoane - 20) * 10;
        }else{
            System.out.println(" Rezervarea nu se face - Grupul de persoane este mic!");
        }
        System.out.println(" Pretul pentru grup mare este: " + Pret_pers + " lei");

    }
}

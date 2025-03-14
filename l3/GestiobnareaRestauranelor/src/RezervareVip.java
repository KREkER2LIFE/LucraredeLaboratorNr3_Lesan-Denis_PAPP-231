public class RezervareVip extends Rezervare{
    static int pret_Pers = 0;
    public void rezerv_vip(){
        if(NumarulDePersoane == 5){
            pret_Pers = 1000;
            System.out.println(" Sala nr 1-Vip");
        } else if (NumarulDePersoane > 5 && NumarulDePersoane < 10) {
            pret_Pers = 2000;
            System.out.println(" Sala nr 2-Vip");
        }else if(NumarulDePersoane > 10){
            pret_Pers = 5000;
            System.out.println(" Sala nr 3-Vip");

        }
        System.out.println(" Pretul pentru Rezervare-Vip este: " + pret_Pers + " lei");
    }
}

class RezervareZilnica extends Rezervare {
    static int pret_Pers = 0;

    public void rezerv_pers_num() {
        if (NumarulDePersoane == 2) {
            pret_Pers = 50;
        } else if (NumarulDePersoane == 1) {
            pret_Pers = 25;
        } else if (NumarulDePersoane > 2) {
            pret_Pers = 50 + (NumarulDePersoane - 2) * 20;
        } else {
            pret_Pers = 0;
        }
        System.out.println("Pretul pentru acest numar de persoane este: " + pret_Pers + " lei");
    }
}


import java.io.*;
import java.util.Objects;
import java.util.Vector;


public class Rezervare {
    static String TipRezervare = ""; //Global Variable
    static String NumeClient = "";
    static String DataSiOra;
    static int NumarulDePersoane;
    static int DurataRez;
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("Rezervari.txt"))) {
            String line;
            while ((line = br.readLine()) != null) { // Read each line
                if (!line.isEmpty()) {
                    String[] parts = line.split("\\s+"); // Split by spaces
                        TipRezervare = parts[0];
                        NumeClient = parts[1];
                        DataSiOra = parts[2];
                        NumarulDePersoane = Integer.parseInt(parts[3]);
                        DurataRez = Integer.parseInt(parts[4]);

                        Vector<Object> dataVector = new Vector<>();
                        dataVector.add(TipRezervare);
                        dataVector.add(NumeClient);
                        dataVector.add(DataSiOra);
                        dataVector.add(NumarulDePersoane);
                        dataVector.add(DurataRez);

                        for (Object obj : dataVector){
                            System.out.print(" "+obj+" ");
                        }

                        if (Objects.equals(TipRezervare, "RezervareZilnica")) {
                            RezervareZilnica rezZil = new RezervareZilnica();
                            rezZil.rezerv_pers_num();
                        } else if (Objects.equals(TipRezervare, "RezervareEvenimentSpecial")) {
                            RezervareEvSpec rezEv = new RezervareEvSpec();
                            rezEv.rezerv_taxa();
                        } else if (Objects.equals(TipRezervare, "RezervareGrupMare")) {
                            RezervareGrupMari rezGr = new RezervareGrupMari();
                            rezGr.rezerv_grup();
                        } else if (Objects.equals(TipRezervare, "RezervareVip")) {
                            RezervareVip rezer_vip = new RezervareVip();
                            rezer_vip.rezerv_vip();
                        }

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

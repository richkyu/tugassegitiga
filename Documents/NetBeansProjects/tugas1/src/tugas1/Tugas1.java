package tugas1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
/**
 *
 * @author Arsa Aryana
 * TGL : 2024 - 03 - 31
 */
public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader dtain = new BufferedReader (new InputStreamReader (System.in));
        
        Double luas;
        int al = 0;
        int ti = 0;
        String alas ="";
        String tinggi="";
        
        System.out.println("Hitung Luas Segitiga");
        
        try{
            System.out.print("Input Nilai Alas: ");
            alas = dtain.readLine();
            System.out.print("Input Nilai Tinggi: ");
            tinggi = dtain.readLine();
        }catch(IOException e) {
            System.out.println("ERROR!");
        }
        al = Integer.parseInt(alas);
        ti = Integer.parseInt(tinggi);
        
        // Proses hitungannya
        luas = 0.5 * al * ti;
       
        //outputnya
        System.out.println("Hasil Luas Segitiga: " + luas);
    }
    
}

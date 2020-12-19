
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file = new File("dosya.txt");
        try {
            fos = new FileOutputStream(file,true);//buradaki true yoksa oluştur varsa ekleyerek devam et anlamına geliyor.
            
            fos.write(65);
            fos.write(58);
            fos.write(85);
            
            byte [] arrayFos = {101,75,66,68,85,58,99};
            fos.write(arrayFos);
            //Bir Adet Stringi byte array olarak yazmak için == 
            
            String stringFos = "@prince/Hllbr";//bunlar kurduğumuz yapı için bir ascıı oluyor 
            
            byte [] stringFosArray = stringFos.getBytes();
            
            fos.write(stringFosArray);
            
        } catch (FileNotFoundException ex) {
            
            System.out.println("File Not Found Exception meydana geldi");
            
        } catch (IOException ex) {
            
            System.out.println("Dosya yazım işlemi gerçekleşirken bir hata meydana geldi");
            
        }finally{
            
            try {
                
                fos.close();
                
            } catch (IOException ex) {
                
                System.out.println("Dosya Kapatılırken bir hata meydana geldi.");
                
            }
        }
    }
}

package ders1__readingfiledemo1;

/*
öncelikle merhabalar yorum satırlarıyla sizlerin kafanızın karışmamasını amaçlamaktayım  umarım güzel anlatabilmişimdir kolay gelsin 

öncelikle dışardan gelen bayt cinsinden verileri karaktere dönüştürmek için InputStreamReader metodu kullanılır 

elimizde bulunan bir dosya varsa dosayanın içindeki verilere ulaşmak için FileReader metodu kullanılır


 bu programı yazmamızın nedeni hata yönetimi hakkında bilgi edinmek ve java da dışarıdan gelen verileri kulanabilmek 
programın amacı txt dosyasında bulunan sayıları toplamak 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 throws FileNotFoundException yazmamızın nedeni bu hatayı karşı taraf alacağımızı bilsin diye 

hata alacağımız kesin ya brada try catch şeklinde hata yönetimini kulanman gerek 

throws yazmamızın nedeni bu classı kulanan kişi try catch kulanması gerekecek 
 

ıoException yapmamızın nedeni finally de dosyayı kapatma komutu verdik eğer dosya bulunamaz ve açamazsak dosyayı kapatamayız o yüzden yaptık
 */
public class NewClass {

    public static void main(String[] args) {//throws IOException {
        BufferedReader reader = null;
        int total = 0;
        int değer1 = 0;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\samie\\OneDrive\\Belgeler\\NetBeansProjects\\Akademik2\\src\\ders1__readingfiledemo1\\a.txt"));//burada tırnak işareti ile yazılan kısım a.txt dosyasının konumunu belirtmek zorundadır 
            String line = null;
            while ((line = reader.readLine()) != null) {//readLine nin amacı 1 satırı okuma amacıyla yazılmıştır boş değilse true dönderir                 
                int değer = Integer.valueOf(line);
                total = total + değer;//bu string değerindeki elemanı ınteger değeriine çevirecek
                System.out.println(değer1 + "+" + değer + "=" + total);
                değer1 = total;
                //  System.out.println(line);
            }
            System.out.println(total);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            try {
                reader.close();// bu kodu yazma amacımız arka planda a.txt yi çalıştırdımızdan dolayı kapatmamız gerekmekte eğer kapatmazsak ram boşuna çalışmış olur 
            } catch (Exception a) {
                a.printStackTrace();
            }
        }
    }
}

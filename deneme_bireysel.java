/*
bu classın amacı yazdığımız metini tekrar yazdırması için 
 */
package ders1__readingfiledemo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class deneme_bireysel {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir satır giriniz:");
        String satır;//burada gireceğimiz satır kaydedilmesi için burada geçiçi depolanıyor

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // System.in kullanıcı tarafından   karakter gelmesini sağlar
        //InputStreamReader metodu bayt cinsinden gelen veerileri karakter cinsine çevirir
        // BufferedReader de okumamıza yardımcı olur bu karakterleri 
        try {
            System.out.println("çalışmak üzere");
            while ((satır = br.readLine()) != null) {//burada readLine satır yazmasını istiyor br nin içinde bulan karakter dizisini readLine ile String ifadeye çevirebiliriz
                System.out.println(satır);
            }
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }
}

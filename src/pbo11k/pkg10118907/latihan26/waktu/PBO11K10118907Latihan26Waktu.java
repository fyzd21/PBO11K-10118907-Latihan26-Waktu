/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan26.waktu;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan waktu
 * 
 */
public class PBO11K10118907Latihan26Waktu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /**
         * Taken and inspired from
         * https://stackoverflow.com/questions/1459656/how-to-get-the-current-time-in-yyyy-mm-dd-hhmisec-millisecond-format-in-java
         * Question from Sunil Kumar Sahoo - https://stackoverflow.com/users/111988/sunil-kumar-sahoo and yassadi - https://stackoverflow.com/users/9282270/yassadi
         * Solution from JayJay - https://stackoverflow.com/users/171675/jayjay
         * 
         * https://stackoverflow.com/questions/5121976/is-there-a-date-format-to-display-the-day-of-the-week-in-java
         * Question from rogerstone https://stackoverflow.com/users/598714/rogerstone and Ironman - https://stackoverflow.com/users/6343685/ironman
         * Solution from Nathan Feger - https://stackoverflow.com/users/8563/nathan-feger and Piyush - https://stackoverflow.com/users/5754623/piyush
         */
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE, dd MMM yyyy HH:mm:ss");
        Date now = new Date();
        String date = sdf.format(now);
        
        System.out.println(date);
    }
    
}

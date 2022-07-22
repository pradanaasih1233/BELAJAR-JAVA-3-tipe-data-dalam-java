// MEMAHAMI TIPE DATA DALAM JAVA
// tipe data adalah suatu bentuk penetuan tipe dari wadah data yang akan digunakan.
// tipe data pada java terdiri dari BYTE, INTEGER, SHORT, LONG, CHAR, FLOAT, DOUBLE, BOOLEAN, STRING DAN CHAR.
package com.belajar3;

public class main {
    public static void main(String[] args){
        System.out.println("=============================");
        System.out.println("MEMAHAMI TIPE DATA DALAM JAVA");
        System.out.println("=============================");

        //----------------------------------------------------------------------------------------

        // 1. Cara penulisan tipe data
        // tipe data ditempatkan pada awal penulisan variabel(deklarasi)
        // tipe_data nama_variabel;
        // tipe_data nama_variabel = nilai;
        // contoh:
        int data_a = 10;
        double data_b = 11.3;
        String data_c = "toni";

        //----------------------------------------------------------------------------------------

        // 2. Jenis-jenis tipe data

        // a. byte, adalah tipe data yang dapat menampung data dengan nilai bilangan bulat, TETAPI LEBIH
        // KECIL DARI SHORT.
        // contoh:
        byte data_byte = 10;
        System.out.println("\nA. BYTE");
        System.out.println("--------");
        System.out.println("NILAI MAX = " + Byte.MAX_VALUE);
        System.out.println("NILAI MIN = " + Byte.MIN_VALUE);
        System.out.println("JUMLAH BYTE = " + Byte.BYTES + " byte");
        System.out.println("JUMLAH BIT = " + Byte.SIZE + " bit");

        // b. short, adalah tipe data yang dapat menampung data dengan nilai bilangan bulat, TETAPI LEBIH
        // KECIL DARI INTEGER.
        // contoh:
        short data_short = 10;
        System.out.println("\nB. SHORT");
        System.out.println("--------");
        System.out.println("NILAI MAX = " + Short.MAX_VALUE);
        System.out.println("NILAI MIN = " + Short.MIN_VALUE);
        System.out.println("JUMLAH BYTE = " + Short.BYTES + " byte");
        System.out.println("JUMLAH BIT = " + Short.SIZE + " bit");

        // c. integer, adalah tipe data yang dapat menampung data dengan nilai bilangan bulat, TETAPI LEBIH
        // KECIL DARI LONG
        // contoh:
        int data_int = 10;
        System.out.println("\nC. INTEGER");
        System.out.println("----------");
        System.out.println("NILAI MAX = " + Integer.MAX_VALUE);
        System.out.println("NILAI MIN = " + Integer.MIN_VALUE);
        System.out.println("JUMLAH BYTE = " + Integer.BYTES + " byte");
        System.out.println("JUMLAH BIT = " + Integer.SIZE + " bit");

        // d. long, adalah tipe data yang dapat menampung data dengan nilai bilangan bulat, MERUPAKAN TIPE
        // DATA TERBESAR
        // contoh:
        long data_long = 10;
        System.out.println("\nD. LONG");
        System.out.println("-------");
        System.out.println("NILAI MAX = " + Long.MAX_VALUE);
        System.out.println("NILAI MIN = " + Long.MIN_VALUE);
        System.out.println("JUMLAH BYTE = " + Long.BYTES + " byte");
        System.out.println("JUMLAH BIT = " + Long.SIZE + " bit");

        // e. float, adalah tipe data yang dapat menampung data dengan nilai bilangan pecahan, SAMA BESAR DENGAN
        // INTEGER.
        // contoh:
        float data_float = (float)10.5;
        System.out.println("\nE. FLOAT");
        System.out.println("--------");
        System.out.println("NILAI MAX = " + Float.MAX_VALUE);
        System.out.println("NILAI MIN = " + Float.MIN_VALUE);
        System.out.println("JUMLAH BYTE = " + Float.BYTES + " byte");
        System.out.println("JUMLAH BIT = " + Float.SIZE + " bit");

        // f. double, adalah tipe data yang dapat menampung data dengan nilai bilangan pecahan, SAMA BESAR DENGAN
        // LONG.
        // contoh:
        double data_double = (double)10.5;
        System.out.println("\nF. DOUBLE");
        System.out.println("---------");
        System.out.println("NILAI MAX = " + Double.MAX_VALUE);
        System.out.println("NILAI MIN = " + Double.MIN_VALUE);
        System.out.println("JUMLAH BYTE = " + Double.BYTES + " byte");
        System.out.println("JUMLAH BIT = " + Double.SIZE + " bit");

        // g. char adalah tipe data yang dapat menampung data karakter(a,s,d,w,r,d,dll).
        // contoh:
        char data_char = 'c';
        System.out.println("\nG. CHAR");
        System.out.println("-------");
        System.out.println("NILAI MAX = " + Character.MAX_VALUE);
        System.out.println("NILAI MIN = " + Character.MIN_VALUE);
        System.out.println("JUMLAH BYTE = " + Character.BYTES + " byte");
        System.out.println("JUMLAH BIT = " + Character.SIZE + " bit");
        System.out.println("data_char = " + data_char);

        // h. string adalah tipe data yang dapat menampung data kata/kalimat.
        // contoh:
        String data_string = "tono beli bom";
        System.out.println("\nH. STRING");
        System.out.println("---------");
        System.out.println("data_string = " + data_string);

        // i. boolean adalah tipe data yang dapat menampung data keadaan(true/false).
        // contoh:
        boolean data_bool = true;
        System.out.println("\nI. BOOLEAN");
        System.out.println("---------");
        System.out.println("NILAI MAX = " + Boolean.TRUE);
        System.out.println("NILAI MIN = " + Boolean.FALSE);

    }
}

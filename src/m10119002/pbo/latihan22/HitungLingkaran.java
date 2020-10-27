/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m10119002.pbo.latihan22;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Firman Sahita
 * KELAS    : IF-1
 * NIM      : 10119002
 * Deskripsi Program : Program ini berisi program perhitungan lingkaran
 * 
 * 
 */
public class HitungLingkaran {
    private final Scanner scanner;
    private HitungLingkaran() {scanner = new Scanner(System.in);}
    
    private String getInput() {return scanner.nextLine();}
    
    private Integer getDiameter(String test) {
        Integer temp;
        try {
            temp = Integer.parseInt(test);
        } catch (NumberFormatException ex) {
            System.out.println("Nilai Diameter Tidak Sesuai");
            System.out.println("");
            return null;
        } catch (Exception ex) {
            System.err.println("Coding Error / System Error!");
            return null;
        }
        return temp;
    }
    
    private boolean isDiameterValid(String test) {
        return getDiameter(test) != null;
    }
    
    private void tampilHasil(int diameter) {
        double luas, keliling, jari, phi;
        phi = Math.PI;
        jari = (double)diameter/2;
        luas = phi * (jari*jari);
        keliling = 2 * phi * jari;
        DecimalFormat df = new DecimalFormat("#.##");
        
        String sJari = df.format(jari);
        String sLuas = df.format(luas);
        String sKeliling = df.format(keliling);
        
        System.out.println("======Hasil Perhitungan Lingkaran=====");
        System.out.println("Jari-jari Lingkaran = ".concat(sJari).concat(" cm"));
        System.out.println("Luas Lingkaran = ".concat(sLuas).concat(" cm"));
        System.out.println("Keliling Lingkaran = ".concat(sKeliling).concat(" cm"));
    }
    
    private void start() {
        String input;
        
        System.out.println("======Perhitungan Lingkaran=====");
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            input = getInput();
        } while(!isDiameterValid(input));
        System.out.println("");
        tampilHasil(getDiameter(input));
    }
    
    public static void main(String[] args) {
        HitungLingkaran program = new HitungLingkaran();
        program.start();
    }
}

package jauhari.belajar_java_dasar.HolidayTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TabelX {
    public static void main(String[] args) {
        System.out.println("____________________Tabel____________________");
        String tabel [][] = new String[20][10];
        int koordinatX [][] = {
                {0,0}, {0,9}, {1,8}, {1,9}, {2,8}, {2,9}, {5,2}, {6,5}, {6,6}, {7,5}, {7,6}, {9,1}, {9,4}, {11,7}, {12,6}, {12,7}, {13,7}, {15,1}, {16,0}, {16,1}, {17,0}, {17,1}, {18,0}, {18,8}, {18,9}, {19,0}, {19,9}};

        for(int i = 0; i < tabel.length; i++){
            for(int j = 0; j < tabel[i].length; j++){
                tabel[i][j] = "O";
            }
        }

        for (int[] koordinat : koordinatX) {
            int baris = koordinat[0];
            int kolom = koordinat[1];
            tabel[baris][kolom] = "X";

        }
        for(int i = 0; i < tabel.length; i++){
            for(int j = 0; j < tabel[i].length; j++){
                System.out.print("|" + tabel[i][j] + "|" + "  ");
            }
            System.out.println();
//            Date end = new Date ();
//            System.out.println("end " + end;
            System.out.println();
        }

        boolean [][] cariX = new boolean[tabel.length][tabel[0].length];
        int individuX = 0;
        int kelompokX = 0;

        List<String> koordinatInd = new ArrayList<>();
        List<List<String>> koordinatKel = new ArrayList<>();

        for(int i = 0; i < tabel.length; i++){
            for (int j = 0; j < tabel[i].length; j++){
                if (tabel[i][j].equals("X") && !cariX[i][j]){
                    List<String> tempKoordinat = new ArrayList<>();
                    int count = pencarianX(tabel, cariX, i, j, tempKoordinat);

                    if (count == 1){
                        individuX++;
                        koordinatInd.add(tempKoordinat.get(0));
                    }else {
                        kelompokX++;
                        koordinatKel.add(tempKoordinat);
                    }
                }
            }
        }
        System.out.println();
        System.out.println("Jumlah X individu = " + individuX);
        System.out.println("Jumlah X berkekompok = " + kelompokX);
        System.out.println();
        System.out.println("Koordinat individu" + koordinatInd);
        System.out.println("Koordinat kelompok" + koordinatKel);

        System.out.println();

        List<KoordinatJarak> nilaiX = new ArrayList<>();

        for (int i = 0; i < tabel.length; i++){
            for (int j = 0; j < tabel[0].length; j++){
                if (tabel[i][j].equals("X")){
                   int jarak = jarakKetepi(i,j, tabel.length, tabel[0].length);
                   nilaiX.add(new KoordinatJarak(i, j, jarak));
                    //int jarak = jarakDari00(i,j);
                    //nilaiX.add(new KoordinatJarak(i, j, jarak));
                }
            }
        }

        nilaiX.sort(Comparator.comparingInt(k -> k.jarak));
        KoordinatJarak terdekat = nilaiX.get(0);
        KoordinatJarak terjauh = nilaiX.get(nilaiX.size()-1);
//        KoordinatJarak terdekat = Collections.min(nilaiX, (a, b) -> Integer.compare(a.jarak, b.jarak));
//        KoordinatJarak terjauh = Collections.max(nilaiX, (a, b) -> Integer.compare(a.jarak, b.jarak));

 //       nilaiX.sort((a,b) -> Integer.compare(b.jarak, a.jarak));

        System.out.println("Titik x terjauh: (" + terjauh.i + "," + terjauh.j + ") jarak: " + terjauh.jarak);
        System.out.println("Titik x terdekat: (" + terdekat.i + "," + terdekat.j + ") jarak: " + terdekat.jarak);
        System.out.println();
        System.out.println("Urutan tepi ke pusat(terjauh): ");
        for (KoordinatJarak kj : nilaiX){
            System.out.println("(" + kj.i + "," + kj.j + ") jarak: " + kj.jarak);
        }
        System.out.println();

        Collections.reverse(nilaiX);
        System.out.println("Urutan pusat (terjauh) ke tepi: ");
        for (KoordinatJarak kj : nilaiX){
            System.out.println("(" + kj.i + "," + kj.j + ") jarak: " + kj.jarak);
        }
    }

    public static int pencarianX(String tabel [][], boolean [][] cariX, int i, int j, List<String> koordinat) {
        if (i < 0 || j < 0 || i >= tabel.length || j >= tabel[i].length) return 0;
        if (!tabel[i][j].equals("X") || cariX[i][j]) return 0;

        cariX[i][j] = true;
        koordinat.add("(" + i + "," + j + ")");
        int count = 1;

        count += pencarianX(tabel, cariX,i - 1, j,koordinat);
        count += pencarianX(tabel, cariX,i + 1, j,koordinat);
        count += pencarianX(tabel, cariX,i, j - 1,koordinat);
        count += pencarianX(tabel, cariX,i, j + 1,koordinat);
        count += pencarianX(tabel, cariX,i - 1, j -1 ,koordinat);
        count += pencarianX(tabel, cariX,i + 1, j + 1,koordinat);
        count += pencarianX(tabel, cariX,i - 1, j + 1,koordinat);
        count += pencarianX(tabel, cariX,i + 1, j - 1,koordinat);

        return count;
    }

    private static int jarakKetepi (int i, int j, int baris, int kolom) {
        return Math.min(Math.min(i,j), Math.min(baris - 1 - i, kolom - 1 - j));
    //public static int jarakDari00 (int i, int j) {
      //  return Math.abs(i - 0) + Math.abs(j - 0);
    }

    static class KoordinatJarak {
        int i, j, jarak;
        public KoordinatJarak(int i, int j, int jarak) {
            this.i = i;
            this.j = j;
            this.jarak = jarak;
        }
    }
    }

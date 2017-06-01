/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package jframegui;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author naufal
 */
public class NewClass {
    
  public static void main (String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("silahkan masukkan jumlah data random yang akan di-generate : ");
    int jmlDataX = scan.nextInt();
    int[] unsorted = new int[jmlDataX];
    unsorted = acakData(jmlDataX);
    int[] sorted = new int[jmlDataX];
    cetakArray(unsorted);
    System.out.print("Silahkan masukkan pilihan metode --> (1)Bubble Sort (2)Selection Sort : ");
    int pilihanMenu = scan.nextInt();
    switch (pilihanMenu) {
      case 1:
        sorted=bubbleSort(unsorted);
        break;
      case 2:
        sorted=selectionSort(unsorted);
        break;
      default:
        System.out.println("pilihan tersebut tidak ada dalam menu");
        break;
    }
  }
  static int[] bubbleSort(int[] dataInput) {
    int[] sorted=dataInput;
    int x, jmlPerbandingan=0;
    for (x=0;x<dataInput.length-1;x++) {
      int y=0;
      System.out.println("iterasi 'loop luar' ke-"+(x+1)+" : ");
      while(y < dataInput.length-1) {
        System.out.print("  iterasi 'loop dalam' ke-"+(y+1)+" : ");
        System.out.println("membandingkan isi elemen ke-"+y+" dan isi elemen ke-"+(y+1));
        if (sorted[y]>sorted[y+1]) {
          System.out.println("    isi elemen ke-"+y+" ("+sorted[y]+") DITUKAR dengan isi elemen ke-"+(y+1)+" ("+sorted[y+1]+")");
          sorted[y]=sorted[y]+sorted[y+1];
          sorted[y+1]=sorted[y]-sorted[y+1];
          sorted[y]=sorted[y]-sorted[y+1];
        }
        else {
          System.out.println("    TIDAK PERLU ADA PERTUKARAN ISI ELEMEN!");
        }
        System.out.print("    kondisi data sementara: ");
        cetakArray(sorted);
        jmlPerbandingan=jmlPerbandingan+1;
        y++;
      }
    }
    System.out.println("jumlah total langkah = total perbandingan elemen = "+jmlPerbandingan);
    return sorted;
  }
  static int[] selectionSort(int[] data) {
    int[] sorted=data;
    int jmlPerbandingan=0;
    int h=0;
    do {
      int min=h;
      for(int i=h+1;i<sorted.length;i++) {
        System.out.println("membandingkan isi elemen ke-"+i+" dan isi elemen ke-"+min+" (min)");
        if (sorted[i]<sorted[min]) {
          min=i;
          System.out.println("elemen terkecil sekarang ada di indeks ke-"+min);
        }
        else {
              System.out.println("elemen terkecil tetap di indeks ke-"+min);
          }
        jmlPerbandingan=jmlPerbandingan+1;
      }
      if (min!=h) {
        sorted[min]=sorted[min]+sorted[h];
        sorted[h]=sorted[min]-sorted[h];
        sorted[min]=sorted[min]-sorted[h];
      }
      cetakArray(sorted);
      System.out.println();
      h++;
    } while (h<sorted.length-1);
    System.out.println("jumlah total langkah = total perbandingan elemen = "+jmlPerbandingan);
    return sorted;
  }
  
  static void cetakArray(int[] data) {
    for (int r=0;r<data.length;r++) {
      System.out.print(data[r]+" ");
    }
    System.out.println();
  }
  static int[] acakData (int jmlData) {
    Random acak = new Random();
    int g=0;
    int[] data = new int[jmlData];
    while (g<jmlData) {
      data[g]=acak.nextInt(100)+1;
      g++;
    }
    return data;
  }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of A");
        int sizeOfA = scanner.nextInt();
        System.out.println("enter size of B");
        int sizeOfB = scanner.nextInt();
        int[] a = new int[sizeOfA];
        int[] b = new int[sizeOfB];
        System.out.println("Enter into A:");
        for(int d=0;d<sizeOfA;d++){
            a[d] = scanner.nextInt();
        }
        System.out.println("Enter into B:");
        for(int d=0;d<sizeOfB;d++){
            b[d] = scanner.nextInt();
        }
        int[] c = new int[sizeOfA + sizeOfB];
        int min = Math.min(sizeOfA, sizeOfB);
        int i=0,j=0,k,l=0;
        while(i<sizeOfA && j<sizeOfB){
            if(a[i] < b[j]){
                c[l++] = a[i++];
            }
            else {
                c[l++] = b[j++];
            }
        }
        if(i != sizeOfA){
            for(;i<sizeOfA;i++){
                c[l++] = a[i];
            }
        }
        if(j != sizeOfB){
            for(;j<sizeOfB;j++){
                c[l++] = b[j];
            }
        }

        for(int h=0;h<sizeOfA+sizeOfB;h++){
            System.out.println(c[h]);
        }
    }
}

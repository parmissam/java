package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of knights");
        int n=scanner.nextInt();
        //int toRoKhodaDororstBash=0;
        //for(int j=0;j<100;j++) {
        Knight[] knights=new Knight[n];
        int liars=0;
        Random random=new Random();
        //int n=random.nextInt(1,2000);
        for(int i=0;i<n;i++){
            boolean honesty=random.nextBoolean();
            if(!honesty){
                liars++;
            }
            if (liars==(n/2)){
                honesty=true;
                liars--;
            }
            knights[i]=new Knight(honesty,i);
        }
        //System.out.println(knights);
        //Knight[] knights1 =knights.toArray(new Knight[0]);
        Knight[] sortedKnights=findHonest(knights,0, knights.length-1);
//        for (int i = 0; i < n; i++) {
//            System.out.println(sortedKnights[i]);
//        }
        for(int i=0;i<n;i++){
            if(sortedKnights[0].getAnswer(knights[i])){
                System.out.println(knights[i]);
            }
        }
//        if(sortedKnights[0].isHonest()){
//            toRoKhodaDororstBash++;
//        }
//        System.out.println(knights);
//        }
//        System.out.println(toRoKhodaDororstBash);
    }

    public static Knight[] findHonest(Knight[] knights, int low,int high){
        if (low==high) {
            Knight[] br=new Knight[1];
            br[0]=knights[low];
            return br;
        }
        int mid = (low+high) / 2;
//        Knight[] l = new Knight[mid];
//        Knight[] r = new Knight[n - mid];
//        for (int i = 0; i < mid; i++) {
//            l[i] = knights[i];
//        }
//        for (int i = mid; i < n; i++) {
//            r[i - mid] = knights[i];
//        }
        Knight[] fh=findHonest(knights,low, mid);
        Knight[] sh=findHonest(knights,mid+1,high);
        Knight[] merged=question(fh,sh);
        return merged;
    }

    public static Knight[] question(Knight[] first,Knight[] second){
        Knight[] sorted=new Knight[first.length+second.length];
        int i = 0, j = 0, k = 0;
        while (i < first.length && j < second.length) {
            if(second[j].getAnswer(first[i])){
                sorted[k] = first[i];
                k++;
                i++;
            }else if (first[i].getAnswer(second[j])){
                sorted[k] = second[j];
                k++;
                j++;
            }else {
                sorted[k] = first[i];
                k++;
                i++;
                sorted[k] = second[j];
                k++;
                j++;
            }
        }
        while (i < first.length) {
            sorted[k] = first[i];
            k++;
            i++;
        }
        while (j < second.length) {
            sorted[k] = second[j];
            k++;
            j++;
        }
//        for (int b = 0; b < first.length; b++) {
//            System.out.println("af"+first[b]);
//        }
//        for (int b = 0; b < second.length; b++) {
//            System.out.println("as"+second[b]);
//        }
//        for (int b = 0; b < sorted.length; b++) {
//            System.out.println("sort"+sorted[b]);
//        }
        return sorted;
    }
}

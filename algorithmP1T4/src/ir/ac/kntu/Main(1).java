package ir.ac.kntu;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of knights");
        int n=scanner.nextInt();
        Knight[] knights=new Knight[n];
        int liars=0;
        Random random=new Random();
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
        Knight[] sortedKnights=findHonest(knights,0, knights.length-1);
        for(int i=0;i<n;i++){
            if(sortedKnights[0].getAnswer(knights[i])){
                System.out.println(knights[i]);
            }
        }
    }

    public static Knight[] findHonest(Knight[] knights, int low,int high){
        if (low==high) {
            Knight[] br=new Knight[1];
            br[0]=knights[low];
            return br;
        }
        int mid = (low+high) / 2;
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
        return sorted;
    }
}

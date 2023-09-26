package ir.ac.kntu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of knights");
        int n=scanner.nextInt();
        //int n=12;
        //int toRoKhodaDororstBash=0;
        //for(int j=0;j<100;j++) {
            ArrayList<Knight> honestKnights = new ArrayList<>();
            ArrayList<Knight> knights = new ArrayList<>();
            //Knight[] knights1 = new Knight[];
            int liars = 0;
            Random random = new Random();
            //int n=random.nextInt(1,1000);
            for (int i = 0; i < n; i++) {
                boolean honesty = random.nextBoolean();
                if (!honesty) {
                    liars++;
                }
                if (liars == (n / 2)) {
                    honesty = true;
                    liars--;
                }
                //knights1[i]=new Knight(honesty);
                Knight newKnight = new Knight(honesty, i);
                knights.add(newKnight);
                honestKnights.add(newKnight);

            }
            //System.out.println(knights);
            //System.out.println(knights);
            //System.out.println("zzzzzzzz");
            findHonest(honestKnights);
            //System.out.println(honestKnights);
            //System.out.println("honesttt" + honestKnights.get(0));
//            if(honestKnights.get(0).isHonest()){
//                toRoKhodaDororstBash++;
//            }
            for (int i = 0; i < knights.size(); i++) {
                if (honestKnights.get(0).getAnswer(knights.get(i))) {
                    System.out.println(knights.get(i));
                }
            }
            for (int i = 0; i < knights.size(); i++) {
                //System.out.println("a" + knights.get(i));
            }
        //  }
        //System.out.println(toRoKhodaDororstBash);
    }

    public static void findHonest(List<Knight> honestKnights){
        ArrayList<Knight> lastRound=new ArrayList<>();
        for(int j=0;j< honestKnights.size();j++){
            lastRound.add(honestKnights.get(j));
        }
//        if(areAllHonest(honestKnights)){
//            //System.out.println("arrrr"+n+counter);
//            return;
//        }
        //System.out.println(honestKnights);
        for(int i=0; i< honestKnights.size()/2;i++){
            if (!honestKnights.get(2*i).getAnswer(honestKnights.get(2*i+1))) {
                honestKnights.remove(2*i+1);
            }else if(!honestKnights.get(2*i+1).getAnswer(honestKnights.get(2*i))) {
                honestKnights.remove(2 * i);
            }
        }
        if(lastRound.equals(honestKnights)){
            return;
        }
        findHonest(honestKnights);
    }

    //public static void printHonestKnights()

//    public static void question(List<Knight> knights,int n){
//        for(int i=0;i<n/2;i++) {
//            for(int j=n/2;j<n;j++){
//                if (knights.get(i).getAnswer(knights.get(j))) {
//                    knights.get(j).addHonesty();
//                }
//                if (knights.get(j).getAnswer(knights.get(i))) {
//                    knights.get(i).addHonesty();
//                }
//                else if(!knights.get(2*i+1).getAnswer(knights.get(2*i))) {
//                    knights.remove(2*i);
//                }
//            }
//        }
//    }

    public static boolean areAllHonest(List<Knight> knights){
        for(int i=0;i< knights.size();i++){
            if(!knights.get(knights.size()-1).getAnswer(knights.get(i))){
                return false;
            }
        }
        return true;
    }
}

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
        ArrayList<Knight> honestKnights = new ArrayList<>();
        ArrayList<Knight> knights = new ArrayList<>();
        int liars = 0;
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            boolean honesty = random.nextBoolean();
            if (!honesty) {
                liars++;
            }
            if (liars == (n / 2)) {
                honesty = true;
                liars--;
            }
            Knight newKnight = new Knight(honesty, i);
            knights.add(newKnight);
            honestKnights.add(newKnight);

        }
        findHonest(honestKnights);
        for (int i = 0; i < knights.size(); i++) {
            if (honestKnights.get(0).getAnswer(knights.get(i))) {
                System.out.println(knights.get(i));
            }
        }

    }

    public static void findHonest(List<Knight> honestKnights){
        ArrayList<Knight> lastRound=new ArrayList<>();
        for(int j=0;j< honestKnights.size();j++){
            lastRound.add(honestKnights.get(j));
        }
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
}

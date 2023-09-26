package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        int[][] rooms=new int[n][2];
        for(int i=0;i<n;i++){
            rooms[i][0]=scanner.nextInt();
            rooms[i][1]=scanner.nextInt();
        }
        ArrayList<Room> encounters=new ArrayList<>();
        encounters.add(new Room(0,0));
        for(int i=0;i<n;i++){
            int size= encounters.size();
            int[][] temp=new int[2*size][2];
            for(int j=0;j< encounters.size();j++){
                temp[j][0]=encounters.get(j).getGold()+rooms[i][0];
                temp[j][1]=encounters.get(j).getDanger()+rooms[i][1];
            }
            int k=0;
            for(int j=size;j<2*size;j++){
                encounters.add(new Room(temp[k][0],temp[k][1]));
                k++;
            }
        }
        double max=0;
        int b1=-1,b2=0,b3=0;
        for(int i=1;i<encounters.size();i++){
            if(encounters.get(i).getRatio()>max && encounters.get(i).getGold()>(m-1)){
                max=encounters.get(i).getRatio();
                b1=encounters.get(i).getDanger();
                b2=encounters.get(i).getGold();
                b3=encounters.get(i).getDanger();
            }
        }
        System.out.println(b1+"   "+b2+"   "+b3);
    }
}

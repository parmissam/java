package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
//        int[] golds=new int[n];
//        int[] danger=new int[n];
        int[][] rooms=new int[n][2];
        for(int i=0;i<n;i++){
            //golds[i]=scanner.nextInt();
            rooms[i][0]=scanner.nextInt();
            rooms[i][1]=scanner.nextInt();
        }
//        for(int i=0;i<n;i++){
//            for (int j=0;j<2;j++){
//                System.out.println(rooms[i][j]);
//            }
//        }
//        int[][] encounters=new int[2*n][2];
//        encounters[0][0]=0;
//        encounters[0][1]=0;
//        for(int i=0;i<n;i++){
//            System.out.println("I"+i);
//            int[][] temp=new int[2^n][2];
//            for(int j=0;j<i+1;j++){
//                temp[j][0]=encounters[j][0]+rooms[i][0];
//                System.out.println("a1 "+temp[j][0]);
//                temp[j][1]=encounters[j][1]+rooms[i][1];
//                System.out.println("a2 "+temp[j][1]);
//            }
//            int k=0;
//            for(int j=(2*i)+1;j<2*(i+1);j++){
//                encounters[j][0]=temp[k][0];
//                System.out.println("b1 "+encounters[j][0]);
//                encounters[j][1]=temp[k][1];
//                System.out.println("b2 "+encounters[j][1]);
//                k++;
//            }
//            for(int t=0;t<n;t++){
//                for (int o=0;o<2;o++){
//                    System.out.print(encounters[t][o]);
//                }
//                System.out.println();
//            }
//        }
        ArrayList<Room> encounters=new ArrayList<>();
        encounters.add(new Room(0,0));
       //System.out.println(encounters.size());
        for(int i=0;i<n;i++){
            int size= encounters.size();
            //System.out.println("I"+i);
            //System.out.println(size);
            int[][] temp=new int[2*size][2];
            for(int j=0;j< encounters.size();j++){
                //System.out.println(temp[0][0]);
                temp[j][0]=encounters.get(j).getGold()+rooms[i][0];
                //System.out.println("a1 "+temp[j][0]);
                temp[j][1]=encounters.get(j).getDanger()+rooms[i][1];
                //System.out.println("a2 "+temp[j][1]);
            }
            int k=0;
            for(int j=size;j<2*size;j++){
                encounters.add(new Room(temp[k][0],temp[k][1]));
                //System.out.println("b1 "+encounters.get(j));
                k++;
            }
            for(int t=0;t<encounters.size();t++){
                //System.out.println(encounters.get(t));
            }
        }
        double max=0;
        int b1=-1,b2=0,b3=0;
        for(int i=1;i<encounters.size();i++){
            //System.out.println("aaaaa"+encounters.get(i));
            //System.out.println("r   "+encounters.get(i).getRatio());
            //System.out.println("max   "+max);
            if(encounters.get(i).getRatio()>max && encounters.get(i).getGold()>(m-1)){
                max=encounters.get(i).getRatio();
                b1=encounters.get(i).getDanger();
                //System.out.println("aa"+encounters.get(i));
                b2=encounters.get(i).getGold();
                b3=encounters.get(i).getDanger();
            }
        }
        System.out.println(b1+"   "+b2+"   "+b3);
    }
}

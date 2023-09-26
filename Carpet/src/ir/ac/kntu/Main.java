package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    }

    public static CarpetStore lestAreaStore(ArrayList<CarpetStore> carpetStores){
        CarpetStore leastAreaStore=null;
        for (CarpetStore carpetStore: carpetStores){
            if(leastAreaStore==null || calculateArea(carpetStore)>calculateArea(leastAreaStore)){
                leastAreaStore=carpetStore;
            }
        }
        return leastAreaStore;
    }

    public static int calculateArea(CarpetStore carpetStore){
        int area=0;
        for (Map.Entry<Carpet, Date> entry: carpetStore.getExistingCarpets().entrySet()){
            area+=entry.getKey().getLength()*entry.getKey().getLength();
        }
        return area;
    }
}

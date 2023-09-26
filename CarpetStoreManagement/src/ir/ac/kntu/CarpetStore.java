package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class CarpetStore {

    private String storeName;

    private String sellerName;

    private int year;

    private Map<Carpet,Date> existingCarpets;

    private Map<Map<Carpet,Date>,Date> soldCarpets;

    public CarpetStore(String storeName, String sellerName, int year) {
        this.storeName = storeName;
        this.sellerName = sellerName;
        this.year = year;
        existingCarpets=new HashMap<>();
        soldCarpets=new HashMap<>();
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Map<Carpet, Date> getExistingCarpets() {
        Map<Carpet,Date> copy=new HashMap<>();
        for (Map.Entry<Carpet,Date> entry : existingCarpets.entrySet()){
            copy.put(entry.getKey(),entry.getValue());
        }
        return copy;
    }

    public void setExistingCarpets(Map<Carpet,Date> existingCarpets) {
        this.existingCarpets = existingCarpets;
    }

    public Map<Map<Carpet, Date>,Date> getSoldCarpets() {
        Map<Map<Carpet,Date>,Date> copySoldCarpets=new HashMap<>();
        for(Map.Entry<Map<Carpet,Date>,Date> entry: soldCarpets.entrySet()){
            copySoldCarpets.put(getExistingCarpets(),entry.getValue());
        }
        return copySoldCarpets;
    }

    public void setSoldCarpets(Map<Map<Carpet, java.util.Date>, java.util.Date> soldCarpets) {
        this.soldCarpets = soldCarpets;
    }

    public void enterCarpet(Carpet carpet,Date date){
        existingCarpets.put(carpet,date);
    }

    public void sellCarpet(Carpet carpet,Date date){
        Map<Carpet,Date> temp=new HashMap<>();
        temp.put(carpet,existingCarpets.get(carpet));
        existingCarpets.remove(carpet);
        soldCarpets.put(temp,date);
    }

    public ArrayList<CarpetStore> randomCarpetStore(int number){
        Random random = new Random();
        ArrayList<CarpetStore> carpetStores=new ArrayList<>();
        String[] storeName={"Flower","Horse","Beautiful","Art","Life"};
        String[] sellerName={"Karimi","Hakimi","Ostovari","Torabi","Farazmand"};
        for (int i=0;i<number;i++){
            CarpetStore store=new CarpetStore(storeName[random.nextInt(4)],sellerName[random.nextInt(4)],
                    1300+random.nextInt(100));
            int carpetsNumber=random.nextInt(10);
            Carpet carpet=new Carpet();
            ArrayList<Carpet> carpets=carpet.randomCarpet(carpetsNumber);
            /*for (int j=0;j<carpets.size();j++){
                Date date=new Date(random.nextInt(1400),random.nextInt(12),random.nextInt(30));
                Map<Carpet,Date> temp=new HashMap<>();
                temp.put(carpets.get(j),date);
            }*/
            carpetStores.add(store);
        }
        return carpetStores;
    }

    @Override
    public String toString() {
        return "CarpetStore{" +
                "storeName='" + storeName + '\'' +
                ", sellerName='" + sellerName + '\'' +
                ", year=" + year +
                ", existingCarpets=" + existingCarpets +
                ", soldCarpets=" + soldCarpets +
                '}';
    }
}

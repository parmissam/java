package ir.ac.kntu;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;

public class Carpet {

    private int length;

    private int arz;

    private Type type;

    private int price;

    public Carpet(){

    }

    public Carpet(int length, int arz, Type type, int price) {
        this.length = length;
        this.arz = arz;
        this.type = type;
        this.price = price;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if(length<0) {
            this.length = 0;
        }else {
            this.length = length;
        }
    }

    public int getArz() {
        return arz;
    }

    public void setArz(int arz) {
        if (arz<0) {
            this.arz = 0;
        }else {
            this.arz = arz;
        }
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<0){
            this.price=0;
        }else {
            this.price = price;
        }
    }

    public int compareTo(Carpet other){
        return this.getPrice()-other.getPrice();
    }

    public ArrayList<Carpet> randomCarpet(int number){
        ArrayList<Carpet> carpets=new ArrayList<>();
        Type[] types={Type.ARABESQUE,Type.AFSHAN,Type.TREE,Type.PAISLEY,Type.TURKMEN};
        Random random = new Random();
        for(int i=0;i<number;i++) {
            Carpet carpet = new Carpet(random.nextInt(6), random.nextInt(6),
                    types[random.nextInt(5)],random.nextInt(6));
            carpets.add(carpet);
        }
        return carpets;
    }

    @Override
    public String toString(){
        return "Length="+length+"Arz="+arz+"Type="+type+"Price="+price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carpet carpet = (Carpet) o;
        return length == carpet.length && arz == carpet.arz && price == carpet.price && type == carpet.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(length, arz, type, price);
    }
}

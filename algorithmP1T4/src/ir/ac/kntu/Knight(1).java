package ir.ac.kntu;

import java.util.Random;

public class Knight {

    private boolean honest;

    private int index;

    public Knight(boolean honest,int index) {
        this.honest = honest;
        this.index=index;
    }

    public boolean isHonest() {
        return honest;
    }

    public void setHonest(boolean honest) {
        this.honest = honest;
    }

    public boolean getAnswer(Knight other) {
        if(this.honest) {
            return other.isHonest();
        }
        Random random=new Random();
        return random.nextBoolean();
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public String toString() {
        return "Knight{" +
                "honest=" + honest +
                ", index=" + index +
                '}';
    }
}

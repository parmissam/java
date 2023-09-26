package ir.ac.kntu;

public class Room {

    private int gold;

    private int danger;

    private double ratio;

    public Room(int gold, int danger) {
        this.gold = gold;
        this.danger = danger;
    }

    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getDanger() {
        return danger;
    }

    public void setDanger(int danger) {
        this.danger = danger;
    }

    public double getRatio() {
        if(getDanger()!=0) {
            ratio = getGold()*1.0 / getDanger();
        }
        return ratio;
    }

    @Override
    public String toString() {
        return "Room{" +
                "gold=" + gold +
                ", danger=" + danger +
                '}';
    }
}

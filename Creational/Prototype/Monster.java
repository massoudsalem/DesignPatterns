package Creational.Prototype;

public abstract class Monster implements Cloneable {
    int attack;
    int defence;

    public Monster(int attack, int defence) {
        this.attack = attack;
        this.defence = defence;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }

    public void Attack(){
        System.out.println("Attack with " + attack + " rate of damage is made.");
    }

    public void Defence(){
        System.out.println("Defence with " + defence + " rate of damage is reduced.");
    }


    public abstract Monster copy() throws CloneNotSupportedException;

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"\t{" +
                "attack=" + attack +
                ", defence=" + defence +
                '}';
    }
}

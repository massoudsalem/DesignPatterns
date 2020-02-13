package Creational.Prototype;

public class RedDevil extends Monster {

    public RedDevil() {
        super(180, 70);
    }

    @Override
    public RedDevil copy() throws CloneNotSupportedException {
        return (RedDevil) this.clone();
    }
}

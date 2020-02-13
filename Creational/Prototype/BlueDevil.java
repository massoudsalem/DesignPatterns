package Creational.Prototype;

public class BlueDevil extends Monster {

    public BlueDevil() {
        super(100, 30);
    }

    @Override
    public BlueDevil copy() throws CloneNotSupportedException {
        return (BlueDevil) this.clone();
    }
}

package Creational.Prototype;

public class PrototypeDriver {
    public static void main(String[] args) throws CloneNotSupportedException {
        Monster redDevilPrototype = new RedDevil();
        Monster blueDevilPrototype = new BlueDevil();

        Monster redDevil1 = redDevilPrototype.copy();
        redDevil1.setAttack(200);
        System.out.println(redDevil1);
        redDevil1.Attack();

        Monster redDevil2 = redDevilPrototype.copy();
        redDevil2.setDefence(100);
        System.out.println(redDevil2);
        redDevil2.Defence();


        Monster blueDevil1 = blueDevilPrototype.copy();
        blueDevil1.setAttack(50);
        System.out.println(blueDevil1);
        blueDevil1.Attack();
    }
}

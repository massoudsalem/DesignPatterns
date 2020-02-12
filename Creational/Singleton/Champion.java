package Creational.Singleton;

public class Champion {
    private static Champion instance;

    private Champion() {
        if(instance != null)
            throw new RuntimeException("Use getInstance Method to Create");
    }

    public static Champion getInstance(){
        if(instance == null){
            synchronized (Champion.class){
                if(instance == null)
                    instance = new Champion();
            }
        }
        return instance;
    }

    public void Attack(){
        System.out.println("Attack..");
    }

    public void Defence(){
        System.out.println("Defence..");
    }
}

package 单例;

public class HungerySingleObject {
    public static HungerySingleObject instance = new HungerySingleObject();
    public static HungerySingleObject getInstance(){
        return instance;
    }
}

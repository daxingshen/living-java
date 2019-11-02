package 单例;

public class Demo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMessage();
    }
}

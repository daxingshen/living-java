package 单例;

public class SingleObject {
    private static SingleObject instance;

    private SingleObject(){}

//    public static SingleObject getInstance(){
//        if(instance == null){
//            instance = new SingleObject();
//        }
//        return instance;
//    }

    public static synchronized SingleObject getInstance(){
        if(instance == null){
            instance = new SingleObject();
        }
        return instance;
    }

    public void showMessage(){
        System.out.println("Hellow World");
    }
}

package 单例;

public enum Singleton implements MySingleton {
    INSTANCE {
        @Override
        public void doSomething() {
            System.out.println("complete singleton");
        }
    };

    public static MySingleton getInstance() {
        return Singleton.INSTANCE;
    }
}

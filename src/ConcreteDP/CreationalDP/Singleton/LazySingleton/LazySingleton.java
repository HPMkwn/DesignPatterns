package ConcreteDP.CreationalDP.Singleton.LazySingleton;


public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }
    public static LazySingleton getInstance(){
        if(lazySingleton ==null){
            synchronized (LazySingleton.class){
                if(lazySingleton ==null){
                    lazySingleton = new LazySingleton();
                }
                return lazySingleton;
            }
        }
        return lazySingleton;
    }

}

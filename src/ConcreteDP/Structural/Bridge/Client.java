package ConcreteDP.Structural.Bridge;

public class Client {
    public static void main(String[] args) {


        // this program needs a persistence framework
        // at runtime  an implementor is chosen between file system implementation and
        //database implememtor , depending on existence of databse drivers



        PersistenceImplementor implementor = null;

        if(databaseDriverExists()){

            implementor = new DabatasePersistenceImplementor();

        }else{

            implementor = new FileSystemPersistentImplementor();
        }

        Persistence persistenceAPI = new PersistenceImpl(implementor);

        Object o = persistenceAPI.findById("12343755");


        // do changes to the object

        // then persist

        persistenceAPI.persist(o);


        // can also change implementor
        persistenceAPI = new PersistenceImpl(new DabatasePersistenceImplementor());

        persistenceAPI.deleteById("2323");


    }

    private static boolean databaseDriverExists() {

        return false;
    }
}

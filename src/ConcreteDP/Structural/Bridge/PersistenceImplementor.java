package ConcreteDP.Structural.Bridge;

public interface PersistenceImplementor {

    public long saveObject(Object object);

    public void deleteObject(long objectId);

    public Object getObject(long objectId);
}

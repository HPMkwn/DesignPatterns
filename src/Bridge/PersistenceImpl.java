package Bridge;

public class PersistenceImpl implements Persistence {

    private PersistenceImplementor persistenceImplementor = null;

    public PersistenceImpl(PersistenceImplementor persistenceImplementor) {
        this.persistenceImplementor = persistenceImplementor;
    }

    @Override
    public String persist(Object object) {
        return Long.toString(this.persistenceImplementor.saveObject(object));
    }

    @Override
    public Object findById(String objectId) {
        return this.persistenceImplementor.getObject(Long.parseLong(objectId));
    }

    @Override
    public void deleteById(String objectId) {
        this.persistenceImplementor.deleteObject(Long.parseLong(objectId));
    }
}

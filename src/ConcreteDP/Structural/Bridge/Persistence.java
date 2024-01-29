package ConcreteDP.Structural.Bridge;

public interface Persistence {

    public String persist(Object object);

    public Object findById(String objectId);

    public void deleteById(String objectId);
}

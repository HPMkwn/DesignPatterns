package ConcreteDP.Structural.Decorator;

public class BasicStreamService implements StreamingService{
    @Override
    public void streamContent() {
        System.out.println("Streaming basic Quality");
    }
}

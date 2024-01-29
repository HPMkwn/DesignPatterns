package ConcreteDP.Structural.Decorator;

public class HDStreamingService extends StreamingDecorator{
    public HDStreamingService(StreamingService streamingService) {
        super(streamingService);
    }

    @Override
    public void streamContent() {
        super.streamContent();
        System.out.println("Streaming in HD Quality");
    }
}

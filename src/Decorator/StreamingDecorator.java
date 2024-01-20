package Decorator;

public abstract class StreamingDecorator implements StreamingService{
    protected StreamingService streamingService;

    public StreamingDecorator(StreamingService streamingService) {
        this.streamingService = streamingService;
    }

    @Override
    public void streamContent() {
        streamingService.streamContent();
    }
}

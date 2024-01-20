package Decorator;

public class SubtitleDecorator extends StreamingDecorator{
    public SubtitleDecorator(StreamingService streamingService) {
        super(streamingService);
    }

    @Override
    public void streamContent() {
        super.streamContent();
        System.out.println("Displaying subtitles!!!");
    }
}

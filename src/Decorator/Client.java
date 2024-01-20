package Decorator;

public class Client {
    public static void main(String[] args) {

        StreamingService streamingService = new BasicStreamService();

        StreamingService hdStreamingService = new HDStreamingService(streamingService);
        hdStreamingService.streamContent();

        System.out.println("-----");

        StreamingService subtitlesService = new SubtitleDecorator(streamingService);
        subtitlesService.streamContent();

        System.out.println("-----");

        StreamingService ultimateService = new SubtitleDecorator(new HDStreamingService(streamingService));
        ultimateService.streamContent();


    }
}

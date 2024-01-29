package ConcreteDP.Structural.Proxy;

public class HighResolutionImage implements Image {

    public HighResolutionImage(String imageFilePath) {

        loadImage(imageFilePath);

    }

    private void loadImage(String imageFilePath) {
        // load image from disk into memory
        // This is heavy and costly operation
    }

    @Override
    public void showImage() {
        // show Actual Image Rendering
    }
}

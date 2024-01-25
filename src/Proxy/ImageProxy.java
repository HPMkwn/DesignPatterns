package Proxy;

public class ImageProxy implements Image{

    private String imageFilePath;

    private Image proxifiedImage;

    public ImageProxy(String imageFilePath) {
        this.imageFilePath = imageFilePath;
    }

    @Override
    public void showImage() {

        if(proxifiedImage==null){
            proxifiedImage = new HighResolutionImage(imageFilePath);
        }

        proxifiedImage.showImage();

    }
}

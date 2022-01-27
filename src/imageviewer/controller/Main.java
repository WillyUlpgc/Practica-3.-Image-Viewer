package imageviewer.controller;

import imageviewer.model.Image;
import imageviewer.persistence.FileImageLoader;
import java.io.File;


public class Main {

    public static void main(String[] args) {
        System.out.println("Hola");
        File file = new File("C:\\Users\\Usuario\\Pictures\\imagenes internet");
        FileImageLoader imageLoader = new FileImageLoader(file);
        Image image = imageLoader.load();
        MainFrame mainFrame = new MainFrame();
        mainFrame.getImageDisplay().show(image);
    }
}

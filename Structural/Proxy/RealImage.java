package Structural.Proxy;

public class RealImage implements Image{
    
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(this.fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading image from: " + fileName);
    }


    @Override 
    public void display(){
        System.out.println("RealImage::display()");
    }
}

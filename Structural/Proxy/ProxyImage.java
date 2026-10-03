package Structural.Proxy;

public class ProxyImage implements Image{   // Proxy

    private String fileName;
    private RealImage realImage;    // real subject

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }
    
    @Override 
    public void display(){
        System.out.println("Authenticating...");        // extra features
        System.out.println("Check suffix...");
        System.out.println("Directing to real image...");

        if (this.realImage == null){
            this.realImage = new RealImage(this.fileName);  // connected to real subject
        }
        this.realImage.display();
    }
}

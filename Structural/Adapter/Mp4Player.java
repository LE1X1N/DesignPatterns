package Structural.Adapter;

public class Mp4Player implements AdvancedMediaPlayer{
    @Override 
    public void playMp4(String fileName){
        System.out.println("Advanced Media Player (MP4 Player) is playing: " + fileName);
    }  

    @Override 
    public void playVlc(String fileName){
        // do nothing
    }
}

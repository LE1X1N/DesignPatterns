package Structural.Adapter;

public interface AdvancedMediaPlayer {
    
    public void playMp4(String fileName);   // different interface from `MediaPlayer::play()`

    public void playVlc(String fileName);   
}

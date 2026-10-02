package Structural.Adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");  // native support

        audioPlayer.play("mp4", "alone.mp4");           // support by adapter
        audioPlayer.play("vlc", "far far away.vlc");    // support by adapter
        
        audioPlayer.play("avi", "mind me.avi");         // unsupport
    }
}

package Structural.Adapter;

public class AudioPlayer implements MediaPlayer{
    
    MediaAdapter mediaAdapter;

    @Override 
    public void play(String audioType, String fileName){
        
        // Native support for MP3
        // if (audioType.equalsIgnoreCase("mp3")){
        //     System.out.println("Playing MP3 file. Name: " + fileName);
        // }
        // else{
        //     System.out.println("Unsupported media format: " + audioType);
        // }

        // Support for MP3、MP4、VLC with Adapter
        if (audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing MP3 file. Name: " + fileName);
        }
        else if (audioType.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else if (audioType.equalsIgnoreCase("vlc")){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }
        else{
            System.out.println("Unsupported media format: " + audioType);
        }

    }
}

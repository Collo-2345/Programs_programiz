import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.*;


public class AudioPlayer {
   public void main(String[] args) throws UnsupportedAudioFileException, IOException, LineUnavailableException {
	  Scanner col = new Scanner(System.in);
	  
	  File file = new File("Short_Song__English_Song_🎵_[W_Lyrics]_30_seconds(48k).wav");
	   AudioInputStream audiostream =  AudioSystem.getAudioInputStream(file);
	   
	   Clip clip = AudioSystem.getClip();
	   clip.open(audiostream);
	   
	   clip.start();
	   
	   String Response = "";
	   
	   while(!Response.equals("Q"))
	   {
		   System.out.println(" P = play R = restart S = stop Q = quit");
		   System.out.println("Enter your Choice:");
	   
	   Response = col.next();
	   Response = Response.toUpperCase();
	   
	   switch(Response)
	   {
	   case ("P"):  clip.start();
	   break;
	   case ("S"): clip.stop();
	   break;
	   case ("R"): clip.setMicrosecondPosition(0);
	   break;
	   case ("Q"): clip.close();
	   break;
	   default:System.out.println("Invalid input");
	   }
	   }
	   System.out.println("...That how to play song using java programs...");
   }
}

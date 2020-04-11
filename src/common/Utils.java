/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author angel
 */
public class Utils {
    
    public static void playSound(String soundName) {
    String gongFile = "sound/"+soundName;
        InputStream in;
        try {
            in = Utils.class.getClassLoader().getResourceAsStream(gongFile);
            AudioStream audioStream = new AudioStream(in);

            AudioPlayer.player.start(audioStream);
        } catch (Exception ex) {
            Logger.getLogger(Utils.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static BufferedImage readImage(String path){
        try {
           return ImageIO.read(Utils.class.getClassLoader().getResourceAsStream("images/"+path));
        } catch (IOException e) {
        }
		return null;
    }
}

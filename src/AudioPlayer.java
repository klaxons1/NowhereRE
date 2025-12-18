import javax.microedition.media.Manager;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;
import javax.microedition.media.control.VolumeControl;
import javax.microedition.midlet.MIDlet;

public class AudioPlayer {
    protected static Player musicPlayer = null;
    protected static boolean isSoundMuted = true;
    protected static boolean isLoopEnabled = false;
    protected static PlayerListener playerListener = null;

    public static boolean isMuted() {
       return isSoundMuted;
    }

    public static boolean toggleSound() {
       return setMuted(!isSoundMuted);
    }

    public static synchronized boolean setMuted(boolean var0) {
       try {
          if (var0) {
             isSoundMuted = true;
             if (!isLoopEnabled) {
                stopMusic();
             } else if (musicPlayer != null) {
                musicPlayer.stop();
             }
          } else {
             isSoundMuted = false;
             if (isLoopEnabled) {
                musicPlayer.prefetch();
                musicPlayer.setLoopCount(-1);
                ((VolumeControl) musicPlayer.getControl("VolumeControl")).setLevel(50);
                musicPlayer.start();
             }
          }
       } catch (Exception var2) {
       }

       return isSoundMuted;
    }

    public static synchronized void playMusic(MIDlet var0, String var1) {
       try {
          if (!isSoundMuted && (musicPlayer == null || musicPlayer.getState() == 0 || musicPlayer.getState() == 300)) {
             stopMusic();
             musicPlayer = Manager.createPlayer(var0.getClass().getResourceAsStream(var1), "audio/midi");
             if (playerListener != null) {
                musicPlayer.addPlayerListener(playerListener);
             }

             musicPlayer.prefetch();
             Player var10000;
             byte var10001;
             if (isLoopEnabled) {
                var10000 = musicPlayer;
                var10001 = -1;
             } else {
                var10000 = musicPlayer;
                var10001 = 1;
             }

             var10000.setLoopCount(var10001);
             ((VolumeControl) musicPlayer.getControl("VolumeControl")).setLevel(50);
             musicPlayer.start();
          }

       } catch (Exception var3) {
       }
    }

    public static synchronized void stopMusic() {
       if (musicPlayer != null) {
          try {
             musicPlayer.stop();
          } catch (Exception var3) {
          }

          try {
             musicPlayer.deallocate();
          } catch (Exception var2) {
          }

          try {
             musicPlayer.close();
          } catch (Exception var1) {
          }

          try {
             if (playerListener != null) {
                musicPlayer.removePlayerListener(playerListener);
             }
          } catch (Exception var0) {
          }

          musicPlayer = null;
       }

    }
}

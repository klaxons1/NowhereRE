import javax.microedition.lcdui.Display;
import javax.microedition.midlet.MIDlet;

public class MainApp extends MIDlet {
   public MainApp() {
      if (GameCanvas.instance == null) {
         GameCanvas.instance = new GameCanvas(this);
         GameCanvas.initGame();
         GameCanvas.display = null;
      }

   }

   public void startApp() {
      if (GameCanvas.display == null) {
         GameCanvas.display = Display.getDisplay(this);
         GameCanvas.display.setCurrent(GameCanvas.instance);
      }

      GameCanvas.instance.showNotify();
   }

   public void destroyApp(boolean var1) {
      GameCanvas.exitGame();
   }

   public void pauseApp() {
      GameCanvas.instance.hideNotify();
   }
}

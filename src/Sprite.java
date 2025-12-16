import javax.microedition.lcdui.Image;

final class Sprite {
   protected int resourceId;
   protected Image[] images;

   protected Sprite(int var1) {
      this.images = new Image[var1];
      this.resourceId = -1;
   }
}

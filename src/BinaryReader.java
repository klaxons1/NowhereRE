final class BinaryReader {
   protected int resourceId;
   protected byte[] buffer;
   protected int position;

   protected BinaryReader(byte[] var1, int var2) {
      this.buffer = var1;
      this.resourceId = var2;
      this.position = 0;
   }
}

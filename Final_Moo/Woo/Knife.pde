public class Knife extends Entity {

  public Knife(int xPos, int yPos) {
    super(xPos, yPos);
    // undefined dx and type
  }

  public Knife(int xPos, int yPos, int newDx) {
    this(xPos, yPos);
    dx = newDx;
    if (dx < 0) {
      type = 1;
    } else {
      type = 2;
    }
  }

}

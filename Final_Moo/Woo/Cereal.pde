public class Cereal extends Entity {

  public Cereal(int xPos, int yPos) {
    super(xPos, yPos);
    type = 3;
    dx = 1;
  }

  public Cereal(int xPos, int yPos, int newDx) {
    super(xPos, yPos);
    type = 3;
    dx = newDx;
  }
  

}

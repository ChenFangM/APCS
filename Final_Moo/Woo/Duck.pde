public class Duck extends Entity {

  boolean isOnCereal;
  int cerealDx;

  public Duck() {
    super(60, 540);
    isOnCereal = false;
    cerealDx = 0;
  }

  // Accessors

  public boolean onCereal() {
    return isOnCereal;
  }

  public int getCerealDx() {
    return cerealDx;
  }

  // Modifiers

  public void ontoCereal() {
    isOnCereal = true;
  }

  public void offCereal() {
    isOnCereal = false;
  }

  public void setCerealDx(int cDx) {
    cerealDx = cDx;
  }

  // Movement

  public void moveY(int dy) {
    setY(getY() + dy);
  }

  public void moveX(int dx) {
    setX(getX() + dx);
  }

}

public class Entity {

  boolean alive;
  int x, y;
  int dx;
  int type;

  public Entity() {
    alive = true;
  }

  public Entity(int xPos, int yPos) {
    this();
    x = xPos;
    y = yPos;
  }

  public Entity(int xPos, int yPos, int newDx) {
    this(xPos, yPos);
    dx = newDx;
  }

  // Accessors

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  public int getType() {
    return type;
  }

  public int getDx() {
    return dx;
  }

  public boolean isDead() {
    return !alive;
  }

  // Modifiers

  public void setX(int num) {
    x = num;
  }

  public void setY(int num) {
    y = num;
  }

  public void kill() {
    alive = false;
  }

  // Methods
  
  public boolean isHere(Entity e) {
    return (x == e.getX() && y == e.getY());
  }

  // true if e is within range (40)
  public boolean inRange(Entity e) {
    if (y == e.getY()) {
      if (x > e.getX() + 40 || x < e.getX() - 40) { // DuckX < KnifeX - 50 AND DuckX > Knife + 50
      return false;
      }
      return true;
    }
    return false;
  }
  
  // Nature
  public void move() {
    x = x + dx;
    if (x > 510 && dx > 0) {
      x = x - 540;
    }
    if (x < -30 && dx < 0) {
      x = 540 - x;
    }
  }

}
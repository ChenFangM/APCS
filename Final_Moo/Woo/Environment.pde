/* COLOR KEY */
//final color red = color(255, 0, 0);
//final color green = color(0, 255, 0);
//final color darkBlue = color(0, 0, 255);
//final color lightBlue = color(0, 255,255);
//final color yellow = color(255, 255, 0);
//final color pink = color(255, 0, 255);
//final color gray = color(100);
//final color white = color (255);

public class Environment {

  color col;

  public Environment() {
    col = color(0, 0, 0);
  }

  public Environment(color newCol) {
    col = newCol;
  }

  // Accessors

  public color getColor() {
    return col;
  }
  
  // Methods

  // Draw rectangle // Unused
  void drawEnv(int y) {
    fill(col);
    rect(0, y, 480, height/12);
  }

}

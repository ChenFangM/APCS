/*
Dysentery -- Brianna Tieu, Fang Chen, Ethan Lam
APCS pd06
L08: America's Next Top Data Scientist
2022-04-05
time spent:
*/

public class Cereal {
  private String _name;
  private char _type;
  private int _calories;
  private int _protein;
  private int _fat;
  private int _sodium;
  private int _fiber;
  private int _carbohydrates;
  private int _sugar;
  private int _potassium;
  private int _vitamins;
  private int _shelf;
  private double _weight;
  private double _cups;
  private double _rating;

  public Cereal( String name, char type, int calories, int protein, int fat, int sodium, int fiber, int carbohydrates, int sugar, int potassium, int vitamins, int shelf, double weight, double cups, double rating) {
    _name = name;
    _type = type;
    _calories = calories;
    _protein = protein;
    _fat = fat;
    _sodium = sodium;
    _fiber = fiber;
    _carbohydrates = carbohydrates;
    _sugar = sugar;
    _potassium = potassium;
    _vitamins = vitamins;
    _shelf = shelf;
    _weight = weight;
    _cups = cups;
    _rating = rating;
  }

  public String retName() {
    return _name;
  }

  public char retType() {
    return _type;
  }

  public int retCalories() {
    return _calories;
  }

  public int retProtein() {
    return _protein;
  }

  public int retFat() {
    return _fat;
  }

  public int retSodium() {
    return _sodium;
  }

  public int retFiber() {
    return _fiber;
  }

  public int retCarbohydrates() {
    return _carbohydrates;
  }

  public int retSugar() {
    return _sugar;
  }

  public int retPotassium() {
    return _potassium;
  }

  public int retVitamins() {
    return _vitamins;
  }

  public int retShelf() {
    return _shelf;
  }

  public double retWeight() {
    return _weight;
  }

  public double retCups() {
    return _cups;
  }

  public double retRating() {
    return _rating;
  }
  public String toString() {
    String sheesh = "";
    sheesh += "Name: " + retName() + "\n";
    sheesh += "Type: " + retType() + "\n";
    sheesh += "Calories: " + retCalories() + "\n";
    sheesh += "Protein: " + retProtein() + "\n";
    sheesh += "Fat: " + retFat() + "\n";
    sheesh += "Sodium: " + retSodium() + "\n";
    sheesh += "Fiber: " + retFiber() + "\n";
    sheesh += "Carbohydrates: " + retCarbohydrates() + "\n";
    sheesh += "Sugar: " + retSugar() + "\n";
    sheesh += "Potassium: " + retPotassium() + "\n";
    sheesh += "Vitamins: " + retVitamins() + "\n";
    sheesh += "Shelf: " + retShelf() + "\n";
    sheesh += "Weight: " + retWeight() + "\n";
    sheesh += "Cups: " + retCups() + "\n";
    sheesh += "Rating: " + retRating() + "\n";
    return sheesh;
  }
}
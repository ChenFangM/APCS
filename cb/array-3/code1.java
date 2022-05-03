public class code1 {

  public static void main(String[] args) {

    code1 t = new code1();

    // testing site
    t.method(3);

  }

/* squareUp */
  public int[] squareUp(int n) {

    int[] arr = new int[n*n];
    for (int i = n; i > 0; i --) {
      for (int p = 1; p <= i; p ++) {
        arr[i * n - p] = p;
      }
    }
    
    return arr;

  }

}

public class Solution {
  
  // For loop from 100 to 5 by 5. print index var.
  void soln1() {
    for (int i = 100; i >= 5; i -= 5) {
      System.out.println(i);
    }
  }

  // For loop from 100 to 5 by 5. do nothing inside the loop.
  void soln2() {
    for (int i = 100; i >= 5; i -= 5) {
    }
  }

  // Sum Integers from 9 to 17, print sum
  void soln3() {
  Integer sum = 0;
  for (int i = 9; i <=17; i++) {
    sum = sum + i;
  }
    System.out.println(sum);
  }

  // Find and print the smallest integer in an array a = [9, 5, 6, 3, 8, 2, 4];
  void soln4() {
  int small = a[0];
  for(int i = 1; i <= a.length-1; i++) {
    if (a[i] < small) {
      small = a[i];
    }
  }
    System.out.println(small);
  }

  // Find largest integer in the last array and print it.
  void soln5() {
    int large = a[0];
    for(int i = 1; i <= a.length-1; i++) {
      if (a[i] > large) {
        large = a[i];
      }
    }
    System.out.println(large);
  }

  // Find and print index of first true element in an array of booleans a = [false, false, false, true, false];
  void soln6() {
for (int i=0; i<= a.length - 1; i++) {
  if (a[i]) {
    System.out.println(i);
  }
  break;
}
  }

  // Find and print index of first true element in an array of booleans (must use a while loop)
  void soln7() {
    int i = 0;
  while (i<= a.length) {
    if (a[i]) {
      System.out.println(i);
      break;
    }
    i++;
  }
  }

  // add 5 to every element of an array of integers a = [9, 5, 6, 3, 8, 2, 4]
  void soln8() {
  for (int i = 0; i < a.length; i++) {
    a[i] = a[i] + 5;
  }
  }

  // divide each element of an array by 1.3; a = [0.5, 1.4, 6.7, 123.4 -34.6]
  void soln9() {
  for (int i = 0; i < a.length; i++) {
    a[i] = a[i] / 1.3;
  }
  }

  // raise each element of a double array to it's 3rd power and subtract the original element's
  // value by the value divided by 3.0 a = [1.3, 5.4, 6.1, 1.0, 9.2];
  void soln10() {
  for (int i = 0; i < a.length; i++) {
    a[i] = (Math.pow(a[i], 3)) - (a[i] / 3);
  }
  }

  // zero out a 4 by 6 integer array
  void soln11() {
  int x = 4;
  int y = 6;
  for (int i = 0; i < x; i++) {
    for (int i2 = 0; i2 < y; i2++) {
      a[i][i2] = 0;
    }
  }
  }

  // multiply each element of a 5 by 5 array of integers by 7
  void soln12() {
  int x = 5;
  int y = 5;
  for (int i = 0; i < x; i++) {
    for (int i2 = 0; i2 < y; i2++) {
      a[i][i2] = a[i[i2]] * 7;
    }
  }
  }
  // *****CHECKED AGAINST YUN'S UP TO HERE*****

  // create a method that takes a 5 by 5 array and produces a 5 by 5 array of booleans. each element in
  // the result should be true if the value in the argument array is even, else it's false.
  void soln13() {
  int rows = 5;
  int columns = 5;
  boolean[][] arrayTrueFalse = new boolean[rows][columns];
  for (int i = 0; i < rows; i++) {
    for (int i2 = 0; i2 < columns; i2++) {
      arrayTrueFalse[i][i2] = (a[i][i2] % 2 == 0);
    }
  }
  }

  // create a method that takes two doubles and returns the first parameter raised to the second
  // parameter's value
  double soln14(double x, double y) {
  return Math.pow(x, y);
  }

  // create a method that returns a boolean if the Object passed to it is a Fish or not
  boolean soln15(Object input) {
  return input instanceof Fish;
  }

  // There is an object x which has a method (double)Balance(). Build an IF statement that prints
  // "Paid Off" if the result of the balance call is less than or equal to 1.0, else it prints the
  // balance as a Dollar figure (2 decimal places)
  void soln16() {
    if (Balance(x) <= 1.0) {
      System.out.println("Paid Off");
    } else {
      System.out.println("$" + String.format(".2f", Balance(x)));
    }
  }

  // Build a WHILE loop that turns on the heat if the thermo.getTemp() is less than 72.0 else it turns on
  // the A/C if thermo.getTemp() is greater that 76.0.
  void soln17() {
    double temp = thermo.getTemp();
    int statusOffHeatAC = 0;
  while (temp < 72.0 || temp > 76.0) { // don't really need this while loop, just using it per the prompt
    if (temp < 72.0) {
      statusOffHeatAC = 1;
    } else {
      statusOffHeatAC = 2;
    }
  }
  }

  // Find a number greater than Pi in a double array, print number and its index.
  void soln18(double[] array) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] > Math.PI) {
        System.out.println(array[i] + ", " + i);
        break;
      }
    }
  }
  
  void soln19() {
  // and put your code here.
  }
  
  void soln20() {
  // and put your code here.
  }
  
  void soln21() {
  // and put your code here.
  }
  
  void soln22() {
  // and put your code here.
  }
  
}

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
  for (int i = 0; i <= x; i++) {
    for (int i2 = 0; i2 <= y; i2++) {
      a[i][i2] = 0;
    }
  }
  }

  // multiply each element of a 5 by 5 array of integers by 7
  void soln12() {
  // and put your code here.
  }
  
  void soln13() {
  // and put your code here.
  }
  
  void soln14() {
  // and put your code here.
  }
  
  void soln15() {
  // and put your code here.
  }
  
  void soln16() {
  // and put your code here.
  }
  
  void soln17() {
  // and put your code here.
  }
  
  void soln18() {
  // and put your code here.
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

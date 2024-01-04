// Jose Guzman
// September 10, 2023
// Description: returning values from methods
// File Name: Rectanlge.java
// To Compile in terminal type: javac Rectangle.java
// To Run the program in terminal type: java Rectangle
class Rectangle
{
  //  instance variables
  int length, width;

  //  constructor:
  Rectangle(int newL, int newW)
  {
    length = newL;
    width = newW;
  }

  //  mutator methods below 
  void changeL(int newL) { length = newL; }
  void changeW(int newW) { width = newW; }

  //  accessor methods below that return values
  int getL() { return length; }
  int getW() { return width; }

  //  method that returns the sum of all sides
  int sum(int side1, int side2)
  {
    return side1+side2;
  }

  //  main method to start the program
  public static void main(String[] args)
  {
    // make an instance named rect
    Rectangle rect = new Rectangle(1,2);

    // use the instance to call the mutator methods
    rect.changeL(10);
    rect.changeW(20);

    // use the instance to call method that returns value
    int sum = rect.sum(10,20); // stored the value in sum

    // show the value that was returned
    System.out.println("sum of 2 sides = " + sum);
  }
}

/*
Rectangle> javac Rectangle.java
Rectangle> java Rectangle
sum of 2 sides = 30
*/
import java.util.Scanner;

public class ShapeDrawer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number that ranges between 3-8: ");
        int sides = input.nextInt();

        if (sides < 3 || sides > 8) {
            System.out.println("Invalid number. Please enter a number between 3 and 8.");
        } else {
            drawShape(sides);
        }
        input.close();
    }

    public static void drawShape(int sides) {
        switch (sides) {
          case 3:
              drawTriangle();
              break;
          case 4:
              drawSquare();
              break;
          case 5:
             drawPentagon();
             break;
          case 6:
             drawHexagon();
             break;
          case 7:
             drawHeptagon();
             break;
          case 8:
              drawOctagon();
              break;
        }
    }

    public static void drawTriangle() {
        System.out.println("  *  ");
        System.out.println(" * * ");
        System.out.println("*****");
    }

    public static void drawSquare() {
        System.out.println("****");
        System.out.println("*  *");
        System.out.println("*  *");
        System.out.println("****");
    }

    public static void drawPentagon() {
        System.out.println("        *      ");
        System.out.println("      *   *    ");
        System.out.println("    *       *  ");
        System.out.println("    *       *  ");
        System.out.println("    *********  ");
    }

   public static void drawHexagon() {
        System.out.println("  ****  ");
        System.out.println(" *    * ");
        System.out.println("*      *");
        System.out.println("*      *");
        System.out.println(" *    * ");
        System.out.println("  ****  ");
   }

  public static void drawHeptagon() {
      System.out.println("       *       ");
      System.out.println("     *   *     ");
      System.out.println("   *       *   ");
      System.out.println("   *       *   ");
      System.out.println("   *       *   ");
      System.out.println("     *   *     ");
      System.out.println("      ***      ");
  }

  public static void drawOctagon() {
    System.out.println("    *****    ");
    System.out.println("  *       *  ");
    System.out.println("*           *");
    System.out.println("*           *");
    System.out.println("*           *");
    System.out.println("  *       *  ");
    System.out.println("    *****    ");
  }

}

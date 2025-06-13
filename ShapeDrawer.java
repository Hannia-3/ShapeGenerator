import java.util.Scanner;

public class ShapeDrawer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbSides;

        while (true) {
            System.out.println("Enter number that ranges between 3-8 or 0 to exit: ");
            numbSides = input.nextInt();

            if (numbSides == 0) {
                System.out.println("Goodbye!");
                break;
            }

        if (numbSides < 3 || numbSides > 8) {
            System.out.println("Invalid number. Please enter a number between 3 and 8.");
            continue;
        }
            drawShape(numbSides);
     }
        input.close();
    }

    public static void drawShape(int numbSides) {
        switch (numbSides) {
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

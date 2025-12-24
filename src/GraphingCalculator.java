import java.util.*;
import java.io.*;

public class GraphingCalculator {

  // Enum for function types
  public enum FunctionType {
    ADD, SUBTRACT, MULTIPLY, DIVIDE, SIN, COS, TAN, EXP, LOG, LOG10
  }

  // Method to initialize the Graphing Calculator (entry point)
  public static void init() {
    Scanner scanner = new Scanner(System.in);

    // Function selection
    System.out.println("Welcome to the Jcalc GraphingCalculator UI!");
    System.out.print("Enter the function you want to graph (sin, cos, tan, exp, log, log10): ");
    String functionInput = scanner.next().toUpperCase();

    FunctionType function;
    try {
      function = FunctionType.valueOf(functionInput);
    } catch (IllegalArgumentException e) {
      System.out.println("Invalid function type.");
      return;
    }

    // Range and step size for graphing
    System.out.print("Enter the minimum x value: ");
    double minX = scanner.nextDouble();

    System.out.print("Enter the maximum x value: ");
    double maxX = scanner.nextDouble();

    System.out.print("Enter the step size: ");
    double step = scanner.nextDouble();

    // Generate and display graph points
    List<String> graphPoints = generateGraphPoints(function, minX, maxX, step);
    printGraph(graphPoints);
    displayTextGraph(graphPoints);
    scanner.close();
  }

  // Generate points for graphing based on function type
  private static List<String> generateGraphPoints(FunctionType function, double minX, double maxX, double step) {
    List<String> graph = new ArrayList<>();
    for (double x = minX; x <= maxX; x += step) {
      double y = calculate(x, function);
      graph.add(formatGraphPoint(x, y));
    }
    return graph;
  }

  // Calculate the y-value based on the function type
  private static double calculate(double x, FunctionType function) {
    switch (function) {
      case SIN:
        return Math.sin(Math.toRadians(x));
      case COS:
        return Math.cos(Math.toRadians(x));
      case TAN:
        return Math.tan(Math.toRadians(x));
      case EXP:
        return Math.exp(x);
      case LOG:
        return (x > 0) ? Math.log(x) : Double.NaN;
      case LOG10:
        return (x > 0) ? Math.log10(x) : Double.NaN;
      default:
        return x; // For cases like ADD, SUBTRACT, etc., or default behavior
    }
  }

  // Format the point into a string for CLI visualization
  private static String formatGraphPoint(double x, double y) {
    return String.format("x = %.2f, y = %.4f", x, y);
  }

  // Print out graph points to the CLI
  private static void printGraph(List<String> graph) {
    for (String point : graph) {
      System.out.println(point);
    }
  }

  // Display a simple text-based graph (scaled for terminal visualization)
  private static void displayTextGraph(List<String> graph) {
    for (String point : graph) {
      String[] parts = point.split(",");
      double y = Double.parseDouble(parts[1].split("=")[1].trim());
      // Scale the output to fit within the terminal window
      int scaledY = (int) (y * 10); // You can adjust the scaling factor here
      String line = " ".repeat(40 + scaledY) + "*"; // 40 spaces to center, and scaledY for position
      System.out.println(line);
    }
  }
}

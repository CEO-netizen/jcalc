import java.util.HashMap;
import java.util.Map;

public class Main {

  // Memoization cache 
  static Map<Integer, Long> fibCache = new HashMap<>();

  public static void main(String[] args) {
    if (args.length == 0) {
    System.out.println("No arguments provided. Use -h or --help for usage info.");
    System.exit(0);
    }
    String command =  args[0];
    switch (command) {
      case "-a":
      case "--add":
        // Addition
        if (args.length != 3) {
          System.out.println("Argument amount not met.\nUsage: -a number1 number2");
          System.exit(0);
        } else {
          int num1_add = Integer.parseInt(args[1]);
          int num2_add = Integer.parseInt(args[2]);

          System.out.println(num1_add + " plus " + num2_add + " equals " + (num1_add + num2_add));
        }
      break;

      case "-m":
      case "--multiply":
        // Multiplication
        if (args.length != 3) {
          System.out.println("Argument amount not met.\nUsage: -m number1 number2");
          System.exit(0);
        } else {
          int num1_mul = Integer.parseInt(args[1]);
          int num2_mul = Integer.parseInt(args[2]);

          System.out.println(num1_mul + " Multiplied by " + num2_mul + " equals " + (num1_mul * num2_mul));
        }
      break;

      case "-s":
      case "--subtract":
        // Subtraction
        if (args.length != 3) {
          System.out.println("Argument amount not met.\nUsage: -s number1 number2");
          System.exit(0); // 41
        } else {
          int num1_sub = Integer.parseInt(args[1]);
          int num2_sub = Integer.parseInt(args[2]);

          System.out.println(num1_sub + " Minus " + num2_sub + " equals " + (num1_sub - num2_sub));
        }
      break;

      case "-d":
      case "--divide":
        // Division 
        if (args.length != 3) {
          System.out.println("Argument amount not met\nUsage: -d number1 number2");
        } else {
          int num1_div = Integer.parseInt(args[1]);
          int num2_div = Integer.parseInt(args[2]);

          System.out.println(num1_div + " Divided by " + num2_div + " equals " + (num1_div / num2_div));
        }
      break;

      case "-S":
      case "--sqrt":
        // Algorithm Square root using Math.sqrt
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: --sqrt number"); 
          System.exit(0);
        } else {
          int num_sqrt = Integer.parseInt(args[1]);

         System.out.println("The square root of " + num_sqrt + " is " + (Math.sqrt(num_sqrt)));
        }
      break;

      case "-p":
      case "--pow":
        // Algorithm Power/Exponents using Math.pow
        if (args.length != 3) {
          System.out.println("Argument amount not met.\nUsage: --pow number1 number2.");
          System.exit(0);
        } else {
          int pow_base = Integer.parseInt(args[1]);
          int pow_exp = Integer.parseInt(args[2]);

          System.out.println(pow_base + " raised to the power of " + pow_exp + " is " + (Math.pow(pow_base, pow_exp)));
        }
      break;

      case "-M":
      case "--mod":
        // Algorithm: Modulus using Math.mod
        if (args.length < 3) {
          System.out.println("Argument amount not met.\nUsage: --mod number1 number2");
          System.exit(0);
        } else {
          int num1_mod = Integer.parseInt(args[1]);
          int num2_mod = Integer.parseInt(args[2]);

          System.out.println(num1_mod + " mod " + num2_mod + " equals " + (num1_mod % num2_mod));
        }
      break;

      case "--sin":
      // Algorithm: Sine of an angle using Math.sin
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: --sin number");
          System.exit(0);
        } else {
          int num_sin = Integer.parseInt(args[1]);

          System.out.println("The sine of angle " + num_sin + " equals " + (Math.sin(num_sin)));
        }
      break;

      case "--cbrt":
      case "-c":
      // Algorithm: Cube root using Math.cbrt
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: --cbrt number");
          System.exit(0);
        } else {
          int num_cbrt = Integer.parseInt(args[1]);

          System.out.println("The cube root of " + num_cbrt + " is " + (Math.cbrt(num_cbrt)));
        }
      break;

      case "--cos":
      case "-C":
      // Algorithm: Cosine of an angle using Math.cos and Math.toRadians
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: --cos degrees");
          System.exit(0);
        } else {
          int num_cos = Integer.parseInt(args[1]);

          System.out.println("cos(" + num_cos + " deg) equals " + (Math.cos(Math.toRadians(num_cos))));
        }
      break;

      case "-h":
      case "--help":
      // brief help for basic algorithms
        if (args.length != 1) {
          System.out.println("No args required for help message.");
          System.exit(0);
        } else {
          System.out.println("-(\33[31mJcalc-v1.0.1\33[0m)-by-(\33[31mGage\33[0m)-\nBASIC FUNCTIONS:\n- SUBTRACTION: \33[31m-s/--subtract\33[0m ARG_AMOUNT: 2\n- MULTIPLICATION: \33[31m-m/--multiply\33[0m ARG_AMOUNT: 2\n- DIVISION \33[31m-d/--divide\33[0m ARG_AMOUNT: 2\n- ADDITION: \33[31m-a/--add\33[0m ARG_AMOUNT: 2\n- ADVANCED HELP: \33[31m-H/--help_advanced\33[0m ARG_AMOUNT: 0");
        }
      break;

      case "-H":
      case "--help_advanced":
      // Descriptive advanced help
        if (args.length != 1) {
          System.out.println("No args required for help message.");
          System.exit(0);
        } else {
          System.out.println("-(\33[31mJcalc-v1.0.1\33[0m)-by-(\33[31mGage\33[0m)-\nADVANCED FUNCTIONS:\n- SQUARE ROOT: \33[31m-S/--sqrt\33[0m ARG_AMOUNT: 2\n- SINE: \33[31m--sin\33[0m ARG_AMOUNT: 1\n- CUBE ROOT: \33[31m-c/--cbrt\33[0m ARG_AMOUNT: 1\n- POWER/EXPONENTS: \33[31m-p/--pow\33[0m ARG_AMOUNT: 2\n- MODULUS: \33[31m-M/--mod\33[0m ARG_AMOUNT: 2\n- COSINE: \33[31m-C/--cos\33[0m ARG_AMOUNT: 1\n- TAN: \33[31m-t/--tan\33[0m ARG_AMOUNT: 1\n- LOGARITHM: \33[31m-l/--log\33[0m ARG_AMOUNT: 1\n- ATAN: \33[31m--atan/-T\33[0m ARG_AMOUNT: 2\n- FIBONACCI: --fib/-f [-r/--req -i/--iter --memo --modfib] ARG_AMOUNT: 1-2");
        }
      break;

      case "--tan":
      case "-t":
        // Algorithm: tan using Math.tan
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: --tan number");
          System.exit(0);
        } else {
          int num_tan = Integer.parseInt(args[1]);

          System.out.println("tan(" + Math.toRadians(num_tan % 360) + ") equals " + (Math.tan(Math.toRadians(num_tan % 360))));
        }
      break;

      case "--log":
      case "-l":
      // Algorithm: Natural logarithm using Math.log
      if (args.length != 2) {
        System.out.println("Argument amount not met.\nUsage: --log number");
        System.exit(0);
      } else {
        int num_log = Integer.parseInt(args[1]);

        System.out.println("log(" + num_log + ") equals " + (Math.log(num_log)));
      }
      break;

      case "--atan":
      case "-T":
      // Algorithm: Atan using Math.atan2
        if (args.length != 3) {
          System.out.println("Argument amount not met.\nUsage: --atan number1 number2");
          System.exit(0);
        } else {
          int num1_atan = Integer.parseInt(args[1]);
          int num2_atan = Integer.parseInt(args[2]);

          System.out.println("atan(x: " + num1_atan + " y: " + num2_atan + ") equals: " + (Math.toDegrees(Math.atan2(num1_atan, num2_atan))));
        }
      break;

      case "-f":
      case "--fib":
        switch (args[1]) {
          case "--req":
          case "-r":
            // Algorithm: Recursive fibonacci
            if (args.length != 3) {
              System.out.println("Argument amount not met\nUsage: --fib --req <n>");
              System.exit(0);
            } else {
              int n1_fib_req = Integer.parseInt(args[2]);
              System.out.println("fibonacci(" + n1_fib_req + ") = " + fibRecursive(n1_fib_req));
            }
          break;
          
          case "--iter":
          case "-i":
            // Algorithm: Iterative fibonacci
            if (args.length != 3) {
              System.out.println("Argument amount not met\nUsage: --fib --iter <n>");
              System.exit(0);
            } else {
              int n1_fib_iter = Integer.parseInt(args[2]);
              System.out.println("fibonacci (" + n1_fib_iter + ") = " + fibIterative(n1_fib_iter));
            }
          break;

          case "--memo":
            // Algorithm: memoized fibonacci
            if (args.length != 3) {
              System.out.println("Argument amount not met.\nUsage: --fib --memo <n>");
              System.exit(0);
            } else {
              fibCache.clear();
              int n1_fib_memo = Integer.parseInt(args[2]);

              System.out.println("Memoized fibonacci (" + n1_fib_memo + ") = " + fibMemo(n1_fib_memo));
            }
          break;

          case "--modfib":
            // Algorithm: modulus fibonacci
            if (args.length != 4) {
              System.out.println("Argument amount not met.\nUsage: --fib --modfib");
              System.exit(0);
            } else {
              int num1_modfib = Integer.parseInt(args[1]);
              int num2_modfib = Integer.parseInt(args[2]);

              System.out.println("F(" + num1_modfib + ") % " + num2_modfib + " equals " + modFib(num1_modfib, num2_modfib));
            }
        }
      }
    }
  static long fibRecursive(int n) {
    if (n <= 1) return n;
    return fibRecursive(n - 1) + fibRecursive(n - 2);
  }

  public static long fibIterative(int n) {
    if (n <= 1) return n;

    long a = 0, b = 1; // Fib(0) = 0, Fib(1) = 1
    for (int i = 2; i <= n; i++) {
      long temp = a + b;
      a = b;
      b = temp;
    }
    return b;
  }

  public static long fibMemo(int n) {
    if (n <= 1) return n;
    if (fibCache.containsKey(n)) return fibCache.get(n);

    long result = fibMemo(n - 1) + fibMemo(n - 2);
    fibCache.put(n, result);
    return result;
  }

  public static long modFib(int n, int m) {
    if (n == 0) return 0;
    if (n == 1) return 1 % m;

    long a = 0;
    long b = 1;

    for (int i = 2; i <= n; i++) {
      long c = (a + b) % m;

      a = b;
      b = c;
    }
    return b;
  }
}

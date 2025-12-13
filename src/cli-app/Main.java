/*
 *
 *         ,---._
 *       .-- -.' \                         ,--,
 *       |    |   :                      ,--.'|
 *       :    ;   |                      |  | :
 *       :        |                      :  : '
 *       |    :   :   ,---.     ,--.--.  |  ' |      ,---.
 *       :           /     \   /       \ '  | |     /     \
 *       |    ;   | /    / '  .--.  .-. ||  | :    /    / '
 *   ___ l         .    ' /    \__\/: . .'  : |__ .    ' /
 * /    /\    J   :'   ; :__   ," .--.; ||  | '.'|'   ; :__
 * /  ../  `..-    ,'   | '.'| /  /  ,.  |;  :    ;'   | '.'|
 * \    \         ; |   :    :;  :   .'   \  ,   / |   :    :
 * \    \      ,'   \   \  / |  ,     .-./---`-'   \   \  /
 *  "---....--'      `----'   `--`---'              `----'
 *
 * author: Zero
 * license: MIT
 * creation year: 2025
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  static double lastResult = 0;

  // Memoization cache for --memo flag.
  static Map<Integer, Long> fibCache = new HashMap<>();
  static StringBuilder result = new StringBuilder();

  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("No arguments provided. Use -h or --help for usage info.");
      System.exit(0);
    }
    String command = args[0];
    switch (command) {
      case "-a":
      case "--add":
        // Addition using Integer.parseInt for numbers.
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
        // Multiplication using Integer.parseInt for numbers.
        if (args.length != 3) {
          System.out.println("Argument amount not met.\nUsage: -m number1 number2");
          System.exit(0);
        } else {
          // Make the first and second numbers in front of the flag.
          int num1_mul = Integer.parseInt(args[1]);
          int num2_mul = Integer.parseInt(args[2]);

          System.out.println(
              num1_mul + " Multiplied by " + num2_mul + " equals " + (num1_mul * num2_mul));
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
          System.exit(0);
        } else {
          int num1_div = Integer.parseInt(args[1]);
          int num2_div = Integer.parseInt(args[2]);

          System.out.println(
              num1_div + " Divided by " + num2_div + " equals " + (num1_div / num2_div));
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

          System.out.println(
              pow_base
                  + " raised to the power of "
                  + pow_exp
                  + " is "
                  + (Math.pow(pow_base, pow_exp)));
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

          System.out.println(
              "cos(" + num_cos + " deg) equals " + (Math.cos(Math.toRadians(num_cos))));
        }
        break;

      case "-h":
      case "--help":
        // brief help for basic algorithms
        if (args.length != 1) {
          System.out.println("No args required for help message.");
          System.exit(0);
        } else {
          System.out.println(
              "-(\33[31mJcalc-v1.0.4\33[0m)-by-(\33[31mZero\33[0m)-\n"
                  + "BASIC FUNCTIONS:\n"
                  + "- SUBTRACTION: \33[31m-s/--subtract\33[0m ARG_AMOUNT: 2\n"
                  + "- MULTIPLICATION: \33[31m-m/--multiply\33[0m ARG_AMOUNT: 2\n"
                  + "- DIVISION \33[31m-d/--divide\33[0m ARG_AMOUNT: 2\n"
                  + "- ADDITION: \33[31m-a/--add\33[0m ARG_AMOUNT: 2\n"
                  + "- ADVANCED HELP: \33[31m-H/--help_advanced\33[0m ARG_AMOUNT: 0");
        }
        break;

      case "-H":
      case "--help_advanced":
        // Descriptive advanced help
        if (args.length != 1) {
          System.out.println("No args required for help message.");
          System.exit(0);
        } else {
          System.out.println(
              "-(\33[31mJcalc-v1.0.4\33[0m)-by-(\33[31mZero\33[0m)-\n"
                  + "ADVANCED FUNCTIONS:\n"
                  + "- SQUARE ROOT: \33[31m-S/--sqrt\33[0m ARG_AMOUNT: 2\n"
                  + "- SINE: \33[31m--sin\33[0m ARG_AMOUNT: 1\n"
                  + "- CUBE ROOT: \33[31m-c/--cbrt\33[0m ARG_AMOUNT: 1\n"
                  + "- POWER/EXPONENTS: \33[31m-p/--pow\33[0m ARG_AMOUNT: 2\n"
                  + "- MODULUS: \33[31m-M/--mod\33[0m ARG_AMOUNT: 2\n"
                  + "- COSINE: \33[31m-C/--cos\33[0m ARG_AMOUNT: 1\n"
                  + "- TAN: \33[31m-t/--tan\33[0m ARG_AMOUNT: 1\n"
                  + "- LOGARITHM: \33[31m-l/--log\33[0m ARG_AMOUNT: 1\n"
                  + "- ATAN: \33[31m--atan/-T\33[0m ARG_AMOUNT: 2\n"
                  + "- FIBONACCI: \33[31m--fib/-f\33[0m [\33[31m-r/--req -i/--iter --memo"
                  + " --modfib\33[0m] ARG_AMOUNT: 1-2\n"
                  + "- CONVERSION: \33[31m--conv\33[0m [\33[31m-hex/--hexadecimal"
                  + " --binary/-b\33[0m] ARG_AMOUNT: 3\n"
                  + "- EXPRESSION PARSING: \33[31m--parse/-P\33[0m ARG_AMOUNT: null\n"
                  + "- NATURAL LOGARITHM: \33[31m-nl/--naturallog\33[0m ARG_AMOUNT: 1\n"
                  + "- ADDEXACT: \33[31m-ae/--addexact\33[0m ARG_AMOUNT: 3\n"
                  + "- SUBTRACTEXACT \33[31m-se/--subtractexact\33[0m ARG_AMOUNT: 2\n"
                  + "- MULTIPLYEXACT \33[31m-me/--multiplyexact\33[0m ARG_AMOUNT: 2\n"
                  + "- DIVIDEEXACT \33[31m-de/--divideexact\33[0m ARG_AMOUNT: 2"
                  + "- ROUND \33[31m-r/--round\33[0m ARG_AMOUNT: 1");
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

          System.out.println(
              "tan("
                  + Math.toRadians(num_tan % 360)
                  + ") equals "
                  + (Math.tan(Math.toRadians(num_tan % 360))));
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

          System.out.println("log10(" + num_log + ") equals " + (Math.log10(num_log)));
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

          System.out.println(
              "atan(x: "
                  + num1_atan
                  + " y: "
                  + num2_atan
                  + ") equals: "
                  + (Math.toDegrees(Math.atan2(num1_atan, num2_atan))));
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
              System.out.println("Argument amount not met.\nUsage: --fib --memo <number>");
              System.exit(0);
            } else {
              fibCache.clear();
              int n1_fib_memo = Integer.parseInt(args[2]);

              System.out.println(
                  "Memoized fibonacci (" + n1_fib_memo + ") = " + fibMemo(n1_fib_memo));
            }
            break;

          case "--modfib":
            // Algorithm: modulus fibonacci
            if (args.length != 4) {
              System.out.println("Argument amount not met.\nUsage: --fib --modfib number1 number2");
              System.exit(0);
            } else {
              int num1_modfib = Integer.parseInt(args[2]);
              int num2_modfib = Integer.parseInt(args[3]);

              System.out.println(
                  "F("
                      + num1_modfib
                      + ") % "
                      + num2_modfib
                      + " equals "
                      + modFib(num1_modfib, num2_modfib));
            }
            break;
          default:
            System.out.println("Unknown argument: " + args[1]);
            System.exit(0);
            break;
        }
        break;

      case "--conv": // convert commands using Integer.parseInt, Math, etc
        switch (args[1]) {
          case "--binary": // binary flags
          case "-b":
            if (args.length != 4) {
              System.out.println(
                  "Argument amount not met\n"
                      + "Usage: --binary <number> <type>\n"
                      + "Types: 1 = convert to decimal 2 = convert to hexadecimal 3 = covert to"
                      + " octal 4 = convert to ASCII");
            } else {
              try {
                String num1_bin_conv = args[2];
                int type_bin_conv = Integer.parseInt(args[3]);
                int dec_bin_conv = Integer.parseInt(num1_bin_conv, 2);

                if (type_bin_conv == 1) {
                  System.out.println(num1_bin_conv + " in decimal is " + dec_bin_conv);
                } else if (type_bin_conv == 2) {
                  String hex_bin_conv = Integer.toHexString(dec_bin_conv);

                  System.out.println(
                    "Binary: " + num1_bin_conv + " -> hexadecimal: " + hex_bin_conv.toUpperCase());
                } else if (type_bin_conv == 3) {
                  String oct_bin_conv = Integer.toOctalString(dec_bin_conv);

                  System.out.println("Binary: " + num1_bin_conv + " -> octal: " + oct_bin_conv);
                } else if (type_bin_conv == 4) {
                  System.out.println(
                      "Binary: " + num1_bin_conv + " -> ASCII: " + (binaryToText(num1_bin_conv)));
              
                }
              } catch (NumberFormatException e) {
                System.out.println("Error: number format exception");
                System.exit(0);
              } catch (ArithmeticException e) {
                System.out.println("Error: overflow");
              }
            }
            break;

          case "-hex":
          case "--hexadecimal":
            if (args.length != 4) {
              System.out.println(
                  "Argument amount not met\n"
                      + "Usage: --hexadecimal <number> <type>\n"
                      + "Types: 1 = convert hexadecimal to decimal 2 = convert hexadecimal to"
                      + " binary 3 = convert hexadecimal to octal");
            }
            String num1_hex_conv = args[2];
            int type_hex_conv = Integer.parseInt(args[3]);
            if (type_hex_conv == 1) {
              try {
                int dec_hex_conv = Integer.parseInt(num1_hex_conv, 16);

                System.out.println(
                    "hexadecimal: " + num1_hex_conv + " -> Decimal: " + dec_hex_conv);
              } catch (NumberFormatException e) {
                System.out.println("Error: number format exception");

                System.exit(0);
              }
            } else if (type_hex_conv == 2) {
              try {
                int dec_hex_conv = Integer.parseInt(num1_hex_conv, 16);

                String bin_hex_conv = Integer.toBinaryString(dec_hex_conv);

                System.out.println("hexadecimal: " + num1_hex_conv + " -> Binary: " + bin_hex_conv);
              } catch (NumberFormatException e) {
                System.out.println("Error: number format exception");
                System.exit(0);
              }
            } else if (type_hex_conv == 3) {
              try {
                int dec_hex_conv = Integer.parseInt(num1_hex_conv, 16);

                String oct_hex_conv = Integer.toOctalString(dec_hex_conv);

                System.out.println("hexadecimal: " + num1_hex_conv + " -> octal: " + oct_hex_conv);
              } catch (NumberFormatException e) {
                System.out.println("Error: invalid hexadecimal number");
                System.exit(0);
              }
            } else if (type_hex_conv == 4) {
              try {
                String ascii_hex_conv = hexToText(num1_hex_conv);

                System.out.println("hexadecimal: " + num1_hex_conv + " ASCII: " + ascii_hex_conv);
              } catch (NumberFormatException e) {
                System.out.println("Error: number format exception");
                System.exit(0);
              }
            }
            break;
          default:
            System.out.println("Unknown flag: " + args[1]);
            break;
        } // end convert switch
        break;

      case "--parse":
      case "-P":
        interactiveMode();
        break;

      case "-nl":
      case "--naturallog":
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: -nl <number>");
          System.exit(0);
        } else {
          try {
        int num_natural_log = Integer.parseInt(args[1]);

        System.out.println(
            "Natural logarithm of: " + num_natural_log + " equals: " + Math.log(num_natural_log));
          } catch (NumberFormatException e) {
            System.out.println("Error: number format exception");
            System.exit(0);
          } catch (ArithmeticException e) {
            System.out.println("Error: overflow");
            System.exit(0);
          }
        }
        break;

      default:
        System.out.println("Unknown flag: " + command);
      break;

      case "-ae":
      case "--addexact":
        // Algorithm: addExact
        if (args.length != 3) {
          System.out.println("Argument amount not met\nUsage: -ae <number> <number>");
          System.exit(0);
        } else {
           try {
            int num1_ae = Integer.parseInt(args[1]);
            int num2_ae = Integer.parseInt(args[2]);

            System.out.println(num1_ae + " plus " + num2_ae + " equals " + (Math.addExact(num1_ae, num2_ae)));
          } catch (ArithmeticException e) {
            System.out.println("Error: Overflow");
            System.exit(0);
          } catch (NumberFormatException e) {
            System.out.println("Error: number format exception");
            System.exit(0);
          }
        }
        break;

      case "-se":
      case "--subtractexact":
        if (args.length != 3) {
          System.out.println("Argument amount not met\nUsage: -se <number> <number>");
          System.exit(0);
        } else {
          try {
            int num1_se = Integer.parseInt(args[1]);
            int num2_se = Integer.parseInt(args[2]);

            System.out.println(num1_se + " plus " + num2_se + " equals " + (Math.subtractExact(num1_se, num2_se)));
          } catch (ArithmeticException e) {
            System.out.println("Error: Overflow");
            System.exit(0);
          } catch (NumberFormatException e) {
            System.out.println("Invalid number format for subtractExact");
          }
        }
      break;
      
      case "-me":
      case "--multiplyexact":
        if (args.length != 3) {
          System.out.println("Argument amount not met\nUsage: -me <number> <number>");
          System.exit(0);
        } else {
          try {
            int num1_me = Integer.parseInt(args[1]);
            int num2_me = Integer.parseInt(args[2]);


            System.out.println(num1_me + " times " + num2_me + " equals " + (Math.multiplyExact(num1_me, num2_me)));
          } catch (ArithmeticException e) {
            System.out.println("Error: overflow");
            System.exit(0);
          } catch (NumberFormatException e) {
            System.out.println("Error: number format exception");
            System.exit(0);
          }
        }
      break;

      case "-de":
      case "--divideexact":
        if (args.length != 3) {
          System.out.println("Argument amount not met.\nUsage: -de <number> <number>");
          System.exit(0);
        } else {
          try {
            int num1_de = Integer.parseInt(args[1]);
            int num2_de = Integer.parseInt(args[2]);


            System.out.println(num1_de + " divided by " + num2_de + " equals " + (Math.divideExact(num1_de, num2_de)));
          } catch (ArithmeticException e) {
            System.out.println("Error: overflow");
            System.exit(0);
          } catch (NumberFormatException e) {
            System.out.println("Error: number format Exception");
            System.exit(0);
          }
        }
      break;

      case "-r":
      case "--round":
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: -r <number>");
          System.exit(0);
        } else {
          try {
            float num_r = Float.parseFloat(args[1]);

            System.out.println("The answer is: " + (Math.round(num_r)));
          } catch (NumberFormatException e) {
            System.out.println("Error: number format exception");
            System.exit(0);
          } catch (ArithmeticException e) {
            System.out.println("Error: overflow");
          }
        }
      break;
    } // end command switch
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

  public static long fibRecursive(int n) {
    if (n <= 1) return n;
    return fibRecursive(n - 1) + fibRecursive(n - 2);
  }

  public static String binaryToText(String binary) {
    // Pad the binary string with leading zeros to make length a multiple of 8.
    int padding = (8 - binary.length() % 8) % 8;
    String paddedBinary = "0".repeat(padding) + binary;

    result.setLength(0); // Clear previous results
    for (int i = 0; i < paddedBinary.length(); i += 8) {
      String byteChunk = paddedBinary.substring(i, i + 8);
      int charCode = Integer.parseInt(byteChunk, 2);
      result.append((char) charCode);
    }

    return result.toString();
  }

  public static String hexToText(String hex) {
    for (int i = 0; i < hex.length(); i += 2) {
      // get two hex characters
      String str = hex.substring(i, i + 2);
      // convert to decimal and then to char
      result.append((char) Integer.parseInt(str, 16));
    }

    return result.toString();
  }

  public static void interactiveMode() {
    Scanner sc = new Scanner(System.in);
    double lastResult = 0.0;

    System.out.println("Welcome to \33[1;31mJCalc\33[0m Interactive Mode!");
    System.out.println("Type mathematical expressions to evaluate.");
    System.out.println("Use '\33[1;31mans\33[0m' to refer to the last result.");
    System.out.println(
        "Type '\33[1;31mhelp\33[0m' for commands or '\33[1;31mexit\33[0m' to quit.\n");

    while (true) {
      System.out.print("Jcalc> ");
      String input = sc.nextLine().trim();

      if (input.isEmpty()) continue;

      switch (input.toLowerCase()) {
        case "exit":
        case "quit":
          System.out.println("Exiting...");
          return;

        case "help":
          System.out.println(
              """
              Commands:
                \33[31mhelp\33[0m      Show this message
                \33[31mexit\33[0m      Quit JCalc
                 \33[31mquit\33[0m      Same as exit
                \33[31mans\33[0m       Use last result in an expression
                 \33[31mcos\33[0m       Calculate the cosine of an angle
                 \33[31msin\33[0m       Find the sine of an angle
                 \33[31mabs\33[0m       Find the absolute value of an equation
                 \33[31msqrt\33[0m      Find the square root of a number
                 \33[31mcbrt\33[0m      Find the cube root of a number
                 \33[31m(\33[0m         Used in Order Of Operations; Syntax rule: Must have a closing bracket.
                 \33[31me\33[0m         The mathematical constant e is the base of natural logarithm. It is approximately equal to 2.18.
                 \33[31mlog\33[0m       Used in logarithm problems
                 \33[31mnl\33[0m        Used for natural logarithm problems
              Examples:
                \33[31m2 + 3 * 4
                 ans / 2
                 cos 778
                 sin 67
                 tan 72
                 sqrt 4
                 (2 * 4) / (2 + 2)
                 cbrt (pi + 0)
                 abs 998 + 5
                 e + 0\33[0m
              """);
          continue;

        default:
          try {
            ExpressionParser parser = new ExpressionParser(input, lastResult);
            double result = parser.parse();
            lastResult = result;
            System.out.println("Result: " + result);
          } catch (Exception e) {
            System.out.println(" Error: " + e.getMessage());
          }
      }
    }
  }
}

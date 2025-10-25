public class Main {
  public static void main(String[] args) {
    String command = args[0];
    if (args.length == 0) {
    System.out.println("No arguments provided. Use -h or --help for usage info.");
    System.exit(0);
    }
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
          System.out.println("-(\33[31mJcalc\33[0m)-by-(\33[31mGage\33[0m)-\nBASIC FUNCTIONS:\n- SUBTRACTION: -s/--subtract ARG_AMOUNT: 2\n- MULTIPLICATION: -m/--multiply ARG_AMOUNT: 2\n- DIVISION -d/--divide ARG_AMOUNT: 2\n- ADDITION: -a/--add ARG_AMOUNT: 2\n- ADVANCED HELP: -H/--help_advanced");
        }
      break;

      case "-H":
      case "--help_advanced":
      // Descriptive advanced help
        if (args.length != 1) {
          System.out.println("No args required for help message.");
          System.exit(0);
        } else {
          System.out.println("-(\33[31mJcalc\33[0m)-by-(\33[31mGage\33[0m)-\nADVANCED FUNCTIONS:\n- SQUARE ROOT: -S/--sqrt ARG_AMOUNT: 2\n- SINE: --sin ARG_AMOUNT: 1\n- CUBE ROOT: -c/--cbrt ARG_AMOUNT: 1\n- POWER/EXPONENTS: -p/--pow ARG_AMOUNT: 2\n- MODULUS: -M/--mod ARG_AMOUNT: 2\n- COSINE: -C/--cos ARG_AMOUNT: 1\n- TAN: -t/--tan ARG_AMOUNT: 1\n- LOGARITHM: -l/--log ARG_AMOUNT: 1\n- ATAN: --atan/-T ARG_AMOUNT: 2");
        }
      break;

      case "--tan":
      case "-t":
      // Algorithm: tan using Math.tan
        if (args.length != 2) {
          System.out.println("Argument amount not met.\nUsage: --tan number");
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
        } else {
          int num1_atan = Integer.parseInt(args[1]);
          int num2_atan = Integer.parseInt(args[2]);

          System.out.println("atan(x: " + num1_atan + " y: " + num2_atan + ") equals: " + (Math.toDegrees(Math.atan2(num1_atan, num2_atan))));
        }
    }
  }
}

# JCalc
![Release](https://img.shields.io/badge/release-1.0.4-blue) ![Java](https://img.shields.io/badge/Java-OpenJDK-brightgreen?logo=java&logoColor=white)

 Features: 
- Addition
- Subtraction
- Multiplication
- Division
- Square root
- Cube root
- Sine
- Power/Exponents
- Modulus
- Cosine
- Tan
- Logarithm
- Atan2
- Fibonacci algorithms
- Conversion
- Time conversions (all major units)
- Custom expression parser
- Exact expressions (Add and Subtract)

Addition:
```bash
java -jar jcalc-1.0.4.jar --add 10 20
```

Subtraction:
```bash
java -jar jcalc-1.0.4.jar --subtract 20 10
```
Multiplication:
```bash
java -jar jcalc-1.0.4.jar --multiply 20 10
```
Division:
```bash
java -jar jcalc-1.0.4.jar --divide 4 2
```
Square root:
```bash
java -jar jcalc-1.0.4.jar --sqrt 5
```
Cube root:
```bash
java -jar jcalc-1.0.4.jar --cbrt 5
```
Sine:
```bash
java -jar jcalc-1.0.4.jar --sin 10
```
Power/Exponents:
```bash
java -jar jcalc-1.0.4.jar --pow 12 16
```
Modulus:
```bash
java -jar jcalc-1.0.4.jar --mod 16 12
```
Cosine:
```bash
java -jar jcalc-1.0.4.jar --cos 66 
```
Tan:
```bash
java -jar jcalc-1.0.4.jar --tan 78
```
Logarithm:
```bash
java -jar jcalc-1.0.4.jar --log 67
```
Fibonacci algorithms:
```bash
java -jar jcalc-1.0.4.jar --fib --req 62
```
```bash
java -jar jcalc-1.0.4.jar --fib --iter 63
```
```bash
java -jar jcalc-1.0.4.jar --fib --memo 10
```
Conversion:
```bash
java -jar jcalc-1.0.4.jar --conv --binary 1101 1
java -jar jcalc-1.0.4.jar --conv --hexadecimal 1E25 1
```
Time conversions:
```bash
# Convert 60 minutes to seconds
java -jar jcalc-1.0.4.jar --conv --time --minutes 1 60

# Convert 1 hour to minutes  
java -jar jcalc-1.0.4.jar --conv --time --hours 2 1

# Convert 1 day to hours
java -jar jcalc-1.0.4.jar --conv --time --days 1 1

# Convert 3600 seconds to minutes
java -jar jcalc-1.0.4.jar --conv --time --seconds 1 3600
```

Supported time units: nanoseconds, microseconds, milliseconds, seconds, minutes, hours, days, weeks, months, years, decades, centuries, millennia. Use --conv --time --help for detailed usage.

ExpressionParser:
```bash
java -jar jcalc-1.0.4.jar --parse
```
addExact:
```bash
java -jar jcalc-1.0.4.jar --addexact 30 20
```
subtractExact:
```bash
java -jar jcalc-1.0.4.jar --subtractexact 10 5
```
MultiplyExact:
```bash
java -jar jcalc-1.0.4.jar --multiplyexact 10 3
```
```
```
Rounding:
```bash
java -jar jcalc-1.0.4.jar --round 512.5
```
divideExact:
```bash
java -jar jcalc-1.0.4.jar --divideexact 10 2
```
P.S I would do screenshots but I use a tilling WM on Wayland compositing

> [!IMPORTANT]
> Generously licensed under MIT. See [LICENSE](/docs/LICENSE) for details.
> Use `-h` for help and `-H` for advanced help
> Currently looking for maintainers. E-Mail me at aafire@firemail.cc with your application. Please include a long description of why I should trust you to help maintain my project, Your PGP public key, and your preferred way of contact.

> [!WARNING]
> *"TESTED WITH JDK-26-EA, BEWARE OF JDK CONFLICTS."*

FUNDING DISCLAIMER: Funding is not required for usage of this software nor integration of this software's source code.
> But funding is appericiated. You can fund my work with Monero.
> E-Mail me for my funding address, because I do not want web scrapers scanning this page and finding my payment info.

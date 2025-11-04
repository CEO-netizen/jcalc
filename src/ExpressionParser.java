public class ExpressionParser {
	private final String expression;
	private int pos = -1;
	private char ch;
	private double lastResult = 0;

	public ExpressionParser(String expression, double lastResult) {
		this.expression = expression;
		this.lastResult = lastResult;
		nextChar();
	}

	private void nextChar() {
		pos++;
		ch = pos < expression.length() ? expression.charAt(pos) : '\0';
	}

	private boolean eat(char charToEat) {
		while (ch == ' ')
			nextChar();
		if (ch == charToEat) {
			nextChar();
			return true;

		}
		return false;

	}

	public double parse() {
		double x = parseExpression();
		if (pos < expression.length())
			throw new RuntimeException("Unexpected: " + ch);
		lastResult = x;
		return x;
	}

	private double parseExpression() {
		double x = parseTerm();
		while (true) {
			if (eat('+')) x += parseFactor();
			else if (eat('-')) x -= parseFactor();
			else return x;
		}
	}

	private double parseTerm() {
		double x = parseFactor();
		while (true) {
			if (eat('*'))
				x *= parseFactor();
			else if (eat('/'))
				x /= parseFactor();
			else
				return x;
		}
	}

	private double parseFactor() {
		if (eat('+'))
			return parseFactor();
		if (eat('-'))
			return parseFactor();

		double x;
		int startPos = this.pos;

		if (eat('(')) {
			x = parseExpression();
			if (!eat(')'))
				throw new RuntimeException("Missing closing bracket.");
		} else if ((ch >= '0' && ch <= '9') || ch == '.') {
			while ((ch >= '0' && ch <= '9') || ch == '.')
				nextChar();
			x = Double.parseDouble(expression.substring(startPos, this.pos));
		} else if (ch >= 'a' && ch <= 'z') {
			while (ch >= 'a' && ch <= 'z')
				nextChar();
			String func = expression.substring(startPos, this.pos);
			x = parseFactor();
			x = applyFunction(func, x);
		} else {
			throw new RuntimeException("Unexpected: " + ch);
		}

		if (eat('^'))
			x = Math.pow(x, parseFactor());
		return x;
	}

	private double applyFunction(String func, double x) {
		return switch (func) {
		case "sin" -> Math.sin(Math.toRadians(x));
		case "cos" -> Math.cos(Math.toRadians(x));
		case "tan" -> Math.tan(Math.toRadians(x));
		case "sqrt" -> Math.sqrt(x);
		case "log" -> Math.log10(x);
		case "ln" -> Math.log(x);
		case "abs" -> Math.abs(x);
		case "pi" -> Math.PI;
		case "e" -> Math.E;
		case "ans" -> lastResult;
    case "cbrt" -> Math.cbrt(x);
		default -> throw new RuntimeException("Unknown function: " + func);
		};
	}
}

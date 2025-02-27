public class Operator {
	 public static void main(String[] args) {
	        // === Arithmetic Operators ===
	        System.out.println("=== Arithmetic Operators ===");
	        int a = 10, b = 3;
	        System.out.println("a = " + a + ", b = " + b);
	        System.out.println("Addition (a + b): " + (a + b));
	        System.out.println("Subtraction (a - b): " + (a - b));
	        System.out.println("Multiplication (a * b): " + (a * b));
	        System.out.println("Division (a / b): " + (a / b)); // Integer division
	        System.out.println("Modulus (a % b): " + (a % b));

	        // === Unary Operators ===
	        System.out.println("\n=== Unary Operators ===");
	        int c = 5;
	        System.out.println("Initial c: " + c);
	        System.out.println("Pre-increment (++c): " + (++c)); // c becomes 6
	        System.out.println("Post-increment (c++): " + (c++));  // prints 6 then c becomes 7
	        System.out.println("After post-increment, c: " + c);
	        System.out.println("Pre-decrement (--c): " + (--c)); // c becomes 6
	        System.out.println("Post-decrement (c--): " + (c--));  // prints 6 then c becomes 5
	        System.out.println("After post-decrement, c: " + c);
	        System.out.println("Unary minus (-c): " + (-c));       // negation of c
	        System.out.println("Unary plus (+c): " + (+c));        // remains 5
	        System.out.println("Logical NOT (!true): " + (!true)); // negates boolean true

	        // === Shift Operators ===
	        System.out.println("\n=== Shift Operators ===");
	        int d = 8; // binary: 1000
	        System.out.println("d = " + d);
	        System.out.println("Left shift (d << 1): " + (d << 1));  // 16 (10000)
	        System.out.println("Right shift (d >> 1): " + (d >> 1));  // 4 (0100)
	        System.out.println("Unsigned right shift (d >>> 1): " + (d >>> 1)); // 4

	        // === Relational and Equality Operators ===
	        System.out.println("\n=== Relational and Equality Operators ===");
	        System.out.println("a > b: " + (a > b));
	        System.out.println("a < b: " + (a < b));
	        System.out.println("a >= b: " + (a >= b));
	        System.out.println("a <= b: " + (a <= b));
	        System.out.println("Equality (a == b): " + (a == b));
	        System.out.println("Inequality (a != b): " + (a != b));

	        // === Logical Operators ===
	        System.out.println("\n=== Logical Operators ===");
	        boolean x = true, y = false;
	        System.out.println("x = " + x + ", y = " + y);
	        System.out.println("Logical AND (x && y): " + (x && y));
	        System.out.println("Logical OR (x || y): " + (x || y));
	        System.out.println("Logical NOT (!(x && y)): " + (!(x && y)));

	        // === Bitwise Operators ===
	        System.out.println("\n=== Bitwise Operators ===");
	        int e = 6;  // binary: 110
	        int f = 3;  // binary: 011
	        System.out.println("e = " + e + " (binary 110), f = " + f + " (binary 011)");
	        System.out.println("Bitwise AND (e & f): " + (e & f));   // 010 (2)
	        System.out.println("Bitwise OR (e | f): " + (e | f));    // 111 (7)
	        System.out.println("Bitwise XOR (e ^ f): " + (e ^ f));   // 101 (5)
	        System.out.println("Bitwise Complement (~e): " + (~e));  // flips all bits

	        // === Ternary Operator ===
	        System.out.println("\n=== Ternary Operator ===");
	        int max = (a > b) ? a : b; // if a > b then max = a, else max = b
	        System.out.println("Ternary operator: max = " + max);

	        // === Assignment Operators ===
	        System.out.println("\n=== Assignment Operators ===");
	        int g = 5;
	        System.out.println("Initial g: " + g);
	        g += 3;  // equivalent to: g = g + 3
	        System.out.println("After g += 3: " + g);
	        g -= 2;  // equivalent to: g = g - 2
	        System.out.println("After g -= 2: " + g);
	        g *= 2;  // equivalent to: g = g * 2
	        System.out.println("After g *= 2: " + g);
	        g /= 4;  // equivalent to: g = g / 4
	        System.out.println("After g /= 4: " + g);
	        g %= 3;  // equivalent to: g = g % 3
	        System.out.println("After g %= 3: " + g);
	    }
	}
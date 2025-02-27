public class NonpremtivDatatype{
	    public static void main(String[] args) {
	        // --- Original Operations ---
	        String object = "hello re";
	        String newObject = new String("jay shr shayam");
	        String firstname = "Vinod";
	        String lastname = "kamli";
	        // Concatenate firstname and lastname with a space in between.
	        String fullname = firstname + " " + lastname;
	        
	        System.out.println("object: " + object);
	        System.out.println("newObject: " + newObject);
	        System.out.println("firstname: " + firstname);
	        System.out.println("fullname: " + fullname);
	        System.out.println("Length of firstname: " + firstname.length());
	        System.out.println("object after replace('l', 'a'): " + object.replace('l', 'a'));
	        System.out.println("newObject substring (from index 8 to end): " + newObject.substring(8, newObject.length()));
	        
	        // --- Additional String Operations ---
	        
	        // 1. Convert to Uppercase and Lowercase
	        System.out.println("\n--- Uppercase and Lowercase ---");
	        System.out.println("object to uppercase: " + object.toUpperCase());
	        System.out.println("newObject to lowercase: " + newObject.toLowerCase());
	        
	        // 2. Trimming Whitespaces
	        System.out.println("\n--- Trimming ---");
	        String padded = "   padded string   ";
	        System.out.println("Before trim: '" + padded + "'");
	        System.out.println("After trim: '" + padded.trim() + "'");
	        
	        // 3. Finding the Index of a Substring
	        System.out.println("\n--- IndexOf ---");
	        System.out.println("Index of 're' in object: " + object.indexOf("re"));
	        
	        // 4. Retrieving a Character at a Specific Position
	        System.out.println("\n--- charAt ---");
	        System.out.println("Character at index 1 in firstname: " + firstname.charAt(1));
	        
	        // 5. String Equality Checks
	        System.out.println("\n--- Equality Checks ---");
	        String s1 = "Hello";
	        String s2 = "hello";
	        System.out.println("s1 equals s2: " + s1.equals(s2));                // Case-sensitive
	        System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2)); // Case-insensitive
	        
	        // 6. Comparing Strings Lexicographically
	        System.out.println("\n--- compareTo ---");
	        System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
	        
	        // 7. Splitting a String into an Array of Words
	        System.out.println("\n--- Split ---");
	        String sentence = "Java is fun to learn";
	        String[] words = sentence.split(" "); // Splits the sentence by spaces
	        System.out.println("Words in sentence:");
	        for (String word : words) {
	            System.out.println(word);
	        }
	        
	        // 8. Concatenation Using the concat() Method
	        System.out.println("\n--- concat() Method ---");
	        String concatExample = firstname.concat(" ").concat(lastname);
	        System.out.println("Concatenated fullname: " + concatExample);
	        
	        // 9. Checking for a Substring using contains()
	        System.out.println("\n--- contains() Method ---");
	        System.out.println("Does fullname contain 'Vin'? " + fullname.contains("Vin"));
	        
	        // 10. Replacing a Substring with replaceAll() (using regex)
	        System.out.println("\n--- replaceAll() Method ---");
	        String replacedAll = newObject.replaceAll("sh", "SH");
	        System.out.println("newObject after replaceAll('sh', 'SH'): " + replacedAll);
	    }
	}

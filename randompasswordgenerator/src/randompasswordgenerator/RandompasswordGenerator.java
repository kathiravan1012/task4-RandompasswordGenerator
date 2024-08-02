package randompasswordgenerator;
import java.util.Scanner;
import java.util.Random;

public class RandompasswordGenerator {
	    public static String generatePassword(int length, boolean includeNumbers, boolean includeLowercase, 
	                                          boolean includeUppercase, boolean includeSpecial) {
	        String numbers = "0123456789";
	        String lowercase = "abcdefghijklmnopqrstuvwxyz";
	        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	        String special = "!@#$%^&*()-_+=<>?";
	        StringBuilder characterPool = new StringBuilder();
	        if (includeNumbers) {
	            characterPool.append(numbers);
	        }
	        if (includeLowercase) {
	            characterPool.append(lowercase);
	        }
	        if (includeUppercase) {
	            characterPool.append(uppercase);
	        }
	        if (includeSpecial) {
	            characterPool.append(special);
	        }
	        String characterPoolString = characterPool.toString();
	        Random random = new Random();
	        StringBuilder password = new StringBuilder();
	        for (int i = 0; i < length; i++) {
	            int index = random.nextInt(characterPoolString.length());
	            password.append(characterPoolString.charAt(index));
	        }

	        return password.toString();
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the desired length of the password: ");
	        int length = scanner.nextInt();
	        System.out.print("Include numbers? (true/false): ");
	        boolean includeNumbers = scanner.nextBoolean();

	        System.out.print("Include lowercase letters? (true/false): ");
	        boolean includeLowercase = scanner.nextBoolean();

	        System.out.print("Include uppercase letters? (true/false): ");
	        boolean includeUppercase = scanner.nextBoolean();

	        System.out.print("Include special characters? (true/false): ");
	        boolean includeSpecial = scanner.nextBoolean();

	        
	        String password = generatePassword(length, includeNumbers, includeLowercase, includeUppercase, includeSpecial);

	        
	        System.out.println("Generated password: " + password);

	        
	        scanner.close();
	    }
	}


	




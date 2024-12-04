
public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");/*
                                                 * /
                                                 * System.out.println(contains("unhappy", "happy")); // true
                                                 * System.out.println(contains("happy", "unhappy")); // false
                                                 * System.out.println(contains("historical", "story")); // false
                                                 * System.out.println(contains("psychology", "psycho")); // true
                                                 * System.out.println(contains("personality", "son")); // true
                                                 * System.out.println(contains("personality", "dad")); // false
                                                 * System.out.println(contains("resignation", "sign")); // true
                                                 */
        System.out.println(contains("baba yaga", "baba"));
        System.out.println(contains("baba yaga", ""));
        System.out.println(contains("baba yaga", "John Wick is the baba yaga"));
        System.out.println(contains("baba yaga", "Yaga"));
        System.out.println(contains("baba yaga", "babayaga"));

    }

    /** Returns the lowercase version of the given string. */
    public static String lowerCase(String str) {

        // Replace the following statement with your code
        return str.toLowerCase();
    }

    /** If str1 contains str2, returns true; otherwise returns false. */
    public static boolean contains(String str1, String str2) {
        if (str2.length() == 0){return true;}
        str1 = removeSpaces(lowerCase(str1));
        str2 = removeSpaces(lowerCase(str2));
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(0)) {
                int j = 0;
                while (j < str2.length()) {
                    if (i + j + 1 > str1.length()) {
                        break;
                    }
                    if (str1.charAt(i + j) == str2.charAt(j)) {
                        j++;
                    } else {
                        break;
                    }
                }
                if (j == str2.length()) {
                    return true;
                }
            }
        }
        // Replace the following statement with your code
        return false;
    }

    public static String removeSpaces(String str){
		String returned_string = "";
		str = str.toLowerCase();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if ((ch <= 'z' && ch >= 'a') || (ch >= '0' && ch <= '9')) {
				returned_string = returned_string + ch;
			}

		}
		// Replace the following statement with your code
		return returned_string;
	
	}
}

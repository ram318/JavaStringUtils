
/**
 * @author avram
 */

public class StringUtils {

	public static String toAlternateCase(String inString, boolean firstletterUpper) {
        char[] textarray = inString.toCharArray();
        boolean smallcase = firstletterUpper;
        for (int i = 0; i < textarray.length; i++) {
            int j = textarray[i];
            if (j > 64 && j < 91) {
                if (!smallcase)
                    j = j + 32;
                smallcase = !smallcase;
            } else if (j > 96 && j < 123) {
                if (smallcase)
                    j = j - 32;
                smallcase = !smallcase;
            }
            textarray[i] = new Character((char) j).charValue();
        }
        return new String(textarray);
	}
	
	
	public static String toReverseCase(String inString) {
        char[] textarray = inString.toCharArray();
        for (int i = 0; i < textarray.length; i++) {
            int j = textarray[i];
            if (j > 64 && j < 91)
                j = j + 32;
            else if (j > 96 && j < 123)
                j = j - 32;
            textarray[i] = new Character((char) j).charValue();

        }
        return new String(textarray);
    }
}

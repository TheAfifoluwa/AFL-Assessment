public class Question10 {

    // Create a function that converts any string value to a sentence case,
    //Then write a unit test that checks the function's correctness
    //The unit test can be found in the test module of this project
    private static final String WORD_SEPARATORS = " .-_/()";
    public static String toSentenceCase(final String s) {

        final StringBuilder sb = new StringBuilder(s);
        return toSentenceCase(sb).toString();
    }

    private static StringBuilder toSentenceCase(final StringBuilder sb) {
        boolean capitalizeNext = true;
        for (int i = 0; i < sb.length(); i++) {
            final char c = sb.charAt(i);
            if (c == '.') {
                capitalizeNext = true;
            } else if (capitalizeNext && !isSeparator(c)) {
                sb.setCharAt(i, Character.toTitleCase(c));
                capitalizeNext = false;
            } else if (!Character.isLowerCase(c)) {
                sb.setCharAt(i, Character.toLowerCase(c));
            }
        }
        return sb;
    }

    private static boolean isSeparator(char c) {
        return WORD_SEPARATORS.indexOf(c) >= 0;
    }

}

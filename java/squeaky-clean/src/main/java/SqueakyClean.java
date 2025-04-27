class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder result = new StringBuilder();

        // Step 1: Replace spaces with underscores
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isWhitespace(c)) {
                result.append('_'); // Replace space with underscore
            } else {
                result.append(c); // Keep the character as is
            }
        }

        // Step 2: Convert kebab-case to camelCase
        StringBuilder camelCaseResult = new StringBuilder();
        boolean toUpper = false;
        for (int i = 0; i < result.length(); i++) {
            char c = result.charAt(i);
            if (c == '-') {
                toUpper = true; // Mark the next character to be upper case
            } else {
                if (toUpper) {
                    camelCaseResult.append(Character.toUpperCase(c)); // Convert to uppercase
                    toUpper = false;
                } else {
                    camelCaseResult.append(c); // Keep character as is
                }
            }
        }

        // Step 3: Convert leetspeak to normal text
        StringBuilder leetspeakResult = new StringBuilder();
        for (int i = 0; i < camelCaseResult.length(); i++) {
            char c = camelCaseResult.charAt(i);
            if (Character.isDigit(c)) {
                switch (c) {
                    case '4':
                        leetspeakResult.append('a');
                        break;
                    case '3':
                        leetspeakResult.append('e');
                        break;
                    case '0':
                        leetspeakResult.append('o');
                        break;
                    case '1':
                        leetspeakResult.append('l');
                        break;
                    case '7':
                        leetspeakResult.append('t');
                        break;
                    default:
                        leetspeakResult.append(c); // Keep the digit as is (although not needed in this case)
                        break;
                }
            } else {
                leetspeakResult.append(c); // Keep non-digit characters as is
            }
        }

        // Step 4: Omit non-letter characters
        StringBuilder finalResult = new StringBuilder();
        for (int i = 0; i < leetspeakResult.length(); i++) {
            char c = leetspeakResult.charAt(i);
            if (Character.isLetter(c) || c == '_') {
                finalResult.append(c); // Only keep letters
            }
        }

        return finalResult.toString();
    }
}

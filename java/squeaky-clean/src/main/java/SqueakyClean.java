class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder cleaned = new StringBuilder(identifier);
        for(int i = 0; i < identifier.length(); i++) {
            if(cleaned.charAt(i) == '\u0020') {
                cleaned.setCharAt(i, '_');
            }
        }
        return cleaned.toString();
    }
}

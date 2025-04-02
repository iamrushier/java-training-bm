
class Strings {

    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("UpperCase: " + str.toUpperCase());
        System.out.println("LowerCase: " + str.toLowerCase());
        System.out.println("Substring: " + str.substring(5, 16));
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Index of 'P': " + str.indexOf('P'));
        System.out.println("Ends with 'ing': " + str.endsWith("ing"));
        System.out.println("Replace 'a' with '@': " + str.replace('a', '@'));
    }
}

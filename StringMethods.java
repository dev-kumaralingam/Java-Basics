import java.util.Locale;
import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = "Example String";
        String anotherStr = "Another Example";
        String regex = "Example";
        String replacement = "Sample";
        char[] charArray = {'E', 'x', 'a', 'm', 'p', 'l', 'e'};
        int choice;

        do {
            System.out.println("Select a String method to execute:");
            System.out.println("1. charAt");
            System.out.println("2. equals");
            System.out.println("3. equalsIgnoreCase");
            System.out.println("4. compareTo");
            System.out.println("5. compareToIgnoreCase");
            System.out.println("6. startsWith");
            System.out.println("7. startsWith with offset");
            System.out.println("8. endsWith");
            System.out.println("9. hashCode");
            System.out.println("10. indexOf (char)");
            System.out.println("11. indexOf (char, fromIndex)");
            System.out.println("12. lastIndexOf (char)");
            System.out.println("13. lastIndexOf (char, fromIndex)");
            System.out.println("14. indexOf (String)");
            System.out.println("15. lastIndexOf (String)");
            System.out.println("16. substring (beginIndex)");
            System.out.println("17. substring (beginIndex, endIndex)");
            System.out.println("18. concat");
            System.out.println("19. replace (char, char)");
            System.out.println("20. contains");
            System.out.println("21. toUpperCase");
            System.out.println("22. toUpperCase (Locale)");
            System.out.println("23. intern");
            System.out.println("24. isEmpty");
            System.out.println("25. join");
            System.out.println("26. replaceFirst");
            System.out.println("27. replaceAll");
            System.out.println("28. split (regex)");
            System.out.println("29. split (regex, limit)");
            System.out.println("30. toLowerCase");
            System.out.println("31. toLowerCase (Locale)");
            System.out.println("32. trim");
            System.out.println("33. toCharArray");
            System.out.println("34. copyValueOf");
            System.out.println("35. copyValueOf (offset, count)");
            System.out.println("36. getChars");
            System.out.println("37. valueOf");
            System.out.println("38. contentEquals");
            System.out.println("39. regionMatches");
            System.out.println("40. regionMatches (ignoreCase)");
            System.out.println("41. getBytes");
            System.out.println("42. getBytes (charsetName)");
            System.out.println("43. length");
            System.out.println("44. matches");
            System.out.println("45. codePointAt");
            System.out.println("46. format");
            System.out.println("0. Exit");
            System.out.println("");
            System.out.println("");

            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.println("charAt: " + str.charAt(0));
                    break;
                case 2:
                    System.out.println("equals: " + str.equals(anotherStr));
                    break;
                case 3:
                    System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(anotherStr));
                    break;
                case 4:
                    System.out.println("compareTo: " + str.compareTo(anotherStr));
                    break;
                case 5:
                    System.out.println("compareToIgnoreCase: " + str.compareToIgnoreCase(anotherStr));
                    break;
                case 6:
                    System.out.println("startsWith: " + str.startsWith("Exa"));
                    break;
                case 7:
                    System.out.println("startsWith with offset: " + str.startsWith("amp", 2));
                    break;
                case 8:
                    System.out.println("endsWith: " + str.endsWith("ing"));
                    break;
                case 9:
                    System.out.println("hashCode: " + str.hashCode());
                    break;
                case 10:
                    System.out.println("indexOf (char): " + str.indexOf('a'));
                    break;
                case 11:
                    System.out.println("indexOf (char, fromIndex): " + str.indexOf('a', 2));
                    break;
                case 12:
                    System.out.println("lastIndexOf (char): " + str.lastIndexOf('e'));
                    break;
                case 13:
                    System.out.println("lastIndexOf (char, fromIndex): " + str.lastIndexOf('e', 10));
                    break;
                case 14:
                    System.out.println("indexOf (String): " + str.indexOf("ample"));
                    break;
                case 15:
                    System.out.println("lastIndexOf (String): " + str.lastIndexOf("ample"));
                    break;
                case 16:
                    System.out.println("substring (beginIndex): " + str.substring(2));
                    break;
                case 17:
                    System.out.println("substring (beginIndex, endIndex): " + str.substring(2, 5));
                    break;
                case 18:
                    System.out.println("concat: " + str.concat(" Concatenated"));
                    break;
                case 19:
                    System.out.println("replace (char, char): " + str.replace('e', 'a'));
                    break;
                case 20:
                    System.out.println("contains: " + str.contains("amp"));
                    break;
                case 21:
                    System.out.println("toUpperCase: " + str.toUpperCase());
                    break;
                case 22:
                    System.out.println("toUpperCase (Locale): " + str.toUpperCase(Locale.ROOT));
                    break;
                case 23:
                    System.out.println("intern: " + str.intern());
                    break;
                case 24:
                    System.out.println("isEmpty: " + str.isEmpty());
                    break;
                case 25:
                    System.out.println("join: " + String.join(", ", "One", "Two", "Three"));
                    break;
                case 26:
                    System.out.println("replaceFirst: " + str.replaceFirst(regex, replacement));
                    break;
                case 27:
                    System.out.println("replaceAll: " + str.replaceAll(regex, replacement));
                    break;
                case 28:
                    System.out.println("split (regex): " + String.join(", ", str.split(" ")));
                    break;
                case 29:
                    System.out.println("split (regex, limit): " + String.join(", ", str.split(" ", 2)));
                    break;
                case 30:
                    System.out.println("toLowerCase: " + str.toLowerCase());
                    break;
                case 31:
                    System.out.println("toLowerCase (Locale): " + str.toLowerCase(Locale.ROOT));
                    break;
                case 32:
                    System.out.println("trim: " + str.trim());
                    break;
                case 33:
                    System.out.println("toCharArray: " + String.valueOf(str.toCharArray()));
                    break;
                case 34:
                    System.out.println("copyValueOf: " + String.copyValueOf(charArray));
                    break;
                case 35:
                    System.out.println("copyValueOf (offset, count): " + String.copyValueOf(charArray, 0, 4));
                    break;
                case 36:
                    char[] dest = new char[5];
                    str.getChars(0, 5, dest, 0);
                    System.out.println("getChars: " + String.valueOf(dest));
                    break;
                case 37:
                    System.out.println("valueOf: " + String.valueOf(123));
                    break;
                case 38:
                    System.out.println("contentEquals: " + str.contentEquals(new StringBuffer("Example String")));
                    break;
                case 39:
                    System.out.println("regionMatches: " + str.regionMatches(0, anotherStr, 0, 7));
                    break;
                case 40:
                    System.out.println("regionMatches (ignoreCase): " + str.regionMatches(true, 0, anotherStr, 0, 7));
                    break;
                case 41:
                    System.out.println("getBytes: " + new String(str.getBytes()));
                    break;
                case 42:
                    System.out.println("getBytes (charsetName): " + new String(str.getBytes()));
                    break;
                case 43:
                    System.out.println("length: " + str.length());
                    break;
                case 44:
                    System.out.println("matches: " + str.matches(".*String"));
                    break;
                case 45:
                    System.out.println("codePointAt: " + str.codePointAt(0));
                    break;
                case 46:
                    System.out.println("format: " + String.format("This is a %s", "formatted string"));
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 0);

        scanner.close();
    }
}

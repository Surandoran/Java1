package variable;

public class Promotion {
    public static void main(String[] args) {
        // byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

        byte ByteValue = 10;
        int intValue = ByteValue; // int <- byte
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue; // int <- char
        System.out.println("가의 유니코드 = " + intValue);

        intValue = 500;
        long longValue = intValue; // long <- int
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue; // double <- int
        System.out.println(doubleValue);
    }
}

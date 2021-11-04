/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: RomanToDecimal.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/28 at 10:50 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */

/**
 * Convert Roman to Decimal
 * @author 24wilber
 * @version 10.3.2021
 */
public class RomanToDecimal {

    /**
     * @param roman The roman numeral to be converted
     * @return An integer of the roman numeral
     */
    public static int romanToDecimal(String roman) {
        try {
            return romanToDecimalThrows(roman);
        } catch (Exception e) {
            return -1;
        }
    }

    /**
     * Converts a {@code String}, containing a roman numeral, from roman numeral
     * to an integer. If it is unable to do that or the roman numeral is incorrectly
     * formatted then it will throw Exception
     * @param roman The roman numeral to be converted
     * @return An integer of the roman numeral
     * @throws Exception An exception if the roman numeral is incorrect
     */
    public static int romanToDecimalThrows(String roman) throws Exception {
//        System.out.println(roman);
        // for efficiency
        int chars = roman.length();
        // current level (starts at I and ends at M)
        romanDigit height = romanDigit.I;
        // current numeral count
        int num = 0;
        // reverse list
        for (int i = chars-1; i >= 0; i--) {
            String CurrentChar = roman.substring(i,i+1).toUpperCase(); // `substring` usage and `toUpperCase` usage
            romanDigit romanNum = romanDigit.valueOf(CurrentChar); // converts a string like 'I' to a value in the enum
//            System.out.println(romanNum.toString()+"; Level: "+height.toString());
            if (height.getLevel() <= romanNum.getLevel()) {
                num += romanNum.toInt();
                height = romanNum;
            } else {
                if (height.compareLevel(romanNum)>2) {
                    throw new Exception();
                }
                num -= romanNum.toInt();
            }
//            System.out.println(num);
        }
        return num;

    }

    /**
     * main method
     * @param args the args supplied with the program
     */
    public static void main(String[] args) {
        for (String temp: args) {
            try {
                System.out.println("input: "+temp+" => Output: "+ romanToDecimalThrows(temp));
            } catch (Exception e) {
                System.out.println("input: "+temp+" => Output: "+"invalid");//MARK- should I do something different for incorrect formatted Numerals
            }
        }
    }
    /**
     * An enum for all of the known Roman Numerals
     */
    public enum romanDigit {
        I,
        V,
        X,
        L,
        C,
        D,
        M;
        /**
         * Converts the roman digit from digit to value
         * @return An int of the roman digit
         */
        public int toInt() {
            int value = -1;
            switch (this) {
                case I -> value = 1;
                case V -> value = 5;
                case X -> value = 10;
                case L -> value = 50;
                case C -> value = 100;
                case D -> value = 500;
                case M -> value = 1000;
//                default -> {
//                    System.out.println( "ERROR");
//                    value = -1;
//                }
            }
//            System.out.println("value"+value);
            return value;
        }
//        public int compare(romanDigit other) throws Exception {
//            return (this.toInt() - other.toInt());
//        }

        /**
         * Gets the level the digit is on
         * Example:
         *  I -> 1
         *  V -> 2
         *  X -> 3
         *  and so forth
         * This allows me to check how many levels the digits decrease. If it is more than two, then it is invalid.
         * @return the level the digit is on
         */
        public int getLevel() {
            romanDigit[] IndexTable = {I, V, X, L, C, D, M};
            int level = -1;
            for (int i = 0; i < IndexTable.length; i++) {
                if (IndexTable[i] == this) level = i;
            }
            return level;
        }

        /**
         * gets the difference between two levels
         * @param other the level for {@code this} to be tested against
         * @return the level of the Digit - the other's level
         */
        public int compareLevel(romanDigit other) {
            return this.getLevel() - other.getLevel();
        }
//        public boolean isGreaterThan(romanDigit that) throws Exception {
//            return this.compare(that) > 0;
//        }
//        public boolean isLessThan(romanDigit that) throws Exception {
//            return this.compare(that) <= 0;
//        }
    }
}

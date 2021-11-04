/*
 ╭────────────────────────────────────────────────────╮
 │                                                    ╵
 │ File: RomanToDecimalTest.java
 │ Project: FirstProject
 │
 │ Created by Everett Wilber on 21/09/30 at 08:40 AM.
 │                                                    ╷
 ╰────────────────────────────────────────────────────╯
 */
import com.sun.tools.javac.Main;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.Dictionary;


/**
 * Tests for RomanToDecimal
 * @author 24wilber
 * @version 2021.10.03
 */
public class RomanToDecimalTest {
    /**
     * test all different tests in one test
     */
    @Test
    public void romanToDecimal() {
        Invalid();
        NormalAndInvariants();
        LogicallyIncorrect();
    }

    /**
     * test NormalAndInvariants
     */
    @Test
    public void NormalAndInvariants() {
        assertEquals(259,RomanToDecimal.romanToDecimal("CCLIX"));
        assertEquals(4,RomanToDecimal.romanToDecimal("IV"));
        assertEquals(1983,RomanToDecimal.romanToDecimal("MCMLXXXIII"));
        assertEquals(1021,RomanToDecimal.romanToDecimal("MXXI"));
        assertEquals(521,RomanToDecimal.romanToDecimal("DXXI"));
        assertEquals(1994,RomanToDecimal.romanToDecimal("MCMXCIV"));
        assertEquals(109,RomanToDecimal.romanToDecimal("CIX"));
        assertEquals(1090,RomanToDecimal.romanToDecimal("MXC"));
    }

    /**
     * test logically incorrect
     */
    @Test
    public void LogicallyIncorrect() {
        assertNotEquals(47, RomanToDecimal.romanToDecimal("IVIVIVIXIXIX"));
        assertEquals(9,RomanToDecimal.romanToDecimal("IX"));
        assertEquals(900,RomanToDecimal.romanToDecimal("CM"));
        assertEquals(4,RomanToDecimal.romanToDecimal("IV"));
        assertEquals(8,RomanToDecimal.romanToDecimal("IIX")); // weird but still works

    }

    /**
     * test invalid
     */
    @Test
    public void Invalid() {
        assertEquals(-1,RomanToDecimal.romanToDecimal("IC"));
        assertEquals(-1,RomanToDecimal.romanToDecimal("HAHA"));
        assertNotEquals(4,RomanToDecimal.romanToDecimal("BeBopBoop"));
        assertNotEquals(1000, RomanToDecimal.romanToDecimal("oops"));
    }

    /**
     * test to see if psvm works
     */
    @Test
    public void TestMain() {
        String[] args = {"XVI", "ICSXXXS"};
        RomanToDecimal.main(args);
    }

    /**
     * test a bunch of tests
     */
    @Test
    public void TestRTDTests() {
        String[] allTest = {"I", "i", "II", "ii", "III", "iii", "IV", "iv", "V", "v", "VI", "vi", "VII", "vii", "VIII", "viii", "IX", "ix", "X", "x", "XI", "xi", "XIV", "xiv", "XV", "xv", "XIX", "xix", "XXIX", "xxix", "XXXIV", "xxxiv", "XLIX", "xlix", "LXXXIV", "lxxxiv", "XCIV", "xciv", "XCIX", "xcix", "CCCXCIV", "cccxciv", "CDXCIV", "cdxciv", "CMXCIV", "cmxciv", "MCMLXII", "mcmlxii", "MMCDIX", "mmcdix", "MMCDXCIV", "mmcdxciv", "CMXCIV", "cmxciv", "CMXCIV", "cmxciv", "MMCMXCIX", "mmcmxcix", "MMMMCMXCIX", "mmmmcmxcix", "IIVI", "iivi", "IIIVII", "iiivii", "IIIXVIII", "iiixviii", "IXIXIX", "ixixix", "IVIXXLXCCDCM", "ivixxlxccdcm", "XXXXXXXXXX", "xxxxxxxxxx", "LXCID", "lxcid", "XMXVIVIIIIV", "xmxviviiiiv", "MXMXVIVIXII", "mxmxvivixii", "MXMXVIVIXIIVIII", "mxmxvivixiiviii", "MMCCCDLXIIIVIX", "mmcccdlxiiivix", "MMMCMCMCDIIIX", "mmmcmcmcdiiix", "MMMMMCDCDCD", "mmmmmcdcdcd", "I_am_Batman", "ISIS_is_not_a_valid_Roman_numeral", "MMMMMGood", "mmmmmgood", "MMCMLXIJMMCD", "mmcmlxijmmcd", "LXHID", "lxhid", "IVXLCDME", "ivxlcdme", "SWEET_BRUH", "sweet_bruh"};
        RomanToDecimal.main(allTest);
    }

    /**
     * make sure that incorrect inputs put into rtdthrows
     * will cause a throw
     */
    @SuppressWarnings("CodeBlock2Expr")
    @Test
    public void romanToDecimalThrows() {
        assertThrows(Exception.class, () -> {RomanToDecimal.romanToDecimalThrows("Oops");});
        assertThrows(Exception.class, () -> {RomanToDecimal.romanToDecimalThrows("IM");}); // Should throw because it is a level difference > 2
    }

    /**
     * run tests that test main (psvm)
     */
    @Test
    public void main() {
        TestMain();
        TestRTDTests();
    }
}

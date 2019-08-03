import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class romanTranslatorTest {
    RomanNumbers rm;
    @Before
    public void before(){ rm = new RomanNumbers(); }

    @Test
    public void romanITest(){ assertEquals(1, rm.romanNumberTranslator("I")); }
    @Test
    public void romanIVTest(){ assertEquals(4, rm.romanNumberTranslator("IV")); }
    @Test
    public void romanVTest(){ assertEquals(5, rm.romanNumberTranslator("V")); }
    @Test
    public void romanVITest(){ assertEquals(6, rm.romanNumberTranslator("VI")); }
    @Test
    public void romanIXTest(){ assertEquals(9, rm.romanNumberTranslator("IX")); }
    @Test
    public void romanXTest(){ assertEquals(10, rm.romanNumberTranslator("X")); }
    @Test
    public void romanXLTest(){ assertEquals(40, rm.romanNumberTranslator("XL")); }
    @Test
    public void romanLTest(){ assertEquals(50, rm.romanNumberTranslator("L")); }
    @Test
    public void romanCTest(){ assertEquals(100, rm.romanNumberTranslator("C")); }
    @Test
    public void romanDTest(){ assertEquals(500, rm.romanNumberTranslator("D")); }
    @Test
    public void romanMTest(){ assertEquals(1000, rm.romanNumberTranslator("M")); }
    @Test
    public void romanMDLCTest(){ assertEquals(1550, rm.romanNumberTranslator("MDLC")); }
}

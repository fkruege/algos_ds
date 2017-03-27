import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sorting.HexUtil;

/**
 * Created by fkruege on 3/7/17.
 */
public class HexConverterTests {

    HexConverter _hexConverter;
    HexUtil _hexUtil;

    @Before
    public void before() {
        _hexConverter = new HexConverter();
        _hexUtil = new HexUtil();
    }

    @Test
    public void test_Convert1() {
        int[] input = new int[]{130};

        String s = _hexConverter.hexToString2(input);
        String expected = Character.toString((char) 130);
        Assert.assertEquals(expected, s);
    }


    @Test
    public void test_Convert2() {
        int[] input = new int[]{82};

        String s = _hexUtil.hexToString(input);
        String expected = Character.toString((char) 130);
        Assert.assertEquals(expected, s);

    }


    @Test
    public void test_Convert3() {
        int[] input = new int[]{0x5A};

        String s = _hexUtil.hexToString(input);
        String expected = Character.toString((char) 130);
        Assert.assertEquals(expected, s);

    }

    @Test
    public void test_convert4() {
        int[] input = new int[]{0x00, 0x26, 0x11, 0x64, 0x64, 0x14, 0x82, 0x03, 0x12, 0x51, 0x04,
                0x00, 0x00, 0x56, 0x20, 0x41, 0x68, 0x16, 0x22, 0x26, 0x95, 0x42};

        String s = _hexUtil.hexToString(input);
        System.out.println(s);
    }

    @Test
    public void test_convert5() {
        int[] input = new int[]{00, 26, 11, 64, 64, 14, 82, 03, 12, 51, 04,
                00, 00, 56, 20, 41, 68, 16, 22, 26, 95, 42};

        String s = _hexUtil.hexToString(input);
        System.out.println(s);
    }


    @Test
    public void test_convert6() {
        int[] input = new int[]{00, 26, 11, 64, 64, 14, 82, 03, 12, 51, 04,
                00, 00, 56, 20, 41, 68, 16, 22, 26, 95, 42};

        String s = _hexConverter.hexToString2(input);

        System.out.println(s);
    }

    int ITEMS_PER_PAGE = 3;

    @Test
    public void test_scratch() {
        for (int i = 0; i <= 10; i++) {
            int itemCount = getItemCount(i);
            System.out.println("Size is: " + i + "  getItemCount is: " +itemCount);
        }

    }


    public int getItemCount(int size) {
        if (size % ITEMS_PER_PAGE != 0) {
            return size + ITEMS_PER_PAGE - size % ITEMS_PER_PAGE;
        } else {
            return size;
        }
    }


}

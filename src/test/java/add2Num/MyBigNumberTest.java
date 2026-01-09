package add2Num;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

class MyBigNumberTest {


    private MyBigNumber myBigNumber;

    @BeforeEach
    void setUp() {
        myBigNumber = new MyBigNumber();
    }

    @Test
    @DisplayName(" // Cọng 2 số có cùng độ dài không nhớ")
    void testSumNormal() {
        assertEquals("227", myBigNumber.sum("113", "114"));
    }

    @Test
    @DisplayName(" // Cọng 2 số khác độ dài")

    void testSumDifferentLength() {
        assertEquals("2131", myBigNumber.sum("1234", "897"));
    }

    @Test
    @DisplayName(" // Cọng 2 số có nhớ")
    void testSumWithCarry() {
        assertEquals("1356", myBigNumber.sum("789", "567"));
    }

    @Test
    @DisplayName("// Cong 1 số rất lớn cho 1 số rất nhỏ")
    void testSumWithVeryBig() {
        String stn1 = "999999999999";
        String stn2 = "1";
        assertEquals("1000000000000", myBigNumber.sum(stn1, stn2));
    }

}
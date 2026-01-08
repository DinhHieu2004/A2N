package add2Num;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.assertEquals;

class MyBigNumberTest {


    private MyBigNumber myBigNumber;

    @BeforeEach
    void setUp() {
        myBigNumber = new MyBigNumber();
    }

    @Test
    // Cọng 2 số có cùng độ dài không nhớ
    void testSumNormal() {
        assertEquals("227", myBigNumber.sum("113", "114"));
    }

    @Test
    // Cọng 2 số khác độ dài
    void testSumDifferentLength() {
        assertEquals("2131", myBigNumber.sum("1234", "897"));
    }

    @Test
    // Cọng 2 số có nhớ
    void testSumWithCarry() {
        assertEquals("1356", myBigNumber.sum("789", "567"));
    }



}
package add2Num;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.ArrayList;
import java.util.List;


public class MyBigNumber {
    private List<String> store = new ArrayList<>();

    private static final Logger log = LoggerFactory.getLogger(MyBigNumber.class);

    public String sum(String stn1, String stn2) {
        store.clear();
        StringBuilder result = new StringBuilder();

        int i = stn1.length() - 1;
        int j = stn2.length() - 1;
        int carry = 0;
        int step = 1;

        while (i >= 0 || j >= 0) {
            int a = (i >= 0) ? stn1.charAt(i) - '0' : 0;
            int b = (j >= 0) ? stn2.charAt(j) - '0' : 0;

            String msg1 = "Bước " + step + ": Lấy " + a + " cộng với " + b + " được " + (a + b);
            log.info(msg1);
            store.add(msg1);

            int sum = a + b + carry;

            if (carry > 0) {
                String msgCarry = "Cộng tiếp với nhớ " + carry + " được " + sum;
                log.info(msgCarry);
                store.add(msgCarry);
            }

            int digit = sum % 10;
            carry = sum / 10;

            result.append(digit);

            String msgRes = "Lưu " + digit + " vào kết quả được kết quả mới là \"" + result.reverse().toString() + "\"";
            log.info(msgRes);
            store.add(msgRes);
            result.reverse();

            if (carry > 0) {
                String msgNextCarry = "Ghi nhớ " + carry;
                log.info(msgNextCarry);
                store.add(msgNextCarry);
            }

            log.info("");
            store.add("");

            i--;
            j--;
            step++;
        }

        if (carry > 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

    public List<String> getStore() {
        return this.store;
    }
}
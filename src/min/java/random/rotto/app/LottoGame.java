package min.java.random.rotto.app;
import min.java.random.rotto.utill.LottoUtill;
import java.util.Set;
public class LottoGame {
    public static void main(String[] args) {
        int gameCount = 5; // 5게임

        System.out.println("==== 로또 번호 5게임 ====");
        for (int i = 1; i <= gameCount; i++) {
            Set<Integer> lotto = LottoUtill.generateLottoNumbers();
            System.out.println(lotto);
        }
    }
}

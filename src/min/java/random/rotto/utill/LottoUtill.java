package min.java.random.rotto.utill;
import java.security.SecureRandom;
import java.util.*;

public class LottoUtill {
    // 로또 번호 한 게임(6개)을 생성하는 메서드
    public static Set<Integer> generateLottoNumbers() {
        Set<Integer> lottoNumbers = new HashSet<>();
        SecureRandom secureRandom = new SecureRandom();

        // 중복되지 않는 6개의 번호를 뽑는다
        while (lottoNumbers.size() < 6) {
            int number = secureRandom.nextInt(45) + 1;
            lottoNumbers.add(number);
        }
        return new TreeSet<>(lottoNumbers);
    }
}

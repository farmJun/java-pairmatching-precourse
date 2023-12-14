package pairmatching.view.outputview;

import java.util.List;

public class PairMatchingOutputView {

    private PairMatchingOutputView() {

    }

    public static void printInformation() {
        System.out.println("#############################################\n"
            + "과정: 백엔드 | 프론트엔드\n"
            + "미션:\n"
            + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n"
            + "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n"
            + "  - 레벨3: \n"
            + "  - 레벨4: 성능개선 | 배포\n"
            + "  - 레벨5: \n"
            + "############################################\n");
    }

    public static void printResultOfPairMatching(List<String> pairsName) {
        System.out.println("페어 매칭 결과입니다.");
        for (String name : pairsName) {
            System.out.println(name);
        }
        System.out.println();
    }
}

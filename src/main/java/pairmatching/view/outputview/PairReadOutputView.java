package pairmatching.view.outputview;

import java.util.List;

public class PairReadOutputView {

    private PairReadOutputView() {

    }

    public static void printResultOfPairMatching(List<String> pairsName) {
        System.out.println("페어 조회 결과입니다.");
        for (String name : pairsName) {
            System.out.println(name);
        }
        System.out.println();
    }
}

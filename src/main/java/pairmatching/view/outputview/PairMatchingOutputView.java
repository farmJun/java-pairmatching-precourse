package pairmatching.view.outputview;

import java.util.List;

public class PairMatchingOutputView {

    private PairMatchingOutputView() {

    }

    public static void printResultOfPairMatching(List<String> pairsName) {
        System.out.println("페어 매칭 결과입니다.");
        for (String name : pairsName) {
            System.out.println(name);
        }
    }
}

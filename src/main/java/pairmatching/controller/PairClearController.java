package pairmatching.controller;

import pairmatching.domain.History;
import pairmatching.view.outputview.PairClearOutputView;

public class PairClearController {

    public void run(History pairMatchingHistory) {
        pairMatchingHistory.clear();
        PairClearOutputView.printPairClear();
    }
}

package pairmatching.controller;

import java.util.List;
import pairmatching.domain.History;
import pairmatching.domain.PairMatchInformation;
import pairmatching.domain.Pairs;
import pairmatching.domain.informtaion.Course;
import pairmatching.domain.informtaion.Level;
import pairmatching.domain.informtaion.Mission;
import pairmatching.view.inputview.PairReadInputView;
import pairmatching.view.outputview.PairReadOutputView;

public class PairReadController {

    public void run(History pairMatchingHistory) {
        PairMatchInformation pairMatchInformation = getPairMatchInformation(pairMatchingHistory);
        Pairs pairs = pairMatchingHistory.find(pairMatchInformation);
        PairReadOutputView.printResultOfPairMatching(pairs.getPairsName());
    }

    private PairMatchInformation getPairMatchInformation(History pairMatchingHistory) {
        while (true) {
            try {
                List<String> courseAndLevelAndMission = PairReadInputView.readCourseAndLevelAndMission();
                Course course = Course.find(courseAndLevelAndMission.get(0));
                Level level = Level.find(courseAndLevelAndMission.get(1));
                Mission mission = Mission.find(courseAndLevelAndMission.get(2));
                PairMatchInformation information = new PairMatchInformation(course, level, mission);
                validate(pairMatchingHistory, information);
                return information;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validate(History pairMatchingHistory, PairMatchInformation information) {
        if (!pairMatchingHistory.has(information)) {
            throw new IllegalArgumentException("[ERROR] 없는 기록");
        }
    }


}

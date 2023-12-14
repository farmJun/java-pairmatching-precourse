package pairmatching.controller;

import java.util.ArrayList;
import java.util.List;
import pairmatching.domain.Crew;
import pairmatching.domain.History;
import pairmatching.domain.Pair;
import pairmatching.domain.PairMatchInformation;
import pairmatching.domain.Pairs;
import pairmatching.domain.informtaion.Course;
import pairmatching.domain.informtaion.Level;
import pairmatching.domain.informtaion.Mission;
import pairmatching.view.inputview.PairMatchingInputView;
import pairmatching.view.outputview.PairMatchingOutputView;

public class PairMatchingController {

    public void run(History pairMatchingHistory) {
        PairMatchInformation pairMatchInformation = getPairMatchInformation();

        if (pairMatchingHistory.has(pairMatchInformation)) {

        }

        List<Crew> crews = pairMatchInformation.getCrews();
        List<List<Crew>> groupedCrews = getPairedCrews(crews);
        Pairs pairs = new Pairs(getPairs(groupedCrews));

        PairMatchingOutputView.printResultOfPairMatching(pairs.getPairsName());
        pairMatchingHistory.add(pairMatchInformation, pairs);
    }

    private PairMatchInformation getPairMatchInformation() {
        while (true) {
            try {
                List<String> courseAndLevelAndMission = PairMatchingInputView.readCourseAndLevelAndMission();
                Course course = Course.find(courseAndLevelAndMission.get(0));
                Level level = Level.find(courseAndLevelAndMission.get(1));
                Mission mission = Mission.find(courseAndLevelAndMission.get(2));
                return new PairMatchInformation(course, level, mission);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private List<List<Crew>> getPairedCrews(List<Crew> crews) {
        List<List<Crew>> groupedCrews = new ArrayList<>();

        for (int i = 0; i < crews.size(); i += 2) {
            int start = i;
            int end = start + 2;
            if (end + 1 == crews.size()) {
                end++;
                i++;
            }
            groupedCrews.add(crews.subList(start, end));
        }

        return groupedCrews;
    }

    private List<Pair> getPairs(List<List<Crew>> pairedCrews) {
        List<Pair> pairs = new ArrayList<>();

        for (List<Crew> crew : pairedCrews) {
            pairs.add(new Pair(crew));
        }

        return pairs;
    }
}

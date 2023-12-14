package pairmatching.domain;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.List;
import java.util.stream.Collectors;
import pairmatching.domain.informtaion.Course;
import pairmatching.domain.informtaion.Level;
import pairmatching.domain.informtaion.Mission;

public class PairMatchInformation {

    private Course course;
    private Level level;
    private Mission mission;

    public PairMatchInformation(Course course, Level level, Mission mission) {
        validate(level, mission);
        this.course = course;
        this.level = level;
        this.mission = mission;
    }

    private void validate(Level level, Mission mission) {
        if (!level.hasMission(mission)) {
            throw new IllegalArgumentException("[ERROR] 없는 미션");
        }
    }

    public List<Crew> getCrews() {
        List<String> crewNames = FileReader.getCrewNames(course);
        List<String> shuffledCrewNames = Randoms.shuffle(crewNames);
        return shuffledCrewNames.stream()
            .map(name -> new Crew(Course.BACKEND, name))
            .collect(Collectors.toList());
    }
}

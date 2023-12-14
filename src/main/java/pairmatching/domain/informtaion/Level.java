package pairmatching.domain.informtaion;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public enum Level {
    LEVEL1("레벨1", Arrays.asList(Mission.CAR, Mission.LOTTO, Mission.BASEBALL)),
    LEVEL2("레벨2", Arrays.asList(Mission.BASKET, Mission.PAYMENT, Mission.SUBWAY)),
    LEVEL3("레벨3", Collections.emptyList()),
    LEVEL4("레벨4", Arrays.asList(Mission.IMPROVEMENT, Mission.DEPLOYMENT)),
    LEVEL5("레벨5", Collections.emptyList()),
    NOTHING("없음", Collections.emptyList());


    private String name;
    private List<Mission> missions;

    Level(String name, List<Mission> missions) {
        this.name = name;
        this.missions = missions;
    }

    public static Level find(String name) {
        return Arrays.stream(Level.values())
            .filter(mission -> mission.name.equals(name))
            .findFirst()
            .orElse(NOTHING);
    }

    public boolean hasMission(Mission mission){
        return missions.contains(mission);
    }

}

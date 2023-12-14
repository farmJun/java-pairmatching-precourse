package pairmatching.domain;

import java.util.List;
import java.util.StringJoiner;

public class Pair {

    private final List<Crew> pair;

    public Pair(List<Crew> pair) {
        this.pair = pair;
    }

    public String getCrewNames() {
        StringJoiner stringJoiner = new StringJoiner(" : ");
        pair.forEach(crew -> stringJoiner.add(crew.getName()));
        return stringJoiner.toString();
    }
}

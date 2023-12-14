package pairmatching.domain;

import java.util.List;
import java.util.stream.Collectors;

public class Pairs {

    private List<Pair> pairs;

    public Pairs(List<Pair> pairs) {
        this.pairs = pairs;
    }

    public List<String> getPairsName() {
        return pairs.stream()
            .map(pair -> pair.getCrewNames())
            .collect(Collectors.toList());
    }
}

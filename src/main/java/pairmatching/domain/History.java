package pairmatching.domain;

import java.util.HashMap;
import java.util.Map;

public class History {

    private Map<PairMatchInformation, Pairs> history;

    public History() {
        this.history = new HashMap<>();
    }

    public void add(PairMatchInformation pairMatchInformation, Pairs pairs) {
        history.put(pairMatchInformation, pairs);
    }

    public void clear() {
        history.clear();
    }

    public boolean has(PairMatchInformation pairMatchInformation) {
        return history.keySet().contains(pairMatchInformation);
    }

    public Pairs find(PairMatchInformation pairMatchInformation) {
        return history.get(pairMatchInformation);
    }

}

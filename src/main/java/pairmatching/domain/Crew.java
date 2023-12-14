package pairmatching.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import pairmatching.domain.informtaion.Course;
import pairmatching.domain.informtaion.Level;

public class Crew {

    private Course course;
    private String name;

    private Map<Level, List<Crew>> history;

    public Crew(Course course, String name) {
        this.course = course;
        this.name = name;
        history = Arrays.stream(Level.values())
            .collect(Collectors.toMap(
                level -> level,
                level -> new ArrayList<>()
            ));
    }

    public String getName() {
        return name;
    }

    public boolean alreadyPaired(Level level, Crew crew) {
        List<Crew> crews = history.get(level);
        return crews.contains(crew);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Crew crew = (Crew) o;
        return Objects.equals(name, crew.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

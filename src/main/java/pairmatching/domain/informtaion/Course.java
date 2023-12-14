package pairmatching.domain.informtaion;

import java.util.Arrays;

public enum Course {
    BACKEND("백엔드", "src/main/resources/backend-crew.md"),
    FRONTEND("프론트엔드", "src/main/resources/frontend-crew.md"),
    NOTHING("없음", "");

    private String name;
    private String path;

    Course(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public static Course find(String name) {
        return Arrays.stream(Course.values())
            .filter(mission -> mission.name.equals(name))
            .findFirst()
            .orElse(NOTHING);
    }

    public String getPath() {
        return path;
    }
}

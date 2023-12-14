package pairmatching.domain.informtaion;

import java.util.Arrays;

public enum Command {
    MATCH("페어 매칭", "1"),
    READ("페어 조회", "2"),
    CLEAR("페어 초기화", "3"),
    QUIT("종료", "Q"),
    NOTHING("없음", "");


    private String name;
    private String command;

    Command(String name, String command) {
        this.name = name;
        this.command = command;
    }

    public static Command find(String command) {
        return Arrays.stream(Command.values())
            .filter(mission -> mission.command.equals(command))
            .findFirst()
            .orElse(NOTHING);
    }
}

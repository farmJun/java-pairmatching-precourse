package pairmatching.domain.informtaion;

import java.util.Arrays;

public enum Mission {
    CAR("자동차경주"),
    LOTTO("로또"),
    BASEBALL("숫자야구게임"),
    BASKET("장바구니"),
    PAYMENT("결제"),
    SUBWAY("지하철노선도"),
    IMPROVEMENT("성능개선"),
    DEPLOYMENT("배포"),
    NOTHING("없음");

    private String name;

    Mission(String name) {
        this.name = name;
    }

    public static Mission find(String name) {
        return Arrays.stream(Mission.values())
            .filter(mission -> mission.name.equals(name))
            .findFirst()
            .orElse(NOTHING);
    }
}

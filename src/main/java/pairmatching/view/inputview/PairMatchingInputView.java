package pairmatching.view.inputview;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class PairMatchingInputView {

    private PairMatchingInputView() {

    }

    public static List<String> readCourseAndLevelAndMission() {
        System.out.println("과정, 레벨, 미션을 선택하세요.\n"
            + "ex) 백엔드, 레벨1, 자동차경주");

        String input = Console.readLine();
        return Arrays.asList(input.split(", "));
    }


    public static String readRematching() {
        System.out.println("매칭 정보가 있습니다.다시 매칭하시겠습니까?\n"
            + "네 | 아니오");

        return Console.readLine();
    }

}

package pairmatching.view.inputview;

import camp.nextstep.edu.missionutils.Console;
import java.util.Arrays;
import java.util.List;

public class PairMatchingInputView {

    private PairMatchingInputView() {

    }

    public static List<String> readCourseAndLevelAndMission() {
        System.out.println("#############################################\n"
            + "과정: 백엔드 | 프론트엔드\n"
            + "미션:\n"
            + "  - 레벨1: 자동차경주 | 로또 | 숫자야구게임\n"
            + "  - 레벨2: 장바구니 | 결제 | 지하철노선도\n"
            + "  - 레벨3: \n"
            + "  - 레벨4: 성능개선 | 배포\n"
            + "  - 레벨5: \n"
            + "############################################\n"
            + "과정, 레벨, 미션을 선택하세요.\n"
            + "ex) 백엔드, 레벨1, 자동차경주");

        String input = Console.readLine();
        return Arrays.asList(input.split(", "));
    }


    public static String readRematching() {
        System.out.println(" 매칭 정보가 있습니다.다시 매칭하시겠습니까?\n"
            + "네 | 아니오");

        return Console.readLine();
    }

}

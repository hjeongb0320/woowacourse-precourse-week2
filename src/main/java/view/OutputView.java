package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OutputView {
    public void printRequestCarsName() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
    }

    public void printRequestPlayTime() {
        System.out.println("시도할 회수는 몇회인가요?");
    }

    public void printStartGame() {
        System.out.println("\n실행 결과");
    }

    public void printCarsMove(List<Map.Entry<String, String>> carNameAndPosList) {
        for(Map.Entry<String, String> car : carNameAndPosList) {
            String name = car.getKey();
            String position = car.getValue();
            System.out.println(name + " : " + position);
        }
        System.out.println();
    }

    public void printWinners(ArrayList<String> winnerList) {
        String result = String.join(", ", winnerList);

        System.out.print("최종 우승자 : " + result);
    }
}

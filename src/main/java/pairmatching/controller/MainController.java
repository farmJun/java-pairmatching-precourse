package pairmatching.controller;

import pairmatching.domain.History;
import pairmatching.domain.informtaion.Command;
import pairmatching.view.inputview.CommandInputView;

public class MainController {

    private History pairMatchingHistory;
    private PairMatchingController pairMatchingController;
    private PairReadController pairReadController;
    private PairClearController pairClearController;

    public MainController() {
        this.pairMatchingHistory = new History();
        this.pairMatchingController = new PairMatchingController();
        this.pairReadController = new PairReadController();
        this.pairClearController = new PairClearController();
    }

    public void run() {
        while (true) {
            Command command = readCommand();

            if (command.equals(Command.QUIT)) {
                break;
            }

            act(command);
        }
    }

    private void act(Command command) {
        if (command.equals(Command.MATCH)) {
            pairMatchingController.run(pairMatchingHistory);
        }
        if (command.equals(Command.READ)) {
            pairReadController.run(pairMatchingHistory);
        }
        if (command.equals(Command.CLEAR)) {
            pairClearController.run(pairMatchingHistory);
        }
    }

    private Command readCommand() {
        while (true) {
            try {
                String input = CommandInputView.readCommand();
                Command command = Command.find(input);
                validate(command);
                return command;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void validate(Command command) {
        if (command.equals(Command.NOTHING)) {
            throw new IllegalArgumentException("[ERROR] 없는 기능");
        }
    }
}

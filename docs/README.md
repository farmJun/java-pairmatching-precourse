# 페어 매칭

## InputView
- CommandInputView
  - 수행할 기능의 종류를 입력 받는다
- PairMatchingInputView
  - 매칭할 과정, 레벨, 미션을 입력 받는다.
- PairReadInputView
  - 조회할 과정, 레벨, 미션을 입력 받는다.

## OutputView
- PairMatchingOutputView
  - 페어 매칭 결과를 출력한다.
- PairReadOutputView
  - 페어 조회 결과를 출력한다.
- PairClearOutputView
  - 페어가 초기화 됐음을 출력한다.

## FileReader
- 파일로부터 크루들의 이름을 읽는다

## Course
- 과정을 관리한다. (백엔드, 프런트엔드)
- 과정을 찾는다.

## Level
- 레벨을 관리한다. (레벨 1 ~ 5)
- 레벨을 찾는다.

## Mission
- 미션을 관리한다.
- 미션을 찾는다.

## Command
- 수행할 기능을 관리한다.
- 기능을 찾는다.

## Crew
- 크루는 과정, 이름, 페어 매칭 기록을 속성으로 갖는다.
- 특정 크루와 같은 레벨에 매칭이 된 기록이 있는지 확인한다.

## Pair
- 매칭된 크루들을 페어로 관리한다.

## PairMatchInformation
- 페어 매칭과 관련된 정보를 관리한다. (과정, 레벨, 미션)
- 레벨에 미션이 포함되어 있는지 검증한다.
- 과정에 맞는 크루들의 이름을 반환한다.

## History
- 페어 매칭 결과를 기록한다.
- 페어 매칭 결과를 추가한다.
- 페어 매칭 기록을 초기화한다.
- 특정 페어 매칭 결과가 존재하는지 반환한다.
- 특정 페어 매칭 결과를 찾는다.

## PairMatchingController
- 페어 매칭과 관련된 기능을 수행한다.

## PairReadController
- 페어 조회와 관련된 기능을 수행한다.

## PairClearController
- 페어 초기화와 관련된 기능을 수행한다.

## MainController
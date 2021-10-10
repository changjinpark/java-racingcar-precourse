# 자동차 경주 게임

## 기능 구현 목록

- 사용자가 경주할 자동차의 이름을 입력한다.
    - N대의 자동차의 이름을 쉼표 단위로 입력 받는다.
    - [x] 자동차 이름이 5글자 초과할 경우 [ERROR] 시작 메세지를 출력한다.
    - [x] 자동차 이름이 중복된 값이 있을 경우 [ERROR] 시작 메세지를 출력한다.
    - [x] 자동차 이름이 2대 미만일 경우 [ERROR] 시작 메세지를 출력한다.
    - [ERROR] 상황에서는 입력 값을 다시 넣는다.
- 몇번 반복할 건지 사용자가 횟수를 입력한다.
    - 값이 숫자가 아닐 경우 [ERROR] 시작 메세지를 출력한다.
    - 값이 양의 정수가 아닌 경우 [ERROR] 시작 메세지를 출력한다.
    - [ERROR] 상황에서는 입력 값을 다시 넣는다.
- 자동차 이름별로 전진 값을 구한다.
    - random 값 4 이상일 경우, 
      - 해당 자동차는 전진한다.
      - 해당 자동차에 전진 값만큼 마이너스(-) 표시로 출력한다.
    - random 값이 3 이하일 경우,
      - 해당 자동차에는 멈춘다.
    - 사용자가 입력한 횟수만큼 반복한다.
- 전진을 가장 많이 한 자동차 이름을 출력한다.
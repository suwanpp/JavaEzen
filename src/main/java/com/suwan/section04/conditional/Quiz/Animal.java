package com.suwan.section04.conditional.Quiz;

import java.util.Scanner;

public class Animal {

    public void psychologicalTest() {

        Scanner sc = new Scanner(System.in);
        System.out.println("휴일을 맞아 자연으로 여행을 떠났습니다.");
        System.out.println("넓은 잔디 밭 나무 아래서 낮잠을 자는데");
        System.out.println("옆에서 소리가 들려 일어나보니...");
        System.out.println("당신의 옆에 있던 동물은? 1. 펭귄, 2. 강아지, 3. 호랑이, 4. 토끼, 5. 팬더, 6. 사슴");
        int num = sc.nextInt();

        if (num == 1) {
            System.out.println("펭귄펭귄펭귄펭귄");
        } else if (num == 2) {
            System.out.println("강아지강아지강아지강아지");
        } else if (num == 3) {
            System.out.println("호랑이호랑이호랑이호랑이");
        } else if (num == 4) {
            System.out.println("토끼토끼토끼토끼");
        } else if (num == 5) {
            System.out.println("팬더팬더팬더팬더");
        } else {
            System.out.println("사슴사슴사슴사슴");
        }
    }
}

package com.suwan.section04.team;

public class yeEun {

    public void randomNum(){

        //  7~15 사이의 난수를 발생시켜서 3부터 발생한 난수까지의 합계 구하기

        int random = (int)(Math.random() * 9 ) + 7;
        System.out.println("random = " + random);

        int sum = 0;
        for (int i = 3; i<=random ; i++){
            sum += i;
        }

        System.out.println("3부터 난수 random 까지의 합 : " + sum);

    }
}

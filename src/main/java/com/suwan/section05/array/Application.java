package com.suwan.section05.array;

public class Application {

    public static void main(String[] args) {

        String[] fruit = {"사과", "바나나", "수박", "포도", "키위"};
        int[] price = {1000, 2000, 3000, 4000, 5000};

        int randomAlphabetIndex = (int) (Math.random() * fruit.length);
        int randomNumIndex = (int) (Math.random() * price.length);

        System.out.println("당신이 선택한 과일인 " + fruit[randomAlphabetIndex] + "의 가격은 " + price[randomNumIndex] + "원 입니다.");


        /* 정수 배열 {2,1,3,5,4}를 선언하고 {1,2,3,4,5}로 변경되게 하시오.*/

        int[] arr = {2, 1, 3, 4, 5};
        int temp;
        temp = arr[1];
        arr[1] = arr[0];
        arr[0] = temp;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

        int arr2[] = new int[10];

        int num = arr2.length;
        for(int i =0; i<arr2.length; i++){
            arr2[i] = num;
            num--;
        }

        for (int i = 0 ; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }





    }


}


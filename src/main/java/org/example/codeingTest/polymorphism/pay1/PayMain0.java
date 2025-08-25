package org.example.codeingTest.polymorphism.pay1;

public class PayMain0 {

    public static void main(String[] args) {
        PayService payService = new PayService();

        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1);

        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);

        //naver 결제
        String payOption3 = "new";
        int amount3 = 9000;
        payService.processPay(payOption3, amount3);

        //잘못된 결제 수단 선택
        String payOption4 = "bad";
        int amount4 = 15000;
        payService.processPay(payOption4, amount4);

    }

}

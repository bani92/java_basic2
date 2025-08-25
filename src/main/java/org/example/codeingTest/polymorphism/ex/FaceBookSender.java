package org.example.codeingTest.polymorphism.ex;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("페이스북 메시지를 발송합니다. " + message);
    }
}

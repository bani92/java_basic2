package org.example.lambda.lambda1;

import org.example.lambda.Procedure;

public class ProcedureMain1 {
    public static void main(String[] args) {
        Procedure procedure = () -> System.out.println("hello lambda");

        procedure.run();
    }
}

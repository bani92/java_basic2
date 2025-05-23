package org.example.lambda.ex3;

public class ComposeExample {

    public static MyTransformer compose(MyTransformer f1, MyTransformer f2) {

        return s -> {
                String intermediate = f1.transform(s).toUpperCase();
                return f2.transform(intermediate);
        };
    }

    public static void main(String[] args) {
        MyTransformer toUpper =  s -> s.toUpperCase();
        MyTransformer addDeco =  s -> "**" + s + "**";

        MyTransformer composeFunc = compose(toUpper, addDeco);

        String result = composeFunc.transform("hello");
        System.out.println(result);


    }

//    public static String compose(MyTransformer myTransformer, String str) {
//        return myTransformer.transform(str);
//    }
//    public static void main(String[] args) {
//        String str = "hello";
//
//        MyTransformer myTransformer = new MyTransformer() {
//            @Override
//            public String transform(String s) {
//                return s.toUpperCase();
//            }
//        };
//
//        MyTransformer myTransformer1 = new MyTransformer() {
//            @Override
//            public String transform(String s) {
//                return "**" + s + "**";
//            }
//        };
//
//        String firstResult = compose(myTransformer, str);
//        String composeResult = compose(myTransformer1, firstResult);
//
//        System.out.println(composeResult);
//
//
//    }
}

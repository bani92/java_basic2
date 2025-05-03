package org.example.codeingTest;

class MyString {
    private byte[] string = null;

    public String getString() {
        // Short circuit
        if (this.string == null || this.string.length == 0) {
            return "(null)";
        }
        return new String(string);
    }
    public void setString(String param) {
        this.string = param.getBytes();
    }
    public int length() {
        if(this.string == null) return 0;
        return this.string.length;
    }
    public int compareTo(String param) {
        if(this.string == null) return -1;
        return param.compareTo(new String(this.string));
    }
}
public class Main {
    public static void main(String[] args) {
        MyString str = new MyString();
        System.out.println(str.length());
        System.out.println(str.getString());

        str.setString("Hello Java");
        System.out.println(str.getString());
        System.out.println(str.length());
        System.out.println(str.compareTo("Hello Java"));
    }
}

package org.example.codeingTest.Sort;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Book {
    String title;
    String category;

    public Book(String title, String category) {
        this.title = title;
        this.category = category;
    }
}

public class ArraySort_2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Book[] books = new Book[N];

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String title = st.nextToken();
            String category = st.nextToken();
            books[i] = new Book(title, category);
        }

        Arrays.sort(books, (s1, s2) -> {
            if(s1.category.equals(s2.category)) {
                return s1.title.length() - s2.title.length();
            } else {
                return s1.category.compareTo(s2.category);
            }
        });

        for (Book book : books) {
            System.out.println(book.title + " " + book.category);
        }

    }
}

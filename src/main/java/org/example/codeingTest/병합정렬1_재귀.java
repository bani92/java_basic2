package org.example.codeingTest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 병합정렬1_재귀 {

    static int K; // 목표 저장 횟수
    static int count = 0; // 실제 저장 횟수 카운터
    static int result = -1; // K번째 저장되는 값을 저장할 변수

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        merge_sort(A, 0, N - 1);
        System.out.println(result);

    }

    public static void merge_sort(int[] A, int p, int r) {

        if (p < r) {
            int q = (p + r) / 2; // 중간지점 계산
            merge_sort(A, p, q); // 전반부 재귀정렬
            merge_sort(A, q + 1, + r); // 후반부 재귀정렬
            merge(A, p, q, r);
        }
    }

    public static void merge(int[] A, int p, int q, int r) {
        int i = p; // 시작부분
        int j = q + 1; // 중간기점 + 1
        int[] tmp = new int [r - p + 1]; // 배열의 길이 - 시작부분 + 1
        int t = 0;

        while(i <= q &&  j <= r) {
            if(A[i] <= A[j]) {
                tmp[t++] = A[i++];
            } else {
                tmp[t++] = A[j++];
            }
            count++;

            if(count == K) {
                result = tmp[t - 1];
            }
        }

        while(i <= q) {
            tmp[t++] = A[i++];
            count++;
            if(count == K) {
                result = tmp[t - 1];
            }
        }

        while(j <= r) {
            tmp[t++] = A[j++];
            count++;
            if(count == K) {
                result = tmp[t- 1];
            }
        }

        // 임시 배열의 내용을 원본 배열 A에 다시복사
        i = p;
        t = 0;
        while(i <= r) {
            A[i++] = tmp[t++];
        }

    }
}

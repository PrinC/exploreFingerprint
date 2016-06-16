package com.example.princ.myapplication;

/**
 * Created by PrinC on 2016/6/16.
 */
public class StringUtil {
    public static int bf(char[] text, char[] find) {
        int i = 0;
        int j = 0;
        int curBegin = 0;
        if (text.length < find.length) {
            return -1;
        }
        while (i < text.length) {
            if (text[i] == find[j]) {
                i++;
                j++;
            }
            else {
                curBegin ++;
                i = curBegin;
                j = 0;
            }
            if (j == find.length) {
                return curBegin;
            }
        }
        return -1;
    }

    private static int[] buildNext(char[] find) {
        int q, k;
        int m = find.length;
        int[] next = new int[find.length];
        for (q = 1, k = 0; q < m; ++q) {
            while (k > 0 && find[q] != find[k])
                k = next[k - 1];
            if (find[q] == find[k]) {
                k ++;
            }
            next[q] = k;
        }
        return next;
    }

    public static int kmp(char[] text, char[] find) {
        int n, m;
        int i, q;
        n = text.length;
        m = find.length;
        int[] next = buildNext(find);
        for (i = 0, q = 0; i < n; ++i) {
            while (q > 0 && find[q] != text[i]) {
                q = next[q - 1];
            }
            if (find[q] == text[i]) {
                q ++;
            }
            if (q == m) {
                return i - m + 1;
            }
        }
        return -1;
    }

    public static boolean exists(char[] arr, char x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static char[] trim(char[] str) {
        int begin, end;
        begin = 0;
        end = str.length - 1;
        char[] trimChars = {' ', '\t', '\n'};
        while (exists(trimChars, str[begin])) {
            begin ++;
        }
        while (exists(trimChars, str[end])) {
            end --;
        }
        char[] ret = new char[end - begin + 1];
        for (int i = 0; i < ret.length; i++) {
            ret[i] = str[begin + i];
        }
        return ret;
    }
}

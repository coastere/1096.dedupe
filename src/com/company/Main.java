package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String S = "abbaca";
        StringBuilder sb = new StringBuilder();
        char[] ss = S.toCharArray();
        for (int i = 0; i <ss.length ; i++) {
            if (i == 0) {
                sb.append(ss[0]);
            }else {
                if (sb.length()>0 && (sb.charAt(sb.length()-1 ) == ss[i])) {
                    sb.setLength(sb.length() - 1);
                }else
                    sb.append(ss[i]);
            }
        }
        System.out.println(sb.toString());
    }
}

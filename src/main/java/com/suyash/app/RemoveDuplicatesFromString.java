package com.suyash.app;

public class RemoveDuplicatesFromString {

    public static String removeDuplicate(String input){
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<input.length();i++){
           String s1= input.substring(i,i+1);
           if(sb.indexOf(s1)==-1){
               sb.append(input.charAt(i));
           }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="erfrfrd2423";
        System.out.print(RemoveDuplicatesFromString.removeDuplicate(str));

    }
}

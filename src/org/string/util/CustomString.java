package org.string.util;

import java.util.Arrays;

public class CustomString implements Comparable<CustomString>{

    private String str = null;

    private int recursionCount = 1;

    public CustomString (String str){
        this.str = str;
    }

    @Override
    public int compareTo(CustomString o) {


        int result = findStrCompareResult(str, o.getCustomStringVal());

        return result;
    }

    public int findStrCompareResult(String str1,String str2){

        if(findMaxCharacter(str1)-findMaxCharacter(str2)> 0)
            return -1;
        else if (findMaxCharacter(str1)-findMaxCharacter(str2)< 0)
            return 1;
        else  {
            //System.out.println(" String 1: "+str1+" String 2:"+str2);
            recursionCount++;
            findStrCompareResult(str1, str2);
        }
        return 0;

    }

    public char findMaxCharacter(String str){
        if(str.length()==1)
            return str.charAt(0);
        char maxChar = 'x';
        char[] arrayOfChars = str.toCharArray();
        int totalLength = arrayOfChars.length;
        Arrays.sort(arrayOfChars);
        maxChar = arrayOfChars[totalLength - 1 - (recursionCount-1)];
        return maxChar;

    }

    public String getCustomStringVal(){
        return str;
    }
}
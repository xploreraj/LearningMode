package org.string.ops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class StringSplitter {

    public static void main(String[] args) {
        String sampleText = "aabbbccazdz";
        int k =2;


        List<CustomString> list = customWindowSort(k, sampleText);

        for(CustomString elm:list){
            System.out.println(elm.getCustomStringVal());
        }
    }


    public static List<CustomString> customWindowSort(int k,String str){
        if (k>=str.length())
            return null;
        int totalStringSize = str.length();
        int totalIterations = (totalStringSize%k==0)?totalStringSize/k:totalStringSize/k+1;
        int startIndex = 0;
        List<CustomString> listSplitStrings = new ArrayList<CustomString>();
        for(int iterationCount = 0;iterationCount<totalIterations;iterationCount++){
            String stringFraction = null;
            int endIndex = 0;
            if((startIndex+k-1)>totalStringSize-1)
                endIndex =  (totalStringSize);
            else
                endIndex =  (startIndex+k);
            stringFraction = str.substring(startIndex, endIndex);
            listSplitStrings.add(new CustomString(stringFraction));
            startIndex = startIndex + k;
        }
        Collections.sort(listSplitStrings);
        return listSplitStrings;
    }

}

class CustomString implements Comparable<CustomString>{

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
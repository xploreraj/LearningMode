package org.string.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSplitter {


    public static void main(String[] args) {
        String sampleText = "victory";
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




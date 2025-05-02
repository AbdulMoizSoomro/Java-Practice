package CountLargestGroup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountLargestGroupMap {
    private Map<Integer, Integer> groups = new HashMap<>();


    public int countLargestGroupMap(int n) {

        makeGroups(n);
        int maxSize = CalculateMaxSizeGroup();
        return calculateFrequency(maxSize);
    }

    private int calculateFrequency(int maxSize) {
        int maxGroupSizeFrequency = 0;
        for(int size: this.groups.values()){
            if(size == maxSize){
                maxGroupSizeFrequency++;
            }
        }

        return maxGroupSizeFrequency;
    }

    private int CalculateMaxSizeGroup() {
        int maxGroupSize=0;
        for(int size: this.groups.values())
        {
            if(size>maxGroupSize)
            {
                maxGroupSize=size;
            }
        }
        return maxGroupSize;
    }


    private void makeGroups(int n) {
        int sumOfDigits;
        for(int i = 1; i<= n; i++){
            sumOfDigits = sumDigits(i);
            this.groups.put(sumOfDigits,groups.getOrDefault(sumOfDigits,0)+1);
        }
    }


    private int sumDigits(int n)
    {
        int sum =0;
        int lastDigit=0;
        while(n>0)
        {
            lastDigit = n%10;
            sum+= lastDigit;
            n /= 10;
        }
        return sum;
    }
}

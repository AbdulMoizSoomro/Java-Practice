package CountLargestGroup;

import java.util.ArrayList;

public class CountLargestGroup {
    private ArrayList<ArrayList<Integer>> groups= new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> numbers = new ArrayList<Integer>();


    public int countLargestGroup(int n) {

        int maxGroupSizeFrequency = 0;
        addNumbersinArray(n, this.numbers);
        makeGroups(n, this.numbers, this.groups);
        int maxGroupSize = findMaxGroupSize(this.groups);
        maxGroupSizeFrequency = getMaxGroupSizeFrequency(this.groups, maxGroupSize, maxGroupSizeFrequency);
        return maxGroupSizeFrequency;
    }

    private static int getMaxGroupSizeFrequency(ArrayList<ArrayList<Integer>> groups, int maxGroupSize, int maxGroupSizeFrequency) {
        for(ArrayList<Integer> group: groups)
        {
            if(group.size() == maxGroupSize){
                maxGroupSizeFrequency += 1;
            }
        }
        return maxGroupSizeFrequency;
    }

    private static int findMaxGroupSize(ArrayList<ArrayList<Integer>> groups) {
        int maxGroupSize = 0;
        for(ArrayList<Integer> group: groups)
        {
            if(group.size() > maxGroupSize){
                maxGroupSize = group.size();
            }
        }
        return maxGroupSize;
    }

    private void makeGroups(int n, ArrayList<Integer> numbers, ArrayList<ArrayList<Integer>> groups) {
        int number;
        int sumOfDigits;
        for(int i = 0; i< n; i++)
        {
            number = numbers.get(i);
            sumOfDigits = sumDigits(number);
            boolean existGroup = false;

            //Find sumOfDigits in the groups list
            for(ArrayList<Integer> group: groups)
            {
                if(sumDigits(group.get(0)) == sumOfDigits)
                {
                    group.add(number);
                    existGroup = true;
                }
            }

            if(!existGroup){
                ArrayList<Integer> newGroup= new ArrayList<Integer>();
                newGroup.add(number);
                groups.add(newGroup);
            }
        }
    }

    private static void addNumbersinArray(int n, ArrayList<Integer> numbers) {
        for(int i = 1; i<= n; i++){
            numbers.add(i);
        }
    }

    int sumDigits(int n)
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
};
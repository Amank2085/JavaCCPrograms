package ProgramsCC;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DuplicateElements {
    public static void main(String[] args) {

        String names[] = {"Java", "JavaScript", "Ruby", "C", "Python", "Java", "Python"};

        //1. compare each element
        for(int i =0; i< names.length; i++)
        {
            for (int j = i+1 ;j< names.length; j++)
            {
                if(names[i].equals(names[j]))
                {
                    System.out.println("Duplicate element is : "+ names[i]+" --> O(n^2)");
                }
            }
        }

        //2. Using HashSet : Java Collection : it stores unique values
        Set<String> namesSet = new HashSet<>();
        int count = 0;
        for (String name : names)
        {
            if(!namesSet.add(name))
            {
                System.out.println("Duplicate element is : '"+ name+"' at index : "+ count +" --> O(n)");
            }
            count++;
        }

        // Using HashMap
        Map<String, Integer> namesMap = new HashMap<>();
        int countMap =1;
        for (String name : names){
            if(namesMap.containsKey(name))
            {
                namesMap.put(name,namesMap.get(name)+1);
            }
            else {
                namesMap.put(name, countMap);
            }
        }
        System.out.println(namesMap);

        //get values from HashMap
        for (Map.Entry<String, Integer> entry : namesMap.entrySet())
        {
            if(entry.getValue()>1)
            {
                System.out.println("Duplicate element is : "+entry.getKey());
            }
        }

        namesMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey()));

    }
}

package uk.ac.gre.comp1549.examples;

public class Marathon {
    public static void main (String[] arguments) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        };
        
        int winner = FirstPlace(times);
        int second = SecondPlace(times);
        //System.out.printf("First place is " + winner[names] + "with" + winner[times] + "Minutes");
        //System.out.printf("Second place is " + second[names] + "with" + second[times] + "Minutes");
        System.out.printf("The fastest runner is: %s (%d Minutes)%n", names[winner], times[winner]);
        System.out.printf("The second fastest runner is: %s (%d Minutes)%n", names[second], times[second]); 
    }
    /** 1. Write a method in Marathon class that takes as input an array of integers and returns
    the index corresponding to the person with the lowest time. Run this method on the
    array of times. Print out the name and time corresponding to the returned index. */
public static int FirstPlace(int[] times)
    {
    	int FirstPlace = 0;
    	
    	for (int i = 0; i < times.length; i++)
    	{
    		if (times[i] < times[FirstPlace])
    		{
    			FirstPlace = i;
    		}
    	}
    	return FirstPlace;
    }
    
    
    /**2. Write a second method in Marathon class to find the second-best runner. The second
method should use the first method to determine the best runner, and then loop
through all values to find the second-best (second lowest) time. */
public static int SecondPlace(int[] times)
    {
    	int First_index = FirstPlace(times);
    	int Second_index = 0;
    	
    	for (int i = 0; i < times.length; i++)
    	{
    		if (times[i] < times[Second_index] && i != First_index)
    		{
    			Second_index = i;
    		}
    		
    	}
    	return Second_index;
    }
}
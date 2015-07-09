package assignment3;
/**
 * MIT6_092 Assignment 3
 * @author yutian
 * @since Jul 8, 2015
 */
public class Marathon {

	public static void main(String[] args) {
		
		String[] names = {
				"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
				"Emma", "John", "James", "Jame", "Emily", "Daniel", "Neda",
				"Aaron", "Kate"
		};
		
		int[] times = {
				341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 
				393, 299, 343, 317, 265
		};
		
		int minIndex, secMin;
		
		for (int i = 0; i < names.length; i++)
		{
			System.out.println(names[i] + ": " + times[i]);
		}
		
		System.out.println("The fasterst runner is ");
		minIndex = getFastest(times);
		System.out.println(names[minIndex] + ": " + times[minIndex]);
		
		System.out.println("The Second fast runner is ");
		secMin = getSecond(times);
		System.out.println(names[secMin] + ": " + times[secMin]);
		
	}
	
	public static int getFastest(int[] a)
	{
		int length = a.length;
		if (length == 0)
			System.err.println("Empty List");
		if (length == 1)
			return 0;
		
		int min = a[0];
		for (int i = 1; i < length; i++)
		{
			if (a[i] < min)
				min = i;
		}
		return min;
	}
	
	public static int getSecond(int[] a)
	{
		int minimum = getFastest(a);
		
//		a[minimum] = Integer.MAX_VALUE;
//		return getFastest(a);
		
		int length = a.length;
		
		int min = a[0];
		for (int i = 1; i < length; i++)
		{
			if (i == minimum)
				continue;
			if (a[i] < min)
				min = i;
		}
		return min;
	}

}

import java.util.*;

public class SortColumns
{
	public static List<Integer> removeDuplicates(List<Integer> someList)
	{
		//this method eliminates the problem where the mindeletionsize added duplicate indices to the list
		int numOfAppearences;

		for (int y=0;y<someList.size();y++)
		{
			for (int x=y+1;x<someList.size();x++)
			{
				if (someList.get(y)==someList.get(x) && y!=x)
				{
					someList.remove(y);
				}
			}
		}
	  return someList;
	}

	public static void printArray(String[] a, int size)
	{
		System.out.print("A = [");
		for (int j=0;j<size;j++)
		{
			if (j<size-1)
			{
				System.out.print("'"+a[j]+"'"+", ");
			}

			else if (j==size-1)
			{
				System.out.print("'"+a[j]+"'");
			}
		}
	  System.out.print("]");
	  System.out.println();
	}

	//public static List<Integer> isStringLengthEqual(String[] a)
	public static int isStringLengthEqual(String[] a)
	{
		//checks to see if all strings in array are not equal. If they are not, -1 is added to the array
		//List<Integer> someList = new ArrayList<Integer>();
		int someLength;
		int result=0;

		someLength = a[0].length();

		for (int i=0;i<a.length;i++)
		{
			if (a[i].length()!=someLength)
			{
				//someList.add(-1);
				//return someList;
				result=-1;
			}
		}
	  //return someList;
		return result;
	}

	public static List<Integer> minDeletionSize(String[] a)
	{
		List<Integer> myList = new ArrayList<Integer>();
		int someLength = a[0].length();
		//.size is number of elements in array
		//.length is the capacity of the array

		//compares 2 elements at the same index from 2 separate strings.
		for (int i=0;i<a[0].length();i++)
		{
			for (int j=0;j<a.length -1;j++)
			{
				if(a[j].charAt(i)>a[j+1].charAt(i))
				{
					myList.add(i);
					//System.out.println("Letter 1: "+a[j].charAt(i)+" Letter 2: "+a[j+1].charAt(i));
					//System.out.println("Added: "+myList.get(i));
				}
			}
		}
	  return myList;
	}

	public static void main(String[] args)
	{
		Scanner sizeInput = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter the size of the array. ");
		int arraySize=sizeInput.nextInt();
		System.out.println();
		
		String[] arrayA = new String[arraySize];
		String uiResult;

		for (int i=0;i<arraySize;i++)
		{
			System.out.println("Please enter some lowercase characters.");
			//do the separated by a space without the for loop for single line entry
			uiResult=userInput.next();
			arrayA[i]=uiResult;
		}

		for (int i=0;i<arrayA.length;i++)
		{
			System.out.println(arrayA[i]);
		}

		System.out.println();
		printArray(arrayA,arraySize);
		
		//calls isStringLEngthEqual to see if string length is the same for all strings in array
		//List<Integer> someResult = new ArrayList<Integer>();
		//someResult=isStringLengthEqual(arrayA);
		int someResult;
		someResult=isStringLengthEqual(arrayA);

		if (someResult!=-1)
		{
			List<Integer> result = new ArrayList<Integer>();
			result=minDeletionSize(arrayA);
			List<Integer> listResult = new ArrayList<Integer>();
			listResult=removeDuplicates(result);
			System.out.println("{"+listResult+"}");
		}

		else if (someResult==-1)
		{
			System.out.println("{"+someResult+"}");
		}
	}
}
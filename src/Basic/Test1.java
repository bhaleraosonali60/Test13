package Basic;

public class Test1 {

		public static void main(String[] args)
		{
			String S1="Never Give UP";
			int lower=0;
			int upper=0;
			for(int i=0; i<S1.length(); i++) 
			{
				char a=S1.charAt(i);
				
				if(Character.isUpperCase(a))
				{
					upper++;
				}
				
				else 
				{
					lower++;
				}
			}
			System.out.println("Lower="+lower);
			System.out.println("upper="+upper);
		}

	}


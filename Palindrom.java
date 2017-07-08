

		import java.util.Scanner;
		class Palindrome{
			public static void main (String[] args) throws java.lang.Exception
			{
				Scanner sc=new Scanner(System.in);
				String input=sc.next();
				String palindrome=new String();
				int length=0;
				for(int i=0;i<input.length();i++)
				{
				    for(int j=i+1;j<input.length();j++)
				    {
				        String temp=input.substring(i,j);
				        if(temp.equalsIgnoreCase(String.valueOf(new StringBuffer(temp).reverse())))
				        {
				            if(temp.length()>length)
				            {
				                length=temp.length();
				                palindrome=new String(temp);
				            }
				        }
				    }
				}
				System.out.println(palindrome);
			}
		}

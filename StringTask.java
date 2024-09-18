package shahban_project;

import java.lang.String;

import java.util.*;

class Task
{

	public String reverseTask1(String s)
	{
		char[] rev = new char[s.length()];
		int j=0;
//		String rres ="";
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev[j]= s.charAt(i);
//			rres =  rres + s.charAt(i);
			j=j+1;
			
		}
//		System.out.println("IN PROGRAM: "+rres);
		String res =new String(rev);
		return res;
	}
	
	public boolean palindrome(String s) 
	{
		String cur_s =new String(s);
		
		char rev[] =new char[s.length()];
		int j=0;
		for(int i=s.length()-1;i>=0;i--) 
		{
			rev[j] = s.charAt(i);
			j=j+1;
		}
		String rev_s =new String(rev);
		
		if(rev_s.equals(cur_s)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
	
	public void countvowelsconsonants(String s) 
	{
		int v_count=0,c_count=0;
		for(int i=0;i<s.length();i++) 
		{
			
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') 
			{
				v_count =v_count+1;
			}
			else 
			{
				c_count = c_count+1;
			}
		}
		System.out.println("Given String: "+s);
		System.out.println("vowels: "+v_count);
		System.out.println("consonants: "+c_count);
	}
	
	public void removeduplicates(String s) 
	{
	String result="";
	
	for(int i=0;i<s.length();i++) 
	{
		char val =s.charAt(i);
		
		if(result.indexOf(val)<0) 
		{
			result =result + val;
		}
	}
	System.out.println("Input: "+s);
	System.out.println("Output: "+result);
		
	}
	
	public String capitalize(String s) 
	{
		char res[] = new char[s.length()];
		for(int i=0;i<s.length();i++) 
		{
			if((i==0)) 
			{
				char r= s.charAt(i);
				res[i]=Character.toUpperCase(r);
			}
			else if( (s.charAt(i)==' ')) 
			{
				
				res[i]=s.charAt(i);
				i=i+1;
				char re=s.charAt(i);
				res[i]=Character.toUpperCase(re);
			}
			else 
			{
				res[i]=s.charAt(i);
			}
		}
		String result =new String(res);
		return result;
	}
	
	public String compressedcount(String s) 
	{
		String res ="";
		int count=1;
		
		for(int i=1;i<s.length();i++) 
		{
			if(s.charAt(i-1) == s.charAt(i)) 
			{
				count=count+1;
			}
			else 
			{
				res = res + s.charAt(i-1) + count; 
				count =1;
			}		
		}
		res = res + s.charAt(s.length()-1) + count; 
		return res;
	}
	
	boolean anagram(String s1,String s2) 
	{
		char c1[] = s1.toCharArray();
		char c2[] = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	void expandstring(String s)
	{
		System.out.println(s);
		char ch = '\0';
		char ch2 = '\0';
		int l =0;
		for(int i=0;i<s.length();i++) 
		{
			
			if(i%2==0) 
			{
				ch= s.charAt(i);
			}
			else 
			{
				ch2 = s.charAt(i);
				l =ch2 - '0';
				while(l>0) 
				{
					System.out.print(ch);
					l=l-1;
					
				}
//				
			}
			
		}
		
	}
	void substring(String s) 
	{
//		int l= s.length();
//		String temp[] = new String[l*l];
//		int k=0;
//		for(int i=0;i<l-1;i++) 
//		{
//			for(int j=1;j<l;j++) 
//			{
//	
//				System.out.println(s.substring(i,j));
//				System.out.println(s.substring(i));
//		
//			}
//		}
//		System.out.println(Arrays.toString(temp));
	}

	char nonrepeated(String s) 
	{
	
		int temp[]=new int[s.length()];
		for(int i=0;i<s.length();i++) 
		{
			int count = 0;
			char ch1=s.charAt(i);
			for(int j=0;j<s.length();j++) 
			{
				char ch2=s.charAt(j);
				if(ch1==ch2) 
				{
					count=count+1;
				}
			}
			temp[i]=count;
		}
	
		for(int i=0;i<s.length();i++) 
		{
			if(temp[i]==1) 
			{
				return s.charAt(i);
			}
		
		}
		return ' ';	
	}
	
	void countduplicates(String s) 
	{
		int temp[]=new int[s.length()];
		for(int i=0;i<s.length();i++) 
		{
			int count = 0;
			char ch1=s.charAt(i);
			for(int j=0;j<s.length();j++) 
			{
				char ch2=s.charAt(j);
				if(ch1==ch2) 
				{
					count=count+1;
				}
			}
			temp[i]=count;
		}
		System.out.println("Given String :"+ s);
		System.out.println(Arrays.toString(temp));
		
	}
	void longprefix(String s[]) 
	{
		int count =0;
		String res = "";
		for(int i=0;i<s[0].length();i++) 
		{
			if(((s[0].charAt(i))==(s[1].charAt(i))) && ((s[1].charAt(i))==(s[2].charAt(i))) ) 
			{
				count=count +1;
				res=res+ s[0].charAt(i);
			}
		}
		System.out.println(res+ " "+ count);
	}

	public String getfullname(String fs, String ms, String ls) {
		char fstr = fs.charAt(0);
		char mstr = ms.charAt(0);
		String lstr = ls;
		String name = fstr +"."+mstr+"."+lstr;
		return name;
		
		
	}

	public String hidemail(String mail) {
	
		String temp_str ="";
		String gmail ="@gmail.com";
		char fchar =mail.charAt(0); 
		for(int i=1;i<mail.length();i++) 
		{
		char ch = mail.charAt(i);
		if(ch == '@') 
		{
			break;
		}
		else
		{
			temp_str= temp_str+"*";
		}
		}
		String hidemail = fchar+temp_str+gmail;
		return hidemail;
	}

	
	
}
	
	

public class StringTask {
	static Scanner sc =new Scanner(System.in);
	public static void main(String args[]) 
	{
		Task obj = new Task();
		
//		String s = new String("hello");	
//		System.out.println("Given Input: "+s+"\n"+"Output: "+ obj.reverseTask1(s));
	
//		String s = new String("madam");
//		System.out.println("Given Input: "+s+"\n"+"Output: "+obj.palindrome(s));
		
//		String s = new String("hello");	
//		obj.countvowelsconsonants(s);
		
//		String s = new String("programming");	
//		obj.removeduplicates(s);
		
//		String s = new String("programming");
//		obj.countduplicates(s);
		

//		String s = new String("a3b1c2");
//		obj.expandstring(s)

//		System.out.print("Enter First Name:");
//		String fs =sc.nextLine();
//		System.out.print("Enter Middle Name:");
//		String ms =sc.nextLine();
//		System.out.print("Enter Last Name:");
//		String ls =sc.nextLine();
//		System.out.println(obj.getfullname(fs,ms,ls));
		
//		System.out.print("Enter Your Mail ID:");
//		String mail =sc.nextLine();
//		System.out.println(obj.hidemail(mail));
		
//		String s = new String("hello world king luther");
//		System.out.println("Given Input: "+s+"\n"+"Output: "+obj.capitalize(s));
		
//		String s = new String("aabbbcccc");	
//		System.out.println("Given Input: "+s+"\n"+"Output: "+obj.compressedcount(s));
		
//		String s1 = new String("listen");	
//		String s2 = new String("silent");	
//		System.out.println("Given Input: "+s1+"  -  "+s2+"\n"+"Output: "+obj.anagram(s1,s2));
		
//		String s = new String("sshhaa");	
//		System.out.println("Given Input: "+s+"\n"+"Output: "+obj.nonrepeated(s)); 
		
		
//		String s = new String("abc");	
//		obj.substring(s);
		
//		String s[] ={"flower","flying","flow"};
//		obj.longprefix(s);
		
		
		
	}

}















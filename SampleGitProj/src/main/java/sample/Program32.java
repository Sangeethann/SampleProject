package sample;

public class Program32 {
	String str;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Program32 obj=new Program32();
		obj.str="Java";
		obj.palindromeStr(obj.str);
		Program32 obj1=new Program32();
		obj1.str="Malayalam";
		obj1.palindromeStr(obj1.str);
		}
		public void palindromeStr(String str)
		{
		boolean flag = true;    
		str = str.toLowerCase();    
		for(int i = 0; i < str.length()/2; i++){    
		            if(str.charAt(i) != str.charAt(str.length()-i-1)){    
		                flag = false;    
		                break;    
		            }    
		        }    
		if(flag)    
		System.out.println("Given string "+str+" is palindrome");    
		else    
		System.out.println("Given string "+str+" is not a palindrome");    
		}

	}



import java.io.*;
import java.util.*;
import java.lang.*;
class TypeCheck
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String s = new String(sc.next());
		HashMap<String,String> mapp = new HashMap<>();
		mapp.put("if","True");
		mapp.put("type","True");
		mapp.put("func","True");
		mapp.put("else","True");
		mapp.put("map","True");
		if(mapp.containsKey(s))
			System.out.println(s+" "+"is a keyword");
		else
			System.out.println(s+" "+"is not is keyword");
	}
}



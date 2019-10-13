import java.util.*;
public class solution {

	public static void printKeypad(int input){
        
        String num = Integer.toString(input);
        ArrayList<String> out = outputFun(num);
        for(int i=0;i<out.size();i++)
        {
            System.out.println(out.get(i));
        }
	}
    public static ArrayList<String> outputFun(String num)
    {
        if(num.length()==0)
        {
            ArrayList<String> ans = new ArrayList<>();
            ans.add("");
            return ans;
        }
        char ch=num.charAt(0);
        String str=num.substring(1);
        ArrayList<String> per=outputFun(str);
        ArrayList<String> res=new ArrayList<>();
        String code=helper[ch-'0'];
        for(String val : per)
        {
            for(int i=0;i<code.length();i++)
            {
                res.add(code.charAt(i)+val);
            }
        }
        return res;
    }
    static final String helper[] 
        = { "","", "abc", "def", 
            "ghi", "jkl", "mno", 
            "pqrs", "tuv", "wxyz"}; 

}

public class runner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		solution.printKeypad(input);
	}
}

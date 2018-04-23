/**
 * 
 */
package volume_006_Problem_600_to_699;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * @author Saddat Hasan
 *
 *
 *
 *Parenthesis Balance 
 */
public class Problem_673 {

	public static void main(String[] args) throws IOException{
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(isr);
		int cases= Integer.parseInt(br.readLine());
		StringBuilder out = new StringBuilder("");
		for(int i=0;i<cases;i++){
			String str=br.readLine();
			if("".equals(str)){
				out.append("Yes").append("\n");
				continue;
			}
			Stack<Character> stack=new Stack<Character>();
			if(str.charAt(0)==']' ||str.charAt(0)==')'){
				out.append("No").append("\n");
				continue;
			}
			stack.push(str.charAt(0));
			for(int j=1;j<str.length();j++){
				char temp=str.charAt(j);
				if(temp=='[' || temp=='('){
					stack.push(str.charAt(j));
				}
				if(temp==']'){
					if(stack.isEmpty()){
						stack.push(temp);
						break;
					}
					if(stack.peek()=='[')
						stack.pop();
					else{
						stack.push(temp);
						break;
					}
				}
				if(temp==')'){
					if(stack.isEmpty()){
						stack.push(temp);
						break;
					}
					if(stack.peek()=='(')
							stack.pop();
					else{
						stack.push(temp);
						break;
					}
				}
			}
			if(stack.isEmpty())
				out.append("Yes");
			else
				out.append("No");
			out.append("\n");
		}
		System.out.print(out);
	}

}

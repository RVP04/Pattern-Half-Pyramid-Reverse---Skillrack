import java.util.*;
public class Hello {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
	    int N = input.nextInt();
	    
	    for(int i=1;i<=N;i++)
	    {
	        for(int j=N;j>=N-i+1;j--)
	        {
	            System.out.print(j+" ");
	        }
	        System.out.println();
	    }

	}
}


public class Quiz5 {
	
    static void findrunres(int S, int N, int M) 
    { 
  
        if (((N * 6) < (M * 7) && S > 6) || M > N) 
            System.out.println("No"); 
  
        else {  
            int days = (M * S) / N; 
  
            if (((M * S) % N) != 0) 
                days++; 
  
            System.out.println("Yes " + days); 
        } 
    } 
    public static void main(String[] args) 
    { 
        int S = 10, N = 16, M = 2; 
  
        findrunres(S, N, M); 
        findrunres(10, 20, 30);
        System.out.println("aaaaaaa");
    } 
}

import java.io.*;
class Practice6_2 
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("テストの点数を入力してください。(0で終了)");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;
        int ans = 0;
        do{
            String str = br.readLine();
            ans = Integer.parseInt(str);   
            sum += ans;
           
        }while(ans != 0);
        
        System.out.println("テストの合計点は" + sum + "です。");
           
                


        
      

        
        
    }
    
}

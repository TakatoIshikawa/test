import java.io.*;
class Practice6_5 {
    public static void main(String[] args) throws IOException
    {
        System.out.println("2以上の整数を入力してください。");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);
        int i = 2;


        do{
            if(num % i == 0){
                System.out.println(num + "は素数ではありません。");
                break;
            }
            else{
                i++;
                if(i == num-1){
                    System.out.println(num + "は素数です。");
                }
                continue;
            }
            
        }while(i < num);

       
        
    }
    
}

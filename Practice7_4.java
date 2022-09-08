import java.io.*;
class Practice7_4 
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("5人のテストの点数を入力してください。");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        int[] res = new int[5];
    

        for(int i=0; i<5; i++){
            String str = br.readLine();
            res[i] = Integer.parseInt(str);
        }
        for(int j=0; j<5; j++){
            System.out.println((j+1) + "番目の人の点数は" + res[j] + "です。");
        }


        for(int s=0; s< res.length -1; s++){
            for(int t = s+1; t< res.length; t++){
                if(res[t] > res[s]){
                    int tmp = res[t];
                    res[t] = res[s];
                    res[s] = tmp;

                }

            }

        }

        
        System.out.println("最高得点は" + res[0] + "です。");



        
    }
    
}

import java.io.*;
class Practice4_5 
{
    public static void main(String[] args) throws IOException 
    {
        System.out.println("科目1～5の点数を入力してください。");
        
        BufferedReader br =
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();
        String str3 = br.readLine();
        String str4 = br.readLine();
        String str5 = br.readLine();

        double sum = 0;
        sum += Double.parseDouble(str1);
        sum += Double.parseDouble(str2);
        sum += Double.parseDouble(str3);
        sum += Double.parseDouble(str4);
        sum += Double.parseDouble(str5);

        System.out.println("5科目の合計点は"+ sum + "点です。");
        System.out.println("5科目の平均点は" + sum/5 + "点です。");

        




        
    }
    
}

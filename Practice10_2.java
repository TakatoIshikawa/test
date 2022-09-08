import java.io.*;
class Practice10_2 
{
    public static void main(String[] str) throws IOException
    {
        System.out.println("文字列を入力してください。");

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();

        StringBuffer str2 = new StringBuffer(str1);       //str2という変数にStringBufferクラスのオブジェクトを作成する。

        str2.reverse();                                   //変数の中身を逆順にする。

        System.out.println(str1 + "を逆にすると" + str2 + "です。");


        
    }
    
}

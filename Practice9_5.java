import java.io.*;
class MyPoint
{
    //フィールド
    private int x;
    private int y;

    //メソッド
    public void setX(int px)
    {
        System.out.println("X座標を設定しました。");
        x = px;
    }
    public void setY(int py)
    {
        System.out.println("Y座標を設定しました。");
        y = py;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    //コントラクタ
    public MyPoint()
    {
        System.out.println("初期座標を(0, 0)に設定しました");
        x = 0;
        y = 0;        
    }
    public MyPoint(int px, int py)
    {
        x = px;
        y = py;
        System.out.println("X座標を" + x + "\t" + "Y座標を" + y + "にしました。");
    }
}
class Practice9_5 
{
    public static void main(String[] args) throws IOException 
    {
        MyPoint mypoint0 = new MyPoint();

        System.out.println("X座標とY座標を入力してください。");

        BufferedReader br = 
         new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("まずX座標を入力してください。");
        String str1 = br.readLine();
        int resx = Integer.parseInt(str1);
        mypoint0.setX(resx);

        System.out.println("次にY座標を入力してください。");
        String str2 = br.readLine();        
        int resy = Integer.parseInt(str2); 
        mypoint0.setY(resy);

        int ansx = mypoint0.getX();
        int ansy = mypoint0.getY();


        MyPoint mypoint1 = new MyPoint(ansx, ansy);

        mypoint1.getX();




        
    }
    
}

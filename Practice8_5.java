import java.io.*;
class MyPoint{
    int x;
    int y;
    
    void setX(int px){
        x = px;
        System.out.println("X座標を設定します");
    }
    void setY(int py){
        y = py;
        System.out.println("Y座標を設定します。");
    }
    
    int getX(){
        return x;
    }
    int getY(){
        return y;
    }
}


class Practice8_5 {
    public static void main(String[] args) throws IOException 
    {
        System.out.println("X座標とY座標を入力してください。");
        MyPoint mypoint = new MyPoint();

        BufferedReader br =
         new BufferedReader(new InputStreamReader(System.in));

        mypoint.setX(mypoint.x);
        String str1 = br.readLine(); 

        mypoint.setY(mypoint.y);
        String str2 = br.readLine();    
        
        mypoint.x = Integer.parseInt(str1);
        mypoint.y = Integer.parseInt(str2);
        
        System.out.println("X座標は" + mypoint.x + "\t" + "Y座標は" + mypoint.y + "です。");
    }
    
}

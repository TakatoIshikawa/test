class Carp
{
    private int num;
    private double gas;

    public Carp()
    {
        num = 0;
        gas = 0.0;
        System.out.println("車を作成しました。");
    }

    public void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("ナンバーを" + num + "ガソリン量を" + gas + "にしました。");
    }
    public String toString()
    {
        String str = "ナンバー" + num + "ガソリン量" + gas + "の車";
        return str;
    }
}
class Practice11_1 
{
    public static void main(String[] args) 
    {
    Carp car1 = new Carp();
    car1.setNumGas(1234, 20.5);
    System.out.println(car1 + "です。");
    }


    
}

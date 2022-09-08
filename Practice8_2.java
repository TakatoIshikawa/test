class Car{
    int num;
    double gas;

    void show(){
        System.out.println("車のナンバーは" + num + "です。");
        System.out.println("ガソリン量は" + gas + "です。");
    }

   void setNumGas(int n, double g)
    {
        num = n;
        gas = g;
        System.out.println("車のナンバーを" + num + "に、ガソリン量を" + gas + "にしました。");
    }


}
class Practice8_2{
    public static void main(String[] args)
    {
       Car car1;
       car1 = new Car();
    car1.setNumGas(1234, 20.5);
    //    car1.num = 3456;
    //    car1.gas = 67;
       car1.show();
       

    }
    
}


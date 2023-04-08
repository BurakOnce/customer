/**
Burak Önce 20120205052
Bu program iki müşterinin bilgilerini içerir
Bu bilgiler ve iki müşterinin bakiyeleri arası fark output olarak verilir
*/

class customers
{
  String isim;
  int hesapNO;
  int bakiye;

  customers(String s,int x, int y)
  {
    isim = s  ;
    hesapNO = x  ;
    bakiye = y ;
  }


  public static void main(String[] args) 
  {
    customers first_customer;
    customers second_customer;

    first_customer =new customers("Ali",111,3000);
    second_customer =new customers("Ayse",222,2000);

    System.out.print(first_customer.isim + " " + first_customer.hesapNO +" " + first_customer.bakiye +"\n");

    System.out.print(second_customer.isim + " " + second_customer.hesapNO +" " + second_customer.bakiye +"\n");

    System.out.print("Bakiyeler arasi fark = ");
  
    System.out.print(Math.abs(first_customer.bakiye-second_customer.bakiye));
  }
}
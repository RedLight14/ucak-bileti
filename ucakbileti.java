import java.util.Scanner;

public class ucakbileti {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        int km,yas,yön;
        double tutar,tutarIndirimi,yasIndirimi,yönIndirimi,toplam;

        System.out.print("Mesafeyi km giriniz : ");
        km=inp.nextInt();
        System.out.print("Yas giriniz : ");
        yas=inp.nextInt();
        System.out.print("Yolculuk tipini giriniz(1->tek yön , 2->gidis-donus) : ");
        yön=inp.nextInt();

        if(km<=0||yas<=0||(yön<1||yön>2))
        {
            System.out.print("Hatali veri girdiniz...");
        }
        else
        {
            if(yas<12)
            {
                toplam=(km*0.10);
                yasIndirimi=toplam*0.50;
                tutarIndirimi=toplam-yasIndirimi;
                if(yön==2)
                {
                    yönIndirimi=(km*0.20);
                    tutar=(tutarIndirimi-yönIndirimi)*2;
                    System.out.print("Toplam tutar : "+tutar+"TL");
                }
                else
                {
                    System.out.print("Toplam tutar : " + tutarIndirimi+"TL");
                }
            }
            if(yas>=12&&yas<=24)
            {
                toplam=(km*0.10);
                yasIndirimi=toplam*0.10;
                tutarIndirimi=toplam-yasIndirimi;
                if(yön==2)
                {
                    yönIndirimi=(tutarIndirimi*0.20);
                    tutar=(tutarIndirimi-yönIndirimi)*2;
                    System.out.print("Toplam tutar : "+tutar+"TL");
                }
                else
                {
                    System.out.print("Toplam tutar : " + tutarIndirimi+"TL");
                }
            }
            if(yas>=65)
            {
                toplam=(km*0.10);
                yasIndirimi=toplam*0.30;
                tutarIndirimi=toplam-yasIndirimi;
                if(yön==2)
                {
                    yönIndirimi=(km*0.20);
                    tutar=(tutarIndirimi-yönIndirimi)*2;
                    System.out.print("Toplam tutar : "+tutar+"TL");
                }
                else
                {
                    System.out.print("Toplam tutar : " + tutarIndirimi+"TL");
                }
            }
            if(yas>24&&yas<65)
            {
                tutar=(km*0.10);
                if(yön==2)
                {
                    yönIndirimi=((km*0.20)-tutar)*2;
                    System.out.print("Toplam tutar : "+yönIndirimi+"TL");
                }
                else
                {
                    System.out.print("Toplam tutar : " + tutar+"TL");
                }
            }
        }
    }
    }

package interviewQuestions4;

import java.util.ArrayList;
import java.util.List;

public class Q02_CreateRandomList_SetList {
    // int array list oluşturun 10 elemandan oluşmalı
    // random ekle isminde void bir metod oluşturun  ve parametresi int array list olsun.
    // bu metod array list içinde 0' dan 20 ye kadar değer atasın.
    // eğer çift sayı atarsa o elemanının yerine 111 yazsın
    // eğer çift sayı yoksa çift sayı yoktur mesajını versin.

    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        randomEkle(list);


    }


    private static void randomEkle(List<Integer> list) {

        for (int i = 0; i < 10; i++) {
            list.add((int)(Math.random()*20));//0-20'ye kadar random degerler atamak icin
            //int ile double deger casting yapilir. Aksi durumda hata verir
        }
        System.out.println(list);

        int sayac=0;

        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i)%2==0){
                sayac++;
                list.set(i,111);
            }
        }//outer

        if(sayac==0){
            System.out.println("listemiz cift sayi icermiyor");
        }

        System.out.println(list);

    }
}

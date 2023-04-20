package Deneme;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class bolum{
	public static void main(String[] args)
	{
		int puan=100;
		int sayac=0;
		int tahmin;
		System.out.println("bilgisayar 0 ile 100 arasinda bir sayi belirleyecek ve siz onu tahmin etmelisiniz");
		Scanner scan=new Scanner(System.in);
		Random rnd=new Random();
		int zar=rnd.nextInt((100-0)+1)+0;
		System.out.println(zar);
		System.out.println("bilgisayar sayiyi belirledi");
		do
		{
			sayac++;
			System.out.print(sayac+".tahmininizi giriniz:");
			tahmin=scan.nextInt();
			if(tahmin==zar)
			{
				System.out.println(sayac+".tahminizde bildiniz");
				System.out.println("puaniniz:"+puan);
			}
			else if(tahmin<zar)
			{
				System.out.println("daha buyuk bir sayi giriniz");
				puan--;
			}
			else if(tahmin>zar)
			{
				System.out.println("daha kucuk bir sayi giriniz");
				puan--;
			}
		}while(tahmin!=zar);
		System.out.println("puaniniz:"+puan+" kac defada bildiginiz:"+sayac);
	}
}
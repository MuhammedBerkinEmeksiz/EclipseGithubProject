package Deneme;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class sorudeneme2 {
	public static void main(String[] args)
	{
		int zar;
		String sözcük="10 adet zar atmak için evet e tıklayınız";
		System.out.println(sözcük);
			int sonuc=0;
			if(sonuc==JOptionPane.showConfirmDialog(null,"10 defa zar atmak istter misiniz?","soru",JOptionPane.YES_OPTION))
			{
				for(int i=0;i<10;i++)
				{
				Random rnd=new Random();
				zar=rnd.nextInt((10-0)+1)+0;
				System.out.println(zar);
				}
			}
			else
			{
				System.out.println("HAYİR SECENEGİNİ SECTİNİZ İCİN ZAR ATMA İSLEMİ OLMAYACAKTIR!!!");
			}
	}
}

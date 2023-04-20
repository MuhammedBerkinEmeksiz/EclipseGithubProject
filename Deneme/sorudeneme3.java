package Deneme;
import javax.swing.*;
import java.util.*;
public class sorudeneme3 {

	public static void main(String[] args)
	{
		int sayac=0;
		Random rnd=new Random();
		int a=rnd.nextInt(100);
		int b=rnd.nextInt(100);
		System.out.println("a sayisinin degeri:"+a);
		System.out.println("b sayisinin degeri:"+b);
		int temp;
		if(a>b)
		{
			temp=a;
			a=b;
			b=temp;
		}
		if(a%2==0)
		{
			for(int i=a;i<=b;i+=2)
			{
				System.out.println(i);
				sayac++;
			}
		}
		else
		{
			for(int i=a+1;i<=b;i+=2)
			{
				System.out.println(i);
				sayac++;
			}
		}
		System.out.println("sayi adedi:"+sayac);
	}

}

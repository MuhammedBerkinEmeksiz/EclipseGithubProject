package Deneme;
import java.io.*;
import javax.swing.*;
import java.util.*;
public class sorudeneme{
	public static void main(String[] args)
	{
		for(int i=0;i<=5;i++)//i değeri satır sayısını belirler
		{
			int s=1;// hangi değerden başlayacağını belirler
			int r=i+1;//bir satırda kaç eleman olacağına karar verir
			for(int sut=0;sut<=i;sut++)
			{
				if(sut>0)
					s=s*(r-sut)/sut;
				System.out.print(s+" ");
			}
			System.out.println();
		}
	}
}

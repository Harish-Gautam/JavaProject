package com.cetpa;

import java.util.Scanner;

public class MainClass 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		CustomerService service=new CustomerService();
		while(true)
		{
			System.out.println("=================");
			System.out.println("1:Insert Record");
			System.out.println("2:Show all Records");
			System.out.println("3:Delete Record");
			System.out.println("4:Update Record");
			System.out.println("5:Show Record");
			System.out.println("6:Exit");
			System.out.println("=================");
			System.out.print("Enter your choice:");
			int ch=Integer.parseInt(sc.nextLine());
			if(ch==1)
			{
				service.insertRecord();
			}
			else if(ch==2)
			{
				service.showAllRecords();
			}
			else if(ch==3)
			{
				service.deleteRecord();
			}
			else if(ch==4)
			{
				service.updateRecord();
			}
			else if(ch==5)
			{
				service.showRecord();
			}
			else if(ch==6)
			{
				System.out.println("==============================");
				System.out.println("Your program is terminated...");
				System.out.println("==============================");
				break;
			}
		}
	}
}

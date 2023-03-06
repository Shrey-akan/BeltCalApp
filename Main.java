package com.belt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws IOException{
		BeltC bc = new BeltC();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Welcome To Our Shop");
		System.out.println("Bharat Trading Company");
		System.out.println("Start Purchasing  ");
		System.out.println("Enter Your First Name");
		String fname = br.readLine();
		System.out.println("Enter Your Last Name");
		String lname = br.readLine();
		System.out.println("Enter Your Mobile Number");
		String phone = br.readLine();
		System.out.println("Enter Your GST Number");
		String gnum = br.readLine();
		double res =0;
		double sum =0;
		while(true) {
			System.out.println("1.A \n2.B \n3.C \n4.D  \n5.E \n6.Bill  \n7.GST  \n8.Add More \n9.Exit");
			int ch = Integer.parseInt(br.readLine());
			if(ch==1) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("A");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==2) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("B");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==3) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("C");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==4) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("D");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==5) {
				System.out.println("Enter the size ");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the Quantity ");
				double quanty = Integer.parseInt(br.readLine());
				BeltR rc = bc.getBelt("E");
				rc.getRate();
				double amount = rc.calculatePrice(size, quanty);
				sum = sum+amount;
			}
			else if(ch==6) {
				BeltR rc = bc.getBelt("Bill");
				
				rc.getBilll(sum);
			}
			else if(ch==7) {
				BeltR rc = bc.getBelt("GST");
				System.out.println("Enter Gst for this item");
				double number = Integer.parseInt(br.readLine());
				double ggt = number/100;
				double res1 = rc.getGst(sum, ggt);
				res = res1;
			
			}
			else if(ch==8) {
				System.out.println("Enter the Section of Belt");
				String str = br.readLine();
				System.out.println("Enter the size of belt");
				double size = Integer.parseInt(br.readLine());
				System.out.println("Enter the quantity");
				double qnty = Integer.parseInt(br.readLine());
				BeltR rrr = bc.getBelt(str);
				rrr.getRate();
				double price = rrr.calculatePrice(size, qnty);
				sum = sum + price;
			}
			else if(ch==9) {
				Date date = new Date();
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy");
				String sd = format.format(date);
				
				System.out.println("Date "+sd+" \n");
				System.out.println("Name "+fname.concat(lname)+" \n Mobile Number :"+phone);
				System.out.println("\n GST number : "+gnum);
				System.out.println("Total Bill is "+res+" \nThanks For Shopping ");
				
				break;
			}
			else {
				System.out.println("Choose valid option ");
			}	
		}
	}

}

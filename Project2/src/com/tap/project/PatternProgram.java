package com.tap.project;

import java.util.Scanner;

public class PatternProgram {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		patternProgram(n);
		scan.close();
	}
	public static void patternProgram(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(j==1 || (i==1 && j<=n) || (i==(n/2) + 1 && j<=n) || (j==n && i>1 && i<=(n/2) + 1)) {
				System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
	
}

package SourceFiles;

import java.util.Scanner;

public class EquilibriumCheck {
	
	public String inEquilibrium(int n, int[] x, int[] y,int[] z) {
		int xsum=0,ysum=0,zsum=0;
		for(int i=0;i<n;i++) {
			xsum+=x[i];
			ysum+=y[i];
			zsum+=z[i];
		}
		if(xsum==0 && ysum==0 && zsum==0) {
			return "YES";
		}
		else {
			return "NO";
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		EquilibriumCheck d = new EquilibriumCheck();
		n=in.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] z = new int[n];
		for(int i=0;i<n;i++) {
			x[i]=in.nextInt();
			y[i]=in.nextInt();
			z[i]=in.nextInt();
		}
		System.out.println(d.inEquilibrium(n,x,y,z));
	}

}

package com.company;

import java.util.Scanner;

public class Main {
/*
 C(n,r) = n! / (r! * (n-r)!)

 */
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int total = 1,total_1=1,total_2=1;
        int last_total;
        System.out.print("n: ");
        int n= inp.nextInt();
System.out.print("r: ");
int r= inp.nextInt();

for(int i=1; i<=n; i++){  //(n)!
    total*=i;

}
for(int i=1; i<=r; i++){  //(r)!
    total_1*=i;
}
for(int i=1; i<=(n-r);i++) {  //(n-r)!
    total_2*=i;
        }
last_total= total/((total_1)*(total_2));
System.out.print("Result of combination:  "+last_total);

    }
}

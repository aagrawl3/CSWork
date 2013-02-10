import java.util.Scanner;
import static java.lang.System.out;
import java.io.PrintStream;
public class mmultiply{
public static void main(String[] args)
{
int num1,num2,num3;
Scanner inp=new Scanner(System.in);
System.out.println("Enter 3 numbers (m,n,p) in that order such that two matrices of the form mxn and nxp are created to be multiplied");
num1=inp.nextInt();
num2=inp.nextInt();
num3=inp.nextInt();
double[][] b=new double[num1][num2];
double[][] c=new double[num2][num3];
for (int i=0;i<num1;i++){
for (int h=0;h<num2;h++){
b[i][h]=Math.random();
}}
for (int j=0;j<num2;j++){
for (int y=0;y<num3;y++){
c[j][y]=Math.random();
}}
double[][] multiplied=matrixmultiply(b,c,num1,num2,num3);
for (int g=0;g<num1;g++){
System.out.printf("\n");
for (int u=0;u<num3;u++){
//System.out.println(multiplied[g][u]);
System.out.printf("%.2f ",multiplied[g][u]);
}}
}
public static double[][] matrixmultiply(double[][] A,double[][] B, int m, int n, int p)
{
double[][] matprod;
matprod= new double[m][p];
for (int i=0;i<m;i++){
for (int j=0;j<p;j++){
	for (int k=0;k<n;k++){
matprod[i][j]+=A[i][k]*B[k][j];
}}}
return matprod;
}}
import java.util.Scanner;

public class MatrixOperation{
public static void main(String[] args){

Scanner input=new Scanner(System.in);

System.out.print("Enter a number of rows and columns");

int r=input.nextInt(),c=input.nextInt();

int[][] a=new int[r][c];
int[][] b=new int[r][c];

System.out.println("Enter elements of matrix a:");

for(int i=0; i<r; i++)
{
 for(int j=0; j<c; j++)
  {
   a[i][j]=input.nextInt();
 }
}

System.out.println("Enter elements of matrix b:");
for(int i=0; i<r; i++){
 for(int j=0; j<c; j++){
  b[i][j]=input.nextInt();
}
}

System.out.print("Addition (a+b):");
for(int i=0; i<r; i++){
 for(int j=0; j<c; j++){
  System.out.print((a[i][j]+b[i][j])+"");
}
System.out.println();
}

System.out.print("Substraction (a-b):");
for(int i=0; i<r; i++){
 for(int j=0; j<c; j++){
  System.out.print((a[i][j]-b[i][j])+"");
}
System.out.println();
}

System.out.print("Multiplication (a*b):");
for(int i=0; i<r; i++){
 for(int j=0; j<c; j++){
  System.out.print((a[i][j]*b[i][j])+"");
}
System.out.println();
}

System.out.print("Division (a+b):");
for(int i=0; i<r; i++){
 for(int j=0; j<c; j++){
if(b[i][j]!=0){
  System.out.print((a[i][j]/b[i][j])+"");
}
else{
 System.out.println("ERR");
}
}
System.out.println();
}

System.out.print("Transpose of a:");
for(int i=0; i<c; i++){
 for(int j=0; j<r; j++){
  System.out.print((a[i][j])+"");
}
System.out.println();
}
input.close();
}
}


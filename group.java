
package git_project;


public class Git_Project {


    public static void main(String[] args) {
 
       


int i,j,k,l;

java.util.Scanner sc = new java.util.Scanner(System.in);

int[][] matrix = new int[3][3];
System.out.println("Enter numbers for 1st matrix");

System.out.println("==============================");

System.out.println("Enter 1st line numbers : ");

matrix [0][0] = sc.nextInt();

matrix [0][1] = sc.nextInt();

matrix [0][2] = sc.nextInt();


System.out.println("==============================");

System.out.println("Enter 2nd line Numbers : ");

matrix [1][0] = sc.nextInt();

matrix [1][1] = sc.nextInt();

matrix [1][2] = sc.nextInt();


System.out.println("==============================");

System.out.println("Enter 3rd line Numbers : ");

matrix [2][0] = sc.nextInt();

matrix [2][1] = sc.nextInt();

matrix [2][2] = sc.nextInt();


System.out.println("==============================");

System.out.println("Enter numbers for 2nd matrix");

int [][] matrix2 = new int[3][3];


System.out.println("==============================");

System.out.println("Enter 1st line numbers : ");

matrix2 [0][0] = sc.nextInt();

matrix2 [0][1] = sc.nextInt();

matrix2 [0][2] = sc.nextInt();


System.out.println("==============================");
 
System.out.println("Enter 2nd line Numbers : ");

matrix2 [1][0] = sc.nextInt();

matrix2 [1][1] = sc.nextInt();

matrix2 [1][2] = sc.nextInt();


System.out.println("==============================");

System.out.println("Enter 3rd line Numbers : ");

matrix2 [2][0] = sc.nextInt();

matrix2 [2][1] = sc.nextInt();

matrix2 [2][2] = sc.nextInt();


System.out.println("==============================");

System.out.println("First Matrix is : ");

for(i=0; i<matrix.length; i++)
{

for(j=0; j<matrix[i].length; j++)
{

System.out.print(matrix[i][j] + "\t");

}

System.out.println(" ");

}

System.out.println("===============================");

System.out.println("Second Matrix is : ");

for(k=0; k<matrix2.length; k++)
{

for(l=0; l<matrix2[k].length; l++)
{

System.out.print(matrix2[k][l] + "\t");

}

System.out.println(" ");

}


System.out.println("===============================");

System.out.println("Addition is : ");
for(int a=0; a<matrix.length; a++)
{

for(int b=0; b<matrix[a].length; b++)
{

System.out.print(matrix[a][b] +matrix2[a][b] + "\t");

}

System.out.println(" ");

}

System.out.println("===============================");

System.out.println("Subtraction is : ");

for(int c=0; c<matrix.length; c++)
{

for(int d=0; d<matrix[c].length; d++)
{

System.out.print(matrix[c][d] - matrix2[c][d] + "\t");

}

System.out.println(" ");

}

}

}


    
    



/*Group Members => 

Syed Taha Shah
Feroz Khan
Irtiza Khan
Hassan Memon 
Fabiha Iqbal
Aqsa Shah*/

import java.util.Scanner;
//check 
class pattern22{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int  row = sc.nextInt();

for(int i=0; i<2*row-1;i++){
int a=row, b=row;
for(int col=0;col<2*row;col++){
if(i==0 || i==2*row-1) System.out.print(row);
else if(col<=i || col>=2*row-i-1) System.out.print(temp);
else System.out.print(i);

}


System.out.println();
}


//end
}
}

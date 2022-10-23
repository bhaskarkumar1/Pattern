import java.util.Scanner;
class pattern21{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int row= sc.nextInt();

for(int i=0;i<row;i++){

for(int col=0; col<row;col++){
if(i==0 || i==row-1) System.out.print("*");
else{
if(col==0 || col==row-1) System.out.print("*");
else 
System.out.print(" ");

}
}
System.out.println();
}

}
}

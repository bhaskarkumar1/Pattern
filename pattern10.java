import java.util.Scanner;

class pattern10{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int row =sc.nextInt();
int temp=row;
for(int i=0; i<(2*row)-1;i++){

if(i<row){
for(int col=0;col<row;col++){
if(col<=i) System.out.print("*");
}
}


else if(i>=row){
for(int col=0; col<temp-1;col++){
System.out.print("*");

}
temp--;
}



System.out.println();
}

}

}

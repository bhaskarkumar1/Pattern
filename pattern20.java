import java.util.Scanner;
class pattern20{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int row =sc.nextInt();
//top
for(int i=0; i<row;i++){
for(int col=0; col<2*row;col++){
if(i== row-1) System.out.print("*");
else if(col<=i || col>=2*row-i-1) System.out.print("*");
else System.out.print(" ");
}

System.out.println();
}
//bottom
for(int i=1; i<row;i++){
for(int col=0; col<2*row;col++){
if(col<row-i || col>=row+i) System.out.print("*");
else System.out.print(" ");
}

System.out.println();
}


//end
}
}

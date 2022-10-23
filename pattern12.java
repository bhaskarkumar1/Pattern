import java.util.Scanner;

class pattern12{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int row = sc.nextInt();

for(int i=1; i<=row;i++){
int a=1, b=i;
for(int col=1;col<=(row*2);col++){
if(col<=i) System.out.print(a++);
else if(col>2*row-i) System.out.print(b--);
else if(col>i && col<2*row-i) System.out.print(" ");
//else System.out.print();
}
System.out.println();
}




}


}

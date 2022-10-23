
import java.util.Scanner;

class pattern8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int row= sc.nextInt();

int i=0,temp=row;
while(i<=row){
int col=0;
while(col<(2*row)-i){
if(col>i) System.out.print("*");
else if(col<i) System.out.print(" ");
col++;
}

System.out.println();
i++;
}



}
}

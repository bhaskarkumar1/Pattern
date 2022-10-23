import java.util.Scanner;
class pattern5{
public static void main(String[] args){
Scanner scan= new Scanner(System.in);
int row= scan.nextInt();

int i=0;
while(i<=row){
int col=0,temp=row-i;
while(col<=temp){
System.out.print("*");

col++;

}
System.out.println();
i++;
}




}

}

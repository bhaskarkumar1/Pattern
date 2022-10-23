import java.util.*;

class pattern1{
public static void main(String[] args){
// take number of rows as input
Scanner sc=new Scanner(System.in);
int row= sc.nextInt();
int i=1;
while(i<=row){
	int col=0;
while(col!=i){
System.out.print("*");


col++;
}
System.out.println();
i++;
}
}
}

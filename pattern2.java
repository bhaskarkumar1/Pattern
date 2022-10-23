
import java.util.Scanner;
class pattern2{
public  static void main(String[] args){
//take  input no. of  rows
Scanner input = new Scanner(System.in);
int row= input.nextInt();
int i=1;
while(i<=row){
	int col=0;
	while(col!=row){
	System.out.print("*");
	col++;
}
i++;
System.out.println();
}


}

}


import java.util.Scanner;
class pattern14{
public static void main(String[] args){

Scanner sc= new Scanner(System.in);
int row =sc.nextInt();
String[] s={"A","B","C","D", "E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
int i=0;
while(i<row){
int col=0,a=0;
while(col<=i){
System.out.print(s[a]);
a++;
col++;
}
System.out.println();
i++;
}


}
}

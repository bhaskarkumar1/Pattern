import java.util.Scanner;
class pattern15{
public static void main(String[] args){
String[] s={"A","B","C","D", "E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
Scanner sc=new Scanner(System.in);
int row = sc.nextInt();
int i=0;
while(i<row){
int col=0,a=0;
while(col<row-i){
System.out.print(s[a]);
a++;
col++;
}


System.out.println();
i++;
}


}

}

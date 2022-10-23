import java.util.Scanner;
class pattern18{
public  static void main(String[] args){

String[] s={"A","B","C","D", "E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

Scanner sc=new Scanner(System.in);
int row =sc.nextInt();
int temp= row-1;
for(int i=0;i<row;i++){
for(int col=0;col<=i;col++){
System.out.print(s[temp]);
temp++;
}
System.out.println();
temp=temp-2-i;
}


}

}

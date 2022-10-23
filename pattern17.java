import java.util.Scanner;

class pattern17{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int  row= sc.nextInt();
String[] s={"A","B","C","D", "E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

//int temp=row;
for(int i=0;i<row;i++){
int a=0;
for(int col=0;col<row+i;col++){
if(col<row-i) System.out.print(" ");
else if(col>row-i){
if(col<row){
 System.out.print(s[a]);
a++;
}
else if(col>=row){

System.out.print(s[a]);
a--;
}
}

}

System.out.println();
}



}
}

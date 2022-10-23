import java.util.Scanner;
class pattern4{
public static void main(String[] args){
Scanner input= new Scanner(System.in);
int row= input.nextInt();

int i=1;
while(i<=row){
int col=1;
while(col<=i){
System.out.print(i);
col++;
}
i++;
System.out.println();
}




}

}

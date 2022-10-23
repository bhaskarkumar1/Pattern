import java.util.Scanner;
class  pattern6{
public static void main(String[] args){

Scanner scan=new Scanner(System.in);
int row= scan.nextInt();

int i=0;
while(i<=row){
int col =1, temp=row-i;

while(col<=temp){
System.out.print(col);

col++;
}
System.out.println();
i++;

}


}

}

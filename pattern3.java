import java.util.Scanner;

class pattern3{
public static void  main (String[] args){
Scanner scan=new Scanner(System.in);
int row =scan.nextInt();
int i=1;
while(i<=row){
int col=0;

while(col!=i){
System.out.print(col+1);
col++;
}
i++;
System.out.println();
}

}

}

import java.util.Scanner;
class pattern13{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int row = sc.nextInt();

int i=0,a=1;

while(i<row){
int  col=0;
while(col<=i){
System.out.print(a);
System.out.print(" ");
col++;
a++;
}

System.out.println();
i++;
}


}

}

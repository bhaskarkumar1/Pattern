import java.util.Scanner;
class pattern11{
public static void main(String[] args){
Scanner sc= new Scanner(System.in);
int row = sc.nextInt();

int i=0,a;

while(i<row){
int col=0;
while(col<=i){
if((i+col)%2==0) a=1;
else a=0;
System.out.print(a);
System.out.print(" ");
col++;
}



System.out.println();
i++;
}

}

}

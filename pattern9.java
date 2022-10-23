import java.util.Scanner;
class pattern9{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int row =sc.nextInt();

for(int i=1;i<=row;i++){


for(int col=0; col<row+i;col++){
if(col<row-i) System.out.print(" ");
else if(col>=row-i-1){
System.out.print("*");
System.out.print(" ");
col++;
}
}

System.out.println();
}

// bottom pattern

for(int i=0;i<row;i++){

for(int col=0;col<2*row-i;col++){
if(col<i) System.out.print(" ");
else if(col>=i) {
System.out.print("*");
System.out.print(" ");
col++;
}
}
System.out.println();
}


}

}

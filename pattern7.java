import java.util.Scanner;

class pattern7{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int row=scan.nextInt();

int i=0,temp=row;

while(i<row){
int j=0;
while(j<=(row+i)){
if(j>=temp) System.out.print("*");
else if(j<temp)  System.out.print(" ");
j++;

}
temp--;
i++;
System.out.println();
}

}


}

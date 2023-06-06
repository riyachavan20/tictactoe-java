package tictactoe;
import java.util.*;
class tictactoe1
{
	int location1,location2;
    void getdata()
    {
        System.out.println("enter location 1(row):");
        Scanner sc=new Scanner(System.in);
        location1=sc.nextInt();
        System.out.println("enter location 2(row):");
        //Scanner sc=new Scanner(System.in);
        location2=sc.nextInt();
    }
}

public class tictactoe {
public static void main(String[] args) {
	int[][] a = new int[10][20];
    int flagrr1=0,flagrr2=0,flagrr3=0,flagcc1=0,flagcc2=0,flagcc3=0,ddleft=0,ddright=0,turn=1,flagr1=0,flagr2=0,flagr3=0,flagc1=0,flagc2=0,flagc3=0,dleft=0,dright=0,game=0,game1=0,p,q;
    tictactoe1 ob1=new tictactoe1();
    tictactoe1 ob2=new tictactoe1();
    int i,j;
    String choice1;
    a[3][3]=0;
    a[3][2]=0;
    a[3][1]=0;
    a[1][1]=0;
    a[1][2]=0;
    a[1][3]=0;
    a[2][1]=0;
    a[2][2]=0;
    a[2][3]=0;
    System.out.println("***********************Welcome to online Tic-Tac-Toe player***********************");
    System.out.println("Are you ready to start the game?");
    Scanner sc=new Scanner(System.in);
    choice1=sc.next();
    switch(choice1)
    {
    case "yes":
    System.out.println("player 1: you are alloted with mark 1");
    System.out.println("player 2: you are alloted with mark 2");
    System.out.println("original grid is:");
    for(p=1;p<=3;p++)
                {
                    for(q=1;q<=3;q++)
                    {
                        System.out.print(a[p][q]);
                    }
                    System.out.println("\n");
                }
        while(turn<=9 && game1==0 && game==0)
    {
    
System.out.println("***********************player 1 turn***********************");
    ob1.getdata();
    
     while(a[ob1.location1][ob1.location2]==1 || a[ob1.location1][ob1.location2]==2 ||(ob1.location1<1 || ob1.location1>3) || (ob1.location2<1 || ob1.location2>3))
    {
System.out.println("select another:");
       ob1.getdata();
    }
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=3;j++)
        {
            if((i==ob1.location1) && (j==ob1.location2))
            {
                a[i][j]=1;
                for(p=1;p<=3;p++)
                {
                    for(q=1;q<=3;q++)
                    {
                        System.out.print(a[p][q]);
                    }
                    System.out.println("\n");
                }
                if(i==1||i==2||i==3 ||j==1||j==2||j==3 ||i==j ||(((i==1) &&(j==3)) ||((i==2) && (j==2)) || ((i==3) &&(j==1))))
                {
            if(i==1)
            {
               if(a[i][j]==1)
               {
                   flagr1+=1;
                   flagc1=j;
               }
            }
            else if(i==2)
            {
               if(a[i][j]==1)
               {
                   flagr2+=1;
                   flagc2=j;
               }
            }
            else if(i==3)
            {
               if(a[i][j]==1)
               {
                   flagr3+=1;
                   flagc3=j;
               }
            }
            if(i==j)
            {
               if(a[i][j]==1)
               {
                   dleft+=1;
               }
            }
            if (((i==1) &&(j==3)) ||((i==2) && (j==2)) || ((i==3) &&(j==1)))
            {
                if(a[i][j]==1)
                dright+=1;
            }
            }
        }


        }
        System.out.println("\n");
    }
    if((flagc1==flagc2) && (flagc2==flagc3) && (flagc1==flagc3))
            {
                System.out.println("*********************** player 1 wins ***********************");
                 game=1;
            }
    else if(flagr1==3 ||flagr2==3 || flagr3==3 || dleft==3 || dright==3)
            {
    	System.out.println("*********************** player 1 wins ***********************");
                 game=1;
            }
    else if(turn==9)
     {
System.out.println("*********************** tie ***********************");
        break;
     }
    turn+=1;
    if(turn<=8 && game==0 && game1==0)
    {
    System.out.println("***********************player 2 turn***********************");
    ob2.getdata();
    while(a[ob2.location1][ob2.location2]==1 || a[ob2.location1][ob2.location2]==2 ||(ob2.location1<1 || ob2.location1>3) || (ob2.location2<1 || ob2.location2>3))
    {
       System.out.println("select another:");
       ob2.getdata();
    }
    for(i=1;i<=3;i++)
    {
        for(j=1;j<=3;j++)
        {

            if((i==ob2.location1) && (j==ob2.location2))
            {
                a[i][j]=2;
                for(p=1;p<=3;p++)
                {
                    for(q=1;q<=3;q++)
                    {
                        System.out.print(a[p][q]);
                    }
                    System.out.println("\n");
                }
                if(i==1||i==2||i==3 ||j==1||j==2||j==3 ||i==j ||(((i==1) &&(j==3)) ||((i==2) && (j==2)) || ((i==3) &&(j==1))))
                {
            if(i==1)
            {
               if(a[i][j]==2)
               {
                   flagrr1+=1;
                   flagcc1=j;
               }
            }
            else if(i==2)
            {
               if(a[i][j]==2)
               {
                   flagrr2+=1;
                   flagcc2=j;
               }
            }
            else if(i==3)
            {
               if(a[i][j]==2)
               {
                   flagrr3+=1;
                   flagcc3=j;
               }
            }
            if(i==j)
            {
               if(a[i][j]==2)
               {
                   ddleft+=1;
               }
            }
            if (((i==1) &&(j==3)) ||((i==2) && (j==2)) || ((i==3) &&(j==1)))
            {
                if(a[i][j]==2){
                   ddright+=1;}
            }
            }
            }

        }
System.out.println("\n");
    }
    if((flagcc1==flagcc2) && (flagcc2==flagcc3) && (flagcc1==flagcc3))
            {
                System.out.println("*********************** player 2 wins ***********************");
                 game1=1;
            }
    else if(flagrr1==3 ||flagrr2==3 || flagrr3==3 || ddleft==3 || ddright==3)
            {
    	System.out.println("*********************** player 2 wins ***********************");
                 game1=1;
            }
    turn+=1;
    }
    }
    break;
    case "no":
System.out.println("Thank you!!! Have a good day");
    }

}
}

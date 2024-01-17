import java.util.Scanner;
class account
{
String name;
int accno;
String type;
double balance;

account(String name,int accno,String type,double balance)
{
this.name=name;
this.accno=accno;
this.type=type;
this.balance=balance;
}
void deposit(double amount)
{
balance+=amount;
}
void withdraw(double amount)
{
if((balance-amount)>=0)
{
balance-=amount;
}
else
{
System.out.println("insufficient balance,cant withdraw");
}
}

void display()
{
System.out.println("name:"+name+"accno:"+accno+"type:"+type+"balance:"+balance);
}
}
class savAcct extends account
{

private static double rate=5;
savAcct(String name,int accno,double balance)
{
super(name,accno,"savings",balance);

}

void interest()
{
balance+=balance*(rate)/100;
System.out.println("balance:"+balance);
}


}
class curAcct extends account
{

private double minBal=500;
private double serviceCharges=50;

curAcct(String name,int accno,double balance)
{
super(name,accno,"current",balance);

}


void checkmin()
{

if(balance<minBal)
{
System.out.println("balance is less than min balance,service charges imposed:"+serviceCharges);
balance-=serviceCharges;
System.out.println("balance is:"+balance);
}

}

}
class accountMain
{
public static void main(String a[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the name :");
String name=s.next();
System.out.println("enter the type(current/savings):");
String type=s.next();
System.out.println("enter the account number:");
int accno=s.nextInt();
System.out.println("enter the intial balance:");
double balance=s.nextDouble();
int ch;
double amount1,amount2;
account acc=new account(name,accno,type,balance);
savAcct sa=new savAcct(name,accno,balance);
curAcct ca=new curAcct(name,accno,balance);
while(true)
{
if(acc.type.equals("savings"))
{
System.out.println("\nMenu\n1.deposit 2.withdraw 3.compute interest 4.display");
System.out.println("enter the choice:");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.println("enter the amount:");
amount1=s.nextInt();
sa.deposit(amount1);
break;
case 2:System.out.println("enter the amount:");
amount2=s.nextInt();
sa.withdraw(amount2);
break;
case 3:sa.interest();
break;
case 4:sa.display();
break;
case 5:System.exit(0);
default:System.out.println("invalid input");
break;
}
}
else
{
System.out.println("\nMenu\n1.deposit 2.withdraw  3.display");
System.out.println("enter the choice:");
ch=s.nextInt();
switch(ch)
{
case 1:System.out.println("enter the amount:");
amount1=s.nextInt();
ca.deposit(amount1);
break;
case 2:System.out.println("enter the amount:");
amount2=s.nextInt();
ca.withdraw(amount2);
ca.checkmin();
break;

case 3:ca.display();
break;
case 4:System.exit(0);
default:System.out.println("invalid input");
break;
}
}
}






}
}


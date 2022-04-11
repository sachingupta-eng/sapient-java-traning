class Bank
{ private double bal, rate;
Bank (double b, double r)
{ bal=b;
rate = r;
}
void display ( )
{ Interest in=new Interest ();
in.calculateInterest ( );
System.out.println ("New Balance : " + bal);
}
private class Interest
{ void calculateInterest ( )
{ System.out.println ("Balance = "+ bal);
double interest=bal* rate/100;
System.out.println ("interest = "+interest);
bal+=interest;
}
}
}
class InnerDemo
{ public static void main (String args[])
{ Bank account = new Bank (20000, 5);
account.display ();
}
}
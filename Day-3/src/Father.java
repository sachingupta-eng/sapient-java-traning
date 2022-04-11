interface Father
{ double PROPERTY = 10000;
double HEIGHT = 5.6;
}
interface Mother
{ double PROPERTY = 30000;
double HEIGHT = 5.4;
}
class MyClass implements Father, Mother
{ void show()
{ System.out.println("Total property is :" +(Father.PROPERTY+Mother.PROPERTY));
 System.out.println ("Average height is :" + (Father.HEIGHT + Mother.HEIGHT)/2 );
}
}
class InterfaceDemo
{ public static void main(String args[])
{ MyClass ob1 = new MyClass();
ob1.show();
}
}
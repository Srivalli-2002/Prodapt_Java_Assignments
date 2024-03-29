package march29.corejava.assignment;

public class Question1Test

{

public static void main(String[] args)

{

Question1 instanceA = new Question1();

Question1 instanceB = new Question1();

instanceA.a = 8;

instanceB.b = instanceA.x;

instanceA.x++;

instanceB.a = 10;

instanceB.c = 90;

instanceB.x++;

System.out.println("instanceA");
System.out.println(instanceA.a);
System.out.println(instanceA.b);
System.out.println(instanceA.c);
System.out.println(instanceA.x);

System.out.println("");

System.out.println("instanceB");
System.out.println(instanceB.a);
System.out.println(instanceB.b);
System.out.println(instanceB.c);
System.out.println(instanceB.x);
}

}
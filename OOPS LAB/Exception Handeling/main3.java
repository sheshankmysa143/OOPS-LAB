public class main3{
public static void main(String[] args){
try{
ageLimit(11);
}
catch(IllegalArgumentException e){
System.out.println("Caught Error "+e);
}

}
public static void ageLimit(int age){
if (age<18){
throw new IllegalArgumentException("Not elligible to vote");
}
System.out.println("Successfully accessed");
}
}
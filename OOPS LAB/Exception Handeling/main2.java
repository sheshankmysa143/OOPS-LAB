class ageLimitException extends Exception{
ageLimitException(String message){
super(message);
}}
public class main2{
public static void main(String[] args){
try{
ageLimit(17);
}
catch(ageLimitException e){
System.out.println("Caught error "+e);
}
}
public static void ageLimit(int age) throws ageLimitException{
if (age<18){
throw new ageLimitException("Age must me above 18 ");
}
}
}
public class Palindrome{
public static void main(String args[]){
  int n=1221;
   int num=n;
  int reverse=0;
   int remainder;
while(n>0){
    remainder= n%10;
    reverse=(reverse*10)+remainder;
    n=n/10;
}
if(num==reverse){
System.out.println(num + "is a palindrome number");
}
else{
System.out.println(num + "is not a plaindrome number");
}
}
}

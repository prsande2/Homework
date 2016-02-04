package prsande2;

public class BeerSong{

public static void main (String[] args) {
int Num = 99;
String word = "bottles";
  
while (Num > 0) {
 
if (Num == 1) {
word = "bottle";  // singular, as in ONE bottle.
}
  
System.out.println(Num + " " + word + " of beer on the wall");
System.out.println(Num + " " + word + " of beer.");
System.out.println("Take one down.");
System.out.println("Pass it around.");
Num = Num - 1;
  
if (Num > 0) {
System.out.println(Num + " " + word + " of beer on the wall");
} else {
System.out.println("No more bottles of beer on the wall");
}  
} 
}  
}  
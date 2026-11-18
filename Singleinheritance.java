class Room{
int length;
int breadth;

Room(int length,int breadth){
this.length=length;
this.breadth=breadth;
}

int calculateArea(){
return length*breadth;
}
}

class Bedroom extends Room{
int height;

Bedroom(int length,int breadth,int height){
super(length,breadth);
this.height=height;
}

int calculateVolume(){
return length*breadth*height;
}
 
void displayBedroomDetails(){
System.out.println("Bedroom area:"+ calculateArea() +"square units");
System.out.println("Bedroom volume:"+ calculateVolume() +"cubic units");
}
}

public class Singleinheritance{
public static void main(String [] Args){

Bedroom myBedroom = new Bedroom(16,13,12);

myBedroom.displayBedroomDetails();
}
}

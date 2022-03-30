
package chapter10_04;

public class MyPoint {
 
    double x;
    double y;                    //stores the double x, y 
    
    MyPoint(){              // default constructor, x/y will default to 0 if no value is added
        
    }
    
     MyPoint(double x, double y){       //set a specific value to x and y
        this.x = x;
        this.y = y;
    }
    
     double distance(MyPoint secondPoint){                                  //value of distance with secon point
         return distance(this, secondPoint);
     }
     
     public static double distance(MyPoint p1, MyPoint p2){                                 //equation for distance between two points
        return Math.sqrt((p1.x -p2.x) * (p1.x -p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
     }
     
    double getX(){
        return x;               //getter method for x
    }
    
    double getY(){                  //getter method for y
        return y;
    }
}

/*
Chapter 10 Programming excercise 04
Riky Hernandez
10/04/21
Description: Design a class named MyPoint, Creating a program that dysplays the 
                distance of two points (0,0) & (10,30.5)
      ____
     /___/\_                               
    _\   \/_/\__                          
  __\       \/_/\                       
  \   __    __ \ \                    
 __\  \_\   \_\ \ \   __               
/_/\\   __   __  \ \_/_/\           
\_\/_\__\/\__\/\__\/_\_\/         
   \_\/_/\       /_\_\/             
      \_\/       \_\/
*/
package chapter10_04;


public class Chapter10_04 {

    
    public static void main(String[] args) {
       
     MyPoint p1 = new MyPoint(0, 0);                     //making specific point values
     MyPoint p2 = new MyPoint(10, 30.5);
     
     
     
     
     System.out.println(p1.distance(p2));                       //printing the calculation of distance of the points 
     System.out.println(MyPoint.distance(p1, p2));                      //using the static function to also print the distance of the points
     
    }
    
}

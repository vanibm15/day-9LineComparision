package com.bridgelabz.oops;

public class LineComp {
     void method1(){
         int x1, y1 ,x2, y2;
         double lenghtofpoints;
         x1=1;y1=1;x2=4;y2=4;
         lenghtofpoints=Math.sqrt((x2-x1)*(y2-y1));
         System.out.println("length of line:"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==>"+lenghtofpoints);
         lenghtofpoints=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
         System.out.println("length of line:"+lenghtofpoints);
     }
     public static void main(String[] args) {
         LineComp obj1=new LineComp();
         obj1.method1();
    }
}

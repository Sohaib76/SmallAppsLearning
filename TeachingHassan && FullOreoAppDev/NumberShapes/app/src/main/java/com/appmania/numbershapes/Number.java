package com.appmania.numbershapes;

public class Number {

    int number ;

    public boolean isSquare(){

        double squareroot = Math.sqrt(number);

        if (squareroot == Math.floor(squareroot)){

            return true ;

        }

        else{
            return false;

        }

    }








    public boolean isTriangular(){

        int x=1;
        int triangularNumber = 1 ;
        while(triangularNumber<number) {

            x++;
            triangularNumber=triangularNumber+x;



        }
        if(triangularNumber==number){
            return true;

        }else{
            return false;

        }







    }

}

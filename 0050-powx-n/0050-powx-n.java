class Solution {
    public double myPow(double x, int y) {
//         if(n==0)
//             return 1;
//         else{
//             if(n<0){
//                 n = -n;
//                 x = 1 /(x);
//                 return 1/x * myPow(1/x, -(n + 1));
//             }
//         //     if(n%2==0)
//         //         return myPow(x*x,n/2);
//         //     else
//         //         return x*myPow(x,n-1);
//         // }
//         }
        
//         // if(n == 0)
//         //     return 1;
//         // if(n<0){
//         //     n = -n;
//         //     x = 1/x;
//         // }
//          return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
        
        double temp;
        if( y == 0)
            return 1;
        temp = myPow(x, y/2); 
          
        if (y%2 == 0)
            return temp*temp;
        else
        {
            if(y > 0)
                return x * temp * temp;
            else
                return (temp * temp) / x;
        }
        
    }
}
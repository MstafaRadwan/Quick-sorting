/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quich.sort;

/**
 *
 * @author Mostafa
 */
public class QuichSort {

    /**
     * @param args the command line arguments
     */
    
    public static void s( int [] arr , int start , int end )
    {
        if ( start < end )
        {
            int x = back( arr , start , end ) ;
            s( arr , start , x - 1 );
            s( arr , x + 1 , end );
        }
        
    }
    public static int back( int [] arr , int start , int end)
    {
        int p = arr [ end ] ;
        int b = start ;
        for ( int i = start ; i < end ; ++i )
        {
            if ( arr[i] <= p  )
            {
                int g = arr[b];
                arr[b] = arr[i];
                arr[i] = g;
                ++b;
            }
        }
        arr[end] = arr[b];
        arr[b] = p ;
        return b;
    }
    public static void sort ( int [] arr )
    {
        s( arr , 0 , arr.length - 1 );
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] x = {4 , 6 , 0 , 1 , 5 , 3 , 1 , 8};
        sort(x); 
        for ( int i = 0 ; i < x.length ; ++ i )
            System.out.print(  x[i] + " ");
    }
    
}

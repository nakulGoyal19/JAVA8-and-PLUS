package coding.questions.gfg;

import java.util.Scanner;

/**
 * @author nakulgoyal
 *         02/09/20
 **/


//  Input :     int[] a = { 4, 1, 2, 3, 1, 5 ,1, 3, 4 };
//              int x = 3
//  Output :    8  ( {1,2,3,1}, {1,2,3}, {2,3,1}, {2,3}, {3}, {3,1}, {1,3}, {3} )
public class CountNumberOfSubArraysInWhich_X_IsMax {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, x;
        int i, j, bp = 0, c = 0;
        n = sc.nextInt();
        int[] a = new int[n];
        for (i=0;i<n;i++)
            a[i] = sc.nextInt();
        x = sc.nextInt();
        i = 0;
        j = 0;
        while (i < a.length) {
            if (a[i] > x) {
                i++;
                j++;
                bp = i-1;
                continue;
            }
            if(a[j] <= x) {
                j++;
                if(a[j] == x) {
                    bp = j;
                }
            } else {
                if (bp >= i && bp <= j)
                    c += (j-bp)*(bp-i+1);
                i = j;
            }
        }
        System.out.println(c);
    }

}



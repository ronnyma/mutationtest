package no.transfinite;

/**
 * Created by ronnyma on 05/02/2017.
 */
public class Calculate {

    public int add(int n, int m){

        return n + m;
    }

    public int subtract(int n, int m){

        return n - m;
    }


    public int min(int n, int m){

        return n > m ? m : n;
    }

    /** Pointless method, I know.
     * @param a - an integer
     * @param b - an integer
     * @return true if a is greater than b
     */
    public boolean aIsGreaterThanB(int a, int b) {
        if(a > b)
            return true;
        else
            return false;
    }
    private int identity;
}


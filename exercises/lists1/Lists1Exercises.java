public class Lists1Exercises {
    /** Returns an IntList identical to L, but with
      * each element incremented by x. L is not allowed
      * to change. */
    public static IntList incrList(IntList L, int x) {
        IntList p = new IntList(L.first+x, null);

        if (L.rest == null) {
        	p.rest = null;
        } else {
        	p.rest = incrList(L.rest,x);
        }
        
        return p;        
    }

    /** Returns an IntList identical to L, but with
      * each element incremented by x. Not allowed to use
      * the 'new' keyword. */
    public static IntList dincrList(IntList L, int x) {
        L.first += x;

        if (L.rest != null) {
        	L.rest = incrList(L.rest,x);
        }
        
        return L;   
    }

    public static void main(String[] args) {
        IntList L = new IntList(5, null);
        L.rest = new IntList(7, null);
        L.rest.rest = new IntList(9, null);

        //System.out.println(L.size());
        //System.out.println(L.iterativeSize());

        // Test your answers by uncommenting. Or copy and paste the
        // code for incrList and dincrList into IntList.java and
        // run it in the visualizer.
        System.out.println(L.get(1));
        System.out.println(incrList(L, 3).get(1));
        System.out.println(L.get(1));
        System.out.println(dincrList(L, 3).get(1));
        System.out.println(L.get(1));        
    }
}
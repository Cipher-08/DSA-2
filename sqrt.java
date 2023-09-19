public class sqaure {

    public static void main(String[] args) {
        System.out.println(perfect_sqaure(189, 3));
    }

    static double perfect_sqaure(int n,int p){
        int start =1;
        int end =n;
        double root =0.0;
        while(start<=end){
            int mid = start+ (end - start   )/2;
            if(mid*mid==n)return mid;
            if(mid*mid > n){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        ///for no perfect square

         double incr =0.1;
        for(int i=0;i<p;i++){
            while(root*root<=n){
                root+=incr;
            }
            root-=incr;
            incr/=10;
        }
      return root;

    }
}

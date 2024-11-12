public class Range {

    public void range(int start,int end,int diff){

       for(int i=start;i<=end-diff;i++){
               System.out.println(i+" "+(i+diff));

           }

       }
    public static void main(String[] args) {

        Range r = new Range();
        r.range(1,10,3);

    }
}



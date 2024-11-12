package OOPS.Q9;

public class Average {

    public float avg(float a, float b, float c, float d){
        float r = (a+b+c+d)/4;
        return r;
    }

    public static void main(String[] args) {
        Average av = new Average();
        System.out.println("Average of four numbers: "+av.avg(3,4,5,6));

    }
}

public class DivisionBy3And5 {


    //main method
    public static void main(String[] args) {
        int i=1;
        //using while method
        while (i<=100){
            if(i%3==0){
                System.out.println("The Number which can divide By 3 is:" +"\t"+i);
            }
            i++;
        }
        System.out.println("***************");
        int j=1;
        while (j<=100){
            if(j%5==0){
                System.out.println("The Number which can divide By 5 is:" +"\t"+j);
            }
            j++;
        }
    }
}

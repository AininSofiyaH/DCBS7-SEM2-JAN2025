public class CHAPTER4_TASK2_NURAZREEN {
    public static void main(String[] args) {
        // for loop 
        int sum_For = 0;
        for (int L = 1; L <=10; L++){
            sum_For+=L ;
        }
        System.out.println("Sum using for loop: " +sum_For);
// while loop

int sum_While = 0;
    int W=1;
    while (W <= 10){
    sum_While+=W ;
    W++;
}
System.out.println("Sum using for while: "+sum_While);

// do-while loop 

int sum_Do_While = 0;
int D = 1;
do {sum_Do_While +=D;
D++;
} while(D<=10);
System.out.println("Sum using for do while :"+sum_Do_While);
    }}

package lang.print.gaps.task5;

import java.util.Scanner;

public class NumberDivider {
    void divide(int toBeDivided) {
        float division;
        division=(float) (toBeDivided/5);
        System.out.println(division);
    }
    public void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a;
        a= input.nextInt();
        divide(a);
    }
}

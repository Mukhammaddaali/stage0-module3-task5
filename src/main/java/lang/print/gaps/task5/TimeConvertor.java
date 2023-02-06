package lang.print.gaps.task5;

import java.util.Scanner;

public class TimeConvertor {
    public void convert(float minutes) {
        float second;
        second =  (minutes*60);
        System.out.println(second);
    }
    public void main(String[] args){
        Scanner input=new Scanner(System.in);
        int a;
        a= input.nextInt();
        convert(a);
}}

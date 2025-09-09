package com.practiceQuestions.main;
import java.util.*;

public class wordle {



        public static void main (String[] args) throws java.lang.Exception
        {
            Scanner sc = new Scanner(System.in);
            int t=sc.nextInt();
            for(int j=0;j<t;j++){
                String S=sc.next();
                String T=sc.next();
                StringBuilder M=new StringBuilder("");
                //System.out.println(S+" "+T);
                for(int i=0;i<5;i++){
                    if(S.charAt(i)==T.charAt(i)){
                        M=M.append("G");
                    }else{
                        M=M.append("B");
                    }
                }
                System.out.println(M);

            }

        }


}

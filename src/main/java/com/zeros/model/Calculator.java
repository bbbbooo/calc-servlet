package com.zeros.model;

public class Calculator {
    public int Calc(int fnumber, int lnumber, String oper) {
        if ("+".equals(oper)){
            return fnumber+lnumber;
        }

        else if("-".equals(oper)){
            return fnumber-lnumber;
        }

        else if("*".equals(oper)){
            return fnumber*lnumber;
        }

        else if ("/".equals(oper)) {
            if (lnumber == 0) {
                throw new IllegalArgumentException("0으로는 나눌 수 없습니다.");
            }
            return fnumber / lnumber;
        }

        else{
            if (lnumber==0){
                throw new IllegalArgumentException();
            }
            return fnumber % lnumber;
        }
    }
}

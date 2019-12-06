package calc.service;

import calc.Calc;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class CalcService {

    private HashMap<Integer,String> regist;

    public String calcul(String n1, String n2, String op) {
        String result = Calc.calc(n1, n2, op);
        regist.put(regist.size()+1,result);
        return result;
    }

    public HashMap<Integer, String> results(){
        return regist;
    }


}

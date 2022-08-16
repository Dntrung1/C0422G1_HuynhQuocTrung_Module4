package com.codegym.service.impl;

import com.codegym.service.ICalculatorService;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService implements ICalculatorService {

    @Override
    public String result(String num1, String num2, String operand) {
        String result = "";
        if (num1.equals("") || num2.equals("")) {
            result += "Không được để trống.";
        } else {
            double number1 = Double.parseDouble(num1);
            double number2 = Double.parseDouble(num2);
            switch (operand) {
                case "addition":
                    result += (number1 + number2);
                    break;
                case "subtraction":
                    result += (number1 - number2);
                    break;
                case "multiplication":
                    result += (number1 * number2);
                    break;
                case "division":
                    if (Double.parseDouble(num2) == 0) {
                        result += "Không đươc chia cho 0.";
                    } else {
                        result += (number1 / number2);
                    }
                    break;
            }
        }
        return result;
    }
}

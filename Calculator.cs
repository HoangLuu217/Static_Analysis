// Calculator.cs
using System;

public class Calculator {
    public int Sum(int[] numbers) {
        if (numbers == null) return 0;
        int sum = 0;
        for (int i = 0; i < numbers.Length; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}

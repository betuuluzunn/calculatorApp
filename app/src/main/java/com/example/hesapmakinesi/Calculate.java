package com.example.hesapmakinesi;

public class Calculate {
      private int first,sec;

    public Calculate(int first, int sec) {
        this.first = first;
        this.sec = sec;
    }
    public int add() {
        return first + sec;
    }
    public int sub() {
        return first - sec;
    }
    public int multiply() {
        return first * sec;
    }
    public int divide() {
        return first / sec;
    }
}


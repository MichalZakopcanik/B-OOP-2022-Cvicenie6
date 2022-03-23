package sk.stuba.fei.uim.oop;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.JUH;

        for (SvetoveStrany s : SvetoveStrany.values()) {
            checkSever(s);
        }

        checkSever(SvetoveStrany.valueOf("SEVER"));
        checkSever(strana);
        checkSever(SvetoveStrany.valueOf("sever"));

    }
        public static void checkSever(SvetoveStrany s){
            if (s.equals(SvetoveStrany.SEVER)) {
                System.out.println("Je sever");
            } else {
                System.out.println("Nie je sever");
            }
        }
    }


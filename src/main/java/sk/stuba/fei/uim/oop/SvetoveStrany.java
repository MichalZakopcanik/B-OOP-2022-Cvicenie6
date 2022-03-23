package sk.stuba.fei.uim.oop;

import java.util.Locale;

public enum SvetoveStrany {
    SEVER,
    JUH,
    VYCHOD,
    ZAPAD;




    public static SvetoveStrany fromString(String s){
        return SvetoveStrany.valueOf(s.toUpperCase(Locale.ROOT));
    }
}

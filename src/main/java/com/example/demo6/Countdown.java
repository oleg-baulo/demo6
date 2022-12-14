package com.example.demo6;
import javafx.scene.text.Text;

import java.util.*;

public class Countdown {

    public void CDTNY(Text cd) {
            int SECONDS_IN_A_DAY = 24 * 60 * 60;
            Calendar thatDay = Calendar.getInstance();
            thatDay.setTime(new Date(0));
            thatDay.set(Calendar.DAY_OF_MONTH, 1);
            thatDay.set(Calendar.MONTH, 0);
            thatDay.set(Calendar.YEAR, 2023);

            Calendar today = Calendar.getInstance();
            long diff = thatDay.getTimeInMillis() - today.getTimeInMillis();
            long diffSec = diff / 1000;

            long days = diffSec / SECONDS_IN_A_DAY;
            long secondsDay = diffSec % SECONDS_IN_A_DAY;
            long seconds = secondsDay % 60;
            long minutes = (secondsDay / 60) % 60;
            long hours = (secondsDay / 3600);

            cd.setText("Next year in: days: " + days + " hours: " + hours );
    }
}

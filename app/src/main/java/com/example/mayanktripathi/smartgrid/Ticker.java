package com.example.mayanktripathi.smartgrid;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class Ticker extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ticker);

        TickerView ticker = (TickerView) findViewById(R.id.tickerView);

        ticker.setCharacterList(TickerUtils.getDefaultNumberList());


            ticker.setText("15445");
            ticker.setText("234442");
            ticker.setText("42345");
        ticker.setText("13134");


    }
}

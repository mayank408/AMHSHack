package com.example.mayanktripathi.smartgrid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;

public class suggestions extends AppCompatActivity {
TickerView ticker1 ,ticker2,ticker3,ticker4,ticker5,ticker6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);
        ticker1 = (TickerView) findViewById(R.id.tickerView);
        ticker1.setCharacterList(TickerUtils.getDefaultNumberList());
        ticker2 = (TickerView) findViewById(R.id.tickerView1);
        ticker2.setCharacterList(TickerUtils.getDefaultNumberList());
        ticker3 = (TickerView) findViewById(R.id.tickerView2);
        ticker3.setCharacterList(TickerUtils.getDefaultNumberList());
        ticker4 = (TickerView) findViewById(R.id.tickerView3);
        ticker4.setCharacterList(TickerUtils.getDefaultNumberList());
        ticker5 = (TickerView) findViewById(R.id.tickerView4);
        ticker5.setCharacterList(TickerUtils.getDefaultNumberList());
        ticker6 = (TickerView) findViewById(R.id.tickerView5);
        ticker6.setCharacterList(TickerUtils.getDefaultNumberList());
        ticker1.setText("₹1800");
        ticker1.setText("₹1750");
        ticker2.setText("₹1800");
        ticker2.setText("₹1750");
        ticker3.setText("₹1800");
        ticker3.setText("₹1750");
        ticker4.setText("₹1800");
        ticker4.setText("₹1680");
        ticker5.setText("₹1800");
        ticker5.setText("₹1650");
        ticker6.setText("₹1800");
        ticker6.setText("₹1750");
    }
}

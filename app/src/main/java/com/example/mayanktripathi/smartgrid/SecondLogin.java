package com.example.mayanktripathi.smartgrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.nightonke.boommenu.BoomButtons.ButtonPlaceEnum;
import com.nightonke.boommenu.BoomButtons.OnBMClickListener;
import com.nightonke.boommenu.BoomButtons.SimpleCircleButton;
import com.nightonke.boommenu.BoomMenuButton;
import com.nightonke.boommenu.ButtonEnum;
import com.nightonke.boommenu.Piece.PiecePlaceEnum;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class SecondLogin  extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_login);
        BoomMenuButton bmb = (BoomMenuButton) findViewById(R.id.bmb);
        bmb.setButtonEnum(ButtonEnum.SimpleCircle);
        bmb.setButtonPlaceEnum(ButtonPlaceEnum.SC_3_1);
        bmb.setPiecePlaceEnum(PiecePlaceEnum.DOT_3_1);
       /* TextInsideCircleButton.Builder builder = new TextInsideCircleButton.Builder().normalImageRes(R.drawable.piechart).normalText("PieChart");
        bmb.addBuilder(builder);
        builder = new TextInsideCircleButton.Builder().normalImageRes(R.drawable.linegraph).normalText("LineGraph");
        bmb.addBuilder(builder);*/

        SimpleCircleButton.Builder builder = new SimpleCircleButton.Builder()
                .normalImageRes(R.drawable.linegraph).listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Intent i = new Intent(SecondLogin.this,LineGraph.class);
                        startActivity(i);

                    }
                });
        bmb.addBuilder(builder);

        SimpleCircleButton.Builder builder2 = new SimpleCircleButton.Builder()
                .normalImageRes(R.drawable.piechart).listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Intent i = new Intent(SecondLogin.this,pie_energy.class);
                        startActivity(i);
                    }
                });
        bmb.addBuilder(builder2);

        SimpleCircleButton.Builder builder3 = new SimpleCircleButton.Builder()
                .normalImageRes(R.drawable.piechart).listener(new OnBMClickListener() {
                    @Override
                    public void onBoomButtonClick(int index) {
                        Intent i = new Intent(SecondLogin.this,UserCounter.class);
                        startActivity(i);
                    }
                });
        bmb.addBuilder(builder3);


    }

}

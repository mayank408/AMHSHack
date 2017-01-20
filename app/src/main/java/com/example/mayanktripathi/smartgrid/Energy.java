package com.example.mayanktripathi.smartgrid;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Toast;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class Energy extends AppCompatActivity {

    CardView cd1;
    CardView cd2;
    CardView cd3;


    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy);

        cd1 = (CardView)findViewById(R.id.card_view);
        cd2 = (CardView)findViewById(R.id.card_view2);
        cd3 = (CardView)findViewById(R.id.card_view3);


        GraphView graph = (GraphView) findViewById(R.id.graph);
        final LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3)
        });
        series.setColor(Color.BLACK);
        graph.addSeries(series);

        final LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 3),
                new DataPoint(2, 1.5)
        });
        series2.setColor(Color.BLACK);
        graph.addSeries(series2);

        final LineGraphSeries<DataPoint> series3 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0.5),
                new DataPoint(1, 2),
                new DataPoint(2, 1.25)
        });
        series3.setColor(Color.BLACK);
        graph.addSeries(series3);

        final LineGraphSeries<DataPoint> series4 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0.24),
                new DataPoint(1, 1.2),
                new DataPoint(2, 2)
        });
        series4.setColor(Color.BLACK);
        graph.addSeries(series4);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                series2.setColor(Color.BLUE);
                series.setThickness(10);
                Toast.makeText(Energy.this, "one", Toast.LENGTH_SHORT).show();
            }
        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                series3.setColor(Color.BLUE);
                series.setThickness(10);
                Toast.makeText(Energy.this, "two", Toast.LENGTH_SHORT).show();
            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                series4.setColor(Color.BLUE);
                series.setThickness(10);
                Toast.makeText(Energy.this, "three", Toast.LENGTH_SHORT).show();
            }
        });
    }
}

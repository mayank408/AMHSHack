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
import com.jjoe64.graphview.series.DataPointInterface;
import com.jjoe64.graphview.series.LineGraphSeries;
import com.jjoe64.graphview.series.OnDataPointTapListener;
import com.jjoe64.graphview.series.Series;

import java.util.ArrayList;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class Energy extends AppCompatActivity {

    CardView cd1;
    CardView cd2;
    CardView cd3;
    GraphView graph;

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy);

        cd1 = (CardView)findViewById(R.id.card_view);
        cd2 = (CardView)findViewById(R.id.card_view2);
        cd3 = (CardView)findViewById(R.id.card_view3);


        graph = (GraphView) findViewById(R.id.graph);
        final LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(1,     0.52680),
                new DataPoint(2,     0.50855),
                new DataPoint(3,     0.52579),
                new DataPoint(4,     0.46016),
                new DataPoint(5,     0.45345),
                new DataPoint(6,     0.46752),
                new DataPoint(7,     0.51098),
                new DataPoint(8,     0.53154),
                new DataPoint(9,     0.54065),
                new DataPoint(10,    0.58648),
                new DataPoint(11,    0.51145),
                new DataPoint(12,    0.48025),
                new DataPoint(13,    0.44182),
                new DataPoint(14,    0.50585),
                new DataPoint(15,    0.49434),
                new DataPoint(16,    0.42219),
                new DataPoint(17,    0.43318),
                new DataPoint(18,    0.54184),
                new DataPoint(19,    0.51821),
                new DataPoint(20,    0.61726),
                new DataPoint(21,    0.47144),
                new DataPoint(22,    0.47264),
                new DataPoint(23,    0.47776),
                new DataPoint(24,    0.47007),


        });

        // set manual X bounds
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-150);
        graph.getViewport().setMaxY(150);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(4);
        graph.getViewport().setMaxX(80);

        // enable scaling and scrolling
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);

        series.setColor(Color.BLACK);

        graph.addSeries(series);

        series.setOnDataPointTapListener(new OnDataPointTapListener() {
            @Override
            public void onTap(Series series, DataPointInterface dataPoint) {
                Toast.makeText(Energy.this, "Point taped", Toast.LENGTH_SHORT).show();
                cd1.setVisibility(View.VISIBLE);
            }
        });

        final LineGraphSeries<DataPoint> series2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 1),
                new DataPoint(1, 3),
                new DataPoint(2, 1.5)
        });
        series2.setColor(Color.BLACK);
        //graph.addSeries(series2);

        final LineGraphSeries<DataPoint> series3 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0.5),
                new DataPoint(1, 2),
                new DataPoint(2, 1.25)
        });
        series3.setColor(Color.BLACK);
        //graph.addSeries(series3);

        final LineGraphSeries<DataPoint> series4 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(0, 0.24),
                new DataPoint(1, 1.2),
                new DataPoint(2, 2)
        });
        series4.setColor(Color.BLACK);
        //graph.addSeries(series4);


        cd1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                series2.setColor(Color.BLUE);
                series2.setThickness(10);
                graph.addSeries(series2);
                series3.setColor(Color.BLACK);
                series3.setThickness(5);
                graph.addSeries(series3);
                series4.setColor(Color.BLACK);
                series4.setThickness(5);
                graph.addSeries(series4);
                Toast.makeText(Energy.this, "one", Toast.LENGTH_SHORT).show();

            }

        });

        cd2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                series3.setColor(Color.BLUE);
                series3.setThickness(10);
                graph.addSeries(series3);
                series2.setColor(Color.BLACK);
                series2.setThickness(5);
                graph.addSeries(series2);
                series4.setColor(Color.BLACK);
                series4.setThickness(5);
                graph.addSeries(series4);
                Toast.makeText(Energy.this, "two", Toast.LENGTH_SHORT).show();

            }
        });

        cd3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                series4.setColor(Color.BLUE);
                series4.setThickness(10);
                graph.addSeries(series4);
                series2.setColor(Color.BLACK);
                series2.setThickness(5);
                graph.addSeries(series2);
                series3.setColor(Color.BLACK);
                series3.setThickness(5);
                graph.addSeries(series3);
                Toast.makeText(Energy.this, "three", Toast.LENGTH_SHORT).show();
            }
        });
    }




}

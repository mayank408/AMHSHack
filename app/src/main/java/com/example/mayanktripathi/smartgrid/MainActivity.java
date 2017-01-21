package com.example.mayanktripathi.smartgrid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.github.mikephil.charting.charts.PieChart;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    ImageView img;
    Button energy , pie_energy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        energy = (Button)findViewById(R.id.energy);
        pie_energy = (Button)findViewById(R.id.energy_pie);


        GraphView graph = (GraphView) findViewById(R.id.graph);
        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
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

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setMinY(-150);
        graph.getViewport().setMaxY(150);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(4);
        graph.getViewport().setMaxX(80);

        // enable scaling and scrolling
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);
        graph.addSeries(series);



        pie_energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this  , pie_energy.class);
                startActivity(i);
            }
        });


        energy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(MainActivity.this  , Energy.class);
                startActivity(i);
            }
        });
    }

}

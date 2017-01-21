package com.example.mayanktripathi.smartgrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.helper.StaticLabelsFormatter;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class LineGraph extends AppCompatActivity {
    private LineGraphSeries<DataPoint> mSeries1;
    private LineGraphSeries<DataPoint> mSeries2;
    DataPoint[] data;

    Button ticker;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_graph);
        GraphView graph = (GraphView)findViewById(R.id.graph);
        ticker = (Button) findViewById(R.id.button3);


        ticker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LineGraph.this , Ticker.class);
                startActivity(i);
            }
        });




        mSeries1 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(1,     11.94643),
                new DataPoint(2,     11.10132),
                new DataPoint(3,     11.54321),
                new DataPoint(4,     10.32109),
                new DataPoint(5,     10.10232),
                new DataPoint(6,     10.56789),
                new DataPoint(7,     11.56219),
                new DataPoint(8,     11.31984),
                new DataPoint(9,     11.83209),
                new DataPoint(10,    11.00000),
                new DataPoint(11,    11.54321),
                new DataPoint(12,    10.42109),
                new DataPoint(13,    10.20232),
                new DataPoint(14,    10.36789),
                new DataPoint(15,    10.56219),
                new DataPoint(16,    9.42219),
                new DataPoint(17,    10.43318),
                new DataPoint(18,    11.54184),
                new DataPoint(19,    11.51821),
                new DataPoint(20,    12.61726),
                new DataPoint(21,    9.47144),
                new DataPoint(22,    10.47264),
                new DataPoint(23,    10.47776),
                new DataPoint(24,    10.47007),
                new DataPoint(25,    8.99234),
                new DataPoint(26,    9.87659),
                new DataPoint(27,    11.47776),
                new DataPoint(28,    12.47007),
                new DataPoint(29,    10.99234),
                new DataPoint(30,    9.87659),






        });



        mSeries1.setColor(getResources().getColor(R.color.realData));
        graph.getViewport().setYAxisBoundsManual(true);

        graph.getViewport().setXAxisBoundsManual(true);



        // enable scaling and scrolling
        graph.getViewport().setScalable(true);
        graph.getViewport().setScalableY(true);
        graph.addSeries(mSeries1);
        mSeries2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(30,    9.87659),
                new DataPoint(31,     11.84643),
                new DataPoint(32,     11.20132),
                new DataPoint(33,     11.64321),
                new DataPoint(34,     11.32109),
                new DataPoint(35,     9.10232),
                new DataPoint(36,     10.76789),
                new DataPoint(37,     10.56219),
                new DataPoint(38,     11.21984),
                new DataPoint(39,     11.82209),
                new DataPoint(40,    10.90000),
                new DataPoint(41,    12.54321),
                new DataPoint(42,    9.42109),
                new DataPoint(43,    10.10232),
                new DataPoint(44,    9.36789),
                new DataPoint(45,    10.51219),
                new DataPoint(46,    10.42219),
                new DataPoint(47,    11.43318),
                new DataPoint(48,    12.54184),
                new DataPoint(49,    10.51821),
                new DataPoint(50,    10.61726),
                new DataPoint(51,    10.47144),
                new DataPoint(52,    9.47264),
                new DataPoint(53,    8.47776),
                new DataPoint(54,    10.47007),
                new DataPoint(55,    8.99234),
                new DataPoint(56,    9.87659),
                new DataPoint(57,    11.47776),
                new DataPoint(58,    12.47007),
                new DataPoint(59,    10.99234),
                new DataPoint(60,    9.87659),
        });
        mSeries2.setColor(getResources().getColor(R.color.prediciton));
        graph.addSeries(mSeries2);

        graph.getViewport().setYAxisBoundsManual(true);

        graph.getViewport().setMinY(8);
        graph.getViewport().setMaxY(14);

        graph.getViewport().setXAxisBoundsManual(true);
        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(60);

    }
}

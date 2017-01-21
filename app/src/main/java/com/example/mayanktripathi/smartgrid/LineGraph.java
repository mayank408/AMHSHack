package com.example.mayanktripathi.smartgrid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
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
                new DataPoint(0, 1),
                new DataPoint(1, 5),
                new DataPoint(2, 3),
                new DataPoint(3, 2),
                new DataPoint(4, 6)
        });
        mSeries1.setColor(getResources().getColor(R.color.realData));
        graph.addSeries(mSeries1);
        mSeries2 = new LineGraphSeries<>(new DataPoint[] {
                new DataPoint(4,6),
                new DataPoint(5, 5),
                new DataPoint(6, 6),
                new DataPoint(7, 7),
                new DataPoint(8, 8)
        });
        mSeries2.setColor(getResources().getColor(R.color.prediciton));
        graph.addSeries(mSeries2);

    }
}

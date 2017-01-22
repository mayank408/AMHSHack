package com.example.mayanktripathi.smartgrid;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.data.LineData;
import com.github.mikephil.charting.data.LineDataSet;
import com.jjoe64.graphview.series.DataPoint;

import java.util.ArrayList;
import java.util.List;

public class AnimateGraph extends AppCompatActivity {


    TextView challenge;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_animate_graph);
        LineChart chart1 = (LineChart) findViewById(R.id.chart1);

        challenge = (TextView)findViewById(R.id.challenge);

        List<Entry> dataset = new ArrayList<>();

        dataset.add(new Entry(1 ,    11.9464f));
        dataset.add(new Entry(2 ,    11.1013f));
        dataset.add(new Entry(3 ,    11.5432f));
        dataset.add(new Entry(4 ,    10.3210f));
        dataset.add(new Entry(5 ,    10.1023f));
        dataset.add(new Entry(6 ,    10.5678f));
        dataset.add(new Entry(7 ,    11.5621f));
        dataset.add(new Entry(8 ,    11.3198f));
        dataset.add(new Entry(9 ,    11.8320f));
        dataset.add(new Entry(10,    11.0000f));
        dataset.add(new Entry(11,    11.5432f));
        dataset.add(new Entry(12,    10.4210f));
        dataset.add(new Entry(13,    10.2023f));
        dataset.add(new Entry(14,    10.3678f));
        dataset.add(new Entry(15,    10.5621f));
        dataset.add(new Entry(16,    9.42219f));
        dataset.add(new Entry(17,    10.4331f));
        dataset.add(new Entry(18,    11.5418f));
        dataset.add(new Entry(19,    11.5182f));
        dataset.add(new Entry(20,    12.6172f));
        dataset.add(new Entry(21,    9.47144f));
        dataset.add(new Entry(22,    10.4726f));
        dataset.add(new Entry(23,    10.4777f));
        dataset.add(new Entry(24,    10.4700f));
        dataset.add(new Entry(25,    8.99234f));
        dataset.add(new Entry(26,    9.87659f));
        dataset.add(new Entry(27,    11.4777f));
        dataset.add(new Entry(28,    12.4700f));
        dataset.add(new Entry(29,    10.9923f));
        dataset.add(new Entry(30,    9.87659f));



        LineDataSet dataSets = new LineDataSet(dataset, "Label"); // add entries to dataset
        dataSets.setColor(Color.BLUE);
        dataSets.setValueTextColor(Color.BLUE); // styling, ...
        LineData lineDatas = new LineData(dataSets);

        chart1.setData(lineDatas);
        chart1.invalidate();
        chart1.animateX(5000);


LineChart chart2 = (LineChart) findViewById(R.id.chart2);
        List<Entry> data = new ArrayList<>();
        data.add(new Entry(30,    9.87659f));
        data.add(new Entry(31,     11.84640f));
        data.add(new Entry(32,     11.20130f));
        data.add(new Entry(33,     11.64320f));
        data.add(new Entry(34,     11.32100f));
        data.add(new Entry(35,     9.102320f));
        data.add(new Entry(36,     10.76780f));
        data.add(new Entry(37,     10.56210f));
        data.add(new Entry(38,     11.21980f));
        data.add(new Entry(39,     11.82200f));
        data.add(new Entry(40,    10.900000f));
        data.add(new Entry(41,    12.543210f));
        data.add(new Entry(42,    9.421090f));
        data.add(new Entry(43,    10.102320f));
        data.add(new Entry(44,    9.367890f));
        data.add(new Entry(45,    10.512190f));
        data.add(new Entry(46,    10.422190f));
        data.add(new Entry(47,    11.433180f));
        data.add(new Entry(48,    12.541840f));
        data.add(new Entry(49,    10.518210f));
        data.add(new Entry(50,    10.617260f));
        data.add(new Entry(51,    10.471440f));
        data.add(new Entry(52,    9.472640f));
        data.add(new Entry(53,    8.9977760f));
        data.add(new Entry(54,    10.470070f));
        data.add(new Entry(55,    8.992340f));
        data.add(new Entry(56,    9.876590f));
        data.add(new Entry(57,    11.477760f));
        data.add(new Entry(58,    12.470070f));
        data.add(new Entry(59,    10.992340f));
        data.add(new Entry(60,    9.876590f));



        LineDataSet dataSet = new LineDataSet(data, "Label"); // add entries to dataset
        dataSet.setColor(Color.RED);
        dataSet.setValueTextColor(Color.BLUE); // styling, ...
        LineData lineData = new LineData(dataSet);

        chart2.setData(lineData);
        chart2.animateX(5000);
        chart2.invalidate();


        challenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(AnimateGraph.this , suggestions.class);
                startActivity(i);
            }
        });


    }
}

package com.example.mayanktripathi.smartgrid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

import static com.example.mayanktripathi.smartgrid.R.id.chart;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class pie_energy extends AppCompatActivity {

    PieChart chart;
    ArrayList<Float> data = new ArrayList<>();


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy_pie);

        data.add(0 , (float) 1.4);
        data.add(1 , (float) 2.4);
        data.add(2 , (float) 3.4);
        data.add(3 , (float) 4.4);
        createPieChart(data);

        Vibrator v = (Vibrator) pie_energy.this.getSystemService(Context.VIBRATOR_SERVICE);
        v.vibrate(500);



    }





    private void createPieChart(ArrayList<Float> data)
    {
        chart = (PieChart) findViewById(R.id.chart);
        List<PieEntry> entries = new ArrayList<>();
        for(int i = 0;i<data.size();i++)
        {
            entries.add(new PieEntry(data.get(i)));
        }

        PieDataSet set = new PieDataSet(entries, "Election Results");
        set.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData dataSet = new PieData(set);
        chart.setData(dataSet);
        chart.invalidate();
        chart.animateX(300);

    }

}

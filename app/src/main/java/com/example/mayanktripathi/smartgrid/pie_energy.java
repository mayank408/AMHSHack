package com.example.mayanktripathi.smartgrid;

import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.OnChartGestureListener;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

import static com.example.mayanktripathi.smartgrid.R.id.chart;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class pie_energy extends AppCompatActivity {

    PieChart chart;
    ArrayList<Float> data = new ArrayList<>();

    CircleImageView suggestions;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.energy_pie);

        suggestions = (CircleImageView)findViewById(R.id.profile_image);



        data.add(0 , (float) 60);
        data.add(1 , (float) 20);
        data.add(2 , (float) 15);
        data.add(3 , (float) 05);
        createPieChart(data);



    }





    private void createPieChart(ArrayList<Float> data)
    {
        chart = (PieChart) findViewById(R.id.chart);
        List<PieEntry> entries = new ArrayList<>();
        for(int i = 0;i<data.size();i++)
        {
            entries.add(new PieEntry(data.get(i)));
        }

        PieDataSet set = new PieDataSet(entries, "Results");
        set.setColors(ColorTemplate.COLORFUL_COLORS);
        PieData dataSet = new PieData(set);



        chart.setData(dataSet);
        chart.invalidate();
        chart.animateX(300);

        chart.setOnChartGestureListener(new OnChartGestureListener() {
            @Override
            public void onChartGestureStart(MotionEvent me, ChartTouchListener.ChartGesture lastPerformedGesture) {
                //Toast.makeText(pie_energy.this, "movement", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onChartGestureEnd(MotionEvent me, ChartTouchListener.ChartGesture lastPerformedGesture) {

            }

            @Override
            public void onChartLongPressed(MotionEvent me) {

                //Toast.makeText(pie_energy.this, "long pressed", Toast.LENGTH_SHORT).show();

                suggestions.setVisibility(View.VISIBLE);
                suggestions.setImageDrawable(getDrawable(R.drawable.suggestioncirclethree));

            }

            @Override
            public void onChartDoubleTapped(MotionEvent me) {

                Toast.makeText(pie_energy.this, "double pressed", Toast.LENGTH_SHORT).show();



            }

            @Override
            public void onChartSingleTapped(MotionEvent me) {

               // Toast.makeText(pie_energy.this, "single pressed", Toast.LENGTH_SHORT).show();
                suggestions.setVisibility(View.VISIBLE);
                suggestions.setImageDrawable(getDrawable(R.drawable.suggestioncircletwo));



            }

            @Override
            public void onChartFling(MotionEvent me1, MotionEvent me2, float velocityX, float velocityY) {

                //Toast.makeText(pie_energy.this, "fling", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onChartScale(MotionEvent me, float scaleX, float scaleY) {

            }

            @Override
            public void onChartTranslate(MotionEvent me, float dX, float dY) {

            }
        });




    }

}

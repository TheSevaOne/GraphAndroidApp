package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import java.util.Random;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GridLabelRenderer;
import com.jjoe64.graphview.LegendRenderer;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class plot_screen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plot_screen);
        getSupportActionBar().setTitle(R.string.nametoolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        GraphView graph = (GraphView) findViewById(R.id.Graphic);
        LineGraphSeries<DataPoint> series = generator();
        series.setColor(Color.rgb(0, 80, 100));
        series.setTitle("Line");
        series.setThickness(2);
        graph.addSeries(series);
        graph.setTitle("Graph");
        graph.setTitleColor(R.color.purple_500);
        GridLabelRenderer gridLabel = graph.getGridLabelRenderer();
        gridLabel.setHorizontalAxisTitle("X");
        gridLabel.setVerticalAxisTitle("Y");
        graph.getViewport().setMaxX(70);
        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setXAxisBoundsManual(true);



    }

    public static LineGraphSeries<DataPoint> generator() {
        Random random = new Random();
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>();
        for (int i = 0; i < 60; i++) {
            series.appendData(new DataPoint(i, random.nextInt(5)), true, 90);
        }
        return series;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
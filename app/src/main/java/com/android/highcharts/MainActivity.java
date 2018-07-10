package com.android.highcharts;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.gson.annotations.SerializedName;
import com.highsoft.highcharts.Common.HIColor;
import com.highsoft.highcharts.Common.HIGradient;
import com.highsoft.highcharts.Core.*;
import com.highsoft.highcharts.Common.HIChartsClasses.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("NewApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HIChartView chartView =  findViewById(R.id.hc);

        HIOptions options = new HIOptions();

        HIChart chart = new HIChart();
        chart.setType("area");
        options.setChart(chart);

        HITitle title = new HITitle();
        title.setText("Area chart");
        options.setTitle(title);
        HIArea area = new HIArea();
        area.setTrackByArea(false);
        area.setLineColor(HIColor.initWithHexValue("ffffff"));
        HIPlotOptions hiPlotOptions = new HIPlotOptions();
        hiPlotOptions.setArea(area);
        HIXAxis hixAxis = new HIXAxis();
        HIYAxis hiyAxis = new HIYAxis();
        hixAxis.setGridLineWidth(0);
        hixAxis.setMinorGridLineWidth(0);
        hiyAxis.setMinorGridLineWidth(0);
        hixAxis.setGridLineColor(HIColor.initWithHexValue("FFFFFF"));
        hiyAxis.setGridLineColor(HIColor.initWithHexValue("FFFFFF"));
        hiyAxis.setGridLineWidth(0);
//        hixAxis.setLineColor(HIColor.initWithName("transparent"));
//        hixAxis.setMinorTickLength(0);
//        hiyAxis.setMinorTickLength(0);
//        hixAxis.setTickLength(0);
//        hiyAxis.setTickLength(0);
//        hiyAxis.setLineColor(HIColor.initWithName("transparent"));
        hiyAxis.setAlignTicks(false);
        hiyAxis.setAllowDecimals(false);
        HILabels hiLabel = new HILabels();
        hiLabel.setEnabled(false);
        options.setLabels(hiLabel);

        hiyAxis.setMinorGridLineWidth(null);
        hixAxis.setMinorGridLineWidth(null);
        hiLabel.setX(null);
        hiLabel.setY(null);

        area.setFillColor(HIColor.initWithHexValue("f4e0c1"));
        area.setLineColor(HIColor.initWithHexValue("dd9933"));
        area.setData(new ArrayList<>(Arrays.asList(5, 25, 50, 120, 150, 200, 426, 660, 869, 1060,
                1605, 2471, 3322, 4238, 5221, 6129, 7089, 6339, 9399, 8538,
                11643, 13092, 14478, 15915, 17385, 19055, 21205, 23044, 25393, 27935,
                30062, 32049, 33952, 35804, 37431, 39197, 45000, 43000, 41000, 39000,
                37000, 35000, 33000, 31000, 29000, 27000, 29000, 24000, 23000, 25000,
                21000, 20000, 19000, 18000, 18000, 17000, 16000, 15537, 14162, 12787,
                12600, 11400, 5500, 4512, 4502, 4502, 4500, 4500)));
        options.setSeries(new ArrayList<HISeries>(Collections.singletonList(area)));

        chartView.setOptions(options);
    }
}

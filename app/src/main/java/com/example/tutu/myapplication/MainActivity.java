package com.example.tutu.myapplication;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    TPieChart TPieChart;
    SeekBar seekBar;
    List<MoaChartItem> chartItems = new ArrayList<>(2);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                MoaChartItem item1 = new MoaChartItem(seekBar.getProgress(),
                        getResources().getColor(android.R.color.holo_green_light),
                        getResources().getColor(android.R.color.white));
                //已回款
                MoaChartItem item2 = new MoaChartItem(seekBar.getMax() - seekBar.getProgress(),
                        getResources().getColor(android.R.color.holo_red_light),
                        getResources().getColor(android.R.color.white));
                chartItems.clear();
                chartItems.add(item1);
                chartItems.add(item2);
                TPieChart.setChartItemsList(chartItems);
                TPieChart.regularDraw();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
        TPieChart = (com.example.tutu.myapplication.TPieChart) findViewById(R.id.magnificentChart);
        List<MoaChartItem> chartItems = new ArrayList<>(2);
        //未回款
        MoaChartItem item1 = new MoaChartItem(14,
                getResources().getColor(android.R.color.holo_green_light),
                getResources().getColor(android.R.color.white));
        //已回款
        MoaChartItem item2 = new MoaChartItem(45,
                getResources().getColor(android.R.color.holo_red_light),
                getResources().getColor(android.R.color.white));

        //未回款
        MoaChartItem item3 = new MoaChartItem(33,
                getResources().getColor(android.R.color.holo_blue_bright),
                getResources().getColor(android.R.color.white));
        //已回款
        MoaChartItem item4 = new MoaChartItem(78,
                getResources().getColor(android.R.color.darker_gray),
                getResources().getColor(android.R.color.white));

        MoaChartItem item5 = new MoaChartItem(10,
                getResources().getColor(android.R.color.holo_red_light),
                getResources().getColor(android.R.color.white));

        chartItems.add(item1);
        chartItems.add(item2);
        chartItems.add(item3);
        chartItems.add(item4);
        //chartItems.add(item5);
        TPieChart.setChartItemsList(chartItems);
        TPieChart.playAnimation();

    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.animationButton:
                List<MoaChartItem> chartItems = new ArrayList<>(2);
                //未回款
                MoaChartItem item1 = new MoaChartItem(6,
                        getResources().getColor(android.R.color.holo_green_light),
                        getResources().getColor(android.R.color.white));
                //已回款
                MoaChartItem item2 = new MoaChartItem(22,
                        getResources().getColor(android.R.color.holo_red_light),
                        getResources().getColor(android.R.color.white));

                //未回款
                MoaChartItem item3 = new MoaChartItem(32,
                        getResources().getColor(android.R.color.holo_blue_bright),
                        getResources().getColor(android.R.color.white));
                //已回款
                MoaChartItem item4 = new MoaChartItem(43,
                        getResources().getColor(android.R.color.darker_gray),
                        getResources().getColor(android.R.color.white));

                MoaChartItem item5 = new MoaChartItem(10,
                        getResources().getColor(android.R.color.holo_red_light),
                        getResources().getColor(android.R.color.white));

                chartItems.add(item1);
                chartItems.add(item2);
               // chartItems.add(item3);
                //chartItems.add(item4);
                //chartItems.add(item5);
                TPieChart.setChartItemsList(chartItems);
                TPieChart.playAnimation();
                break;

            case R.id.roundButton:
                List<MoaChartItem> chartItems1 = new ArrayList<>(2);
                //未回款
               /* MoaChartItem item1 = new MoaChartItem(10,
                        getResources().getColor(android.R.color.holo_green_light),
                        getResources().getColor(android.R.color.white));
                //已回款
                MoaChartItem item2 = new MoaChartItem(10,
                        getResources().getColor(android.R.color.holo_red_light),
                        getResources().getColor(android.R.color.white));

                //未回款
                MoaChartItem item3 = new MoaChartItem(10,
                        getResources().getColor(android.R.color.holo_blue_bright),
                        getResources().getColor(android.R.color.white));*/
                //已回款
                MoaChartItem item41 = new MoaChartItem(1000,
                        getResources().getColor(android.R.color.holo_orange_light),
                        getResources().getColor(android.R.color.white));

                MoaChartItem item51 = new MoaChartItem(1,
                        getResources().getColor(android.R.color.holo_red_light),
                        getResources().getColor(android.R.color.white));

               /* chartItems.add(item1);
                chartItems.add(item2);
                chartItems.add(item3);*/
                chartItems1.add(item41);
                chartItems1.add(item51);
                TPieChart.setChartItemsList(chartItems1);
                TPieChart.playAnimation();
                break;

            case R.id.shadowButton:
                List<MoaChartItem> chartItems11 = new ArrayList<>(2);
                //未回款
                MoaChartItem item11 = new MoaChartItem(40,
                        getResources().getColor(android.R.color.holo_green_light),
                        getResources().getColor(android.R.color.white));
                //已回款
                MoaChartItem item21 = new MoaChartItem(22,
                        getResources().getColor(android.R.color.holo_red_light),
                        getResources().getColor(android.R.color.white));

                //未回款
                MoaChartItem item31 = new MoaChartItem(19,
                        getResources().getColor(android.R.color.holo_blue_bright),
                        getResources().getColor(android.R.color.white));
                //已回款
                MoaChartItem item411 = new MoaChartItem(12,
                        getResources().getColor(android.R.color.darker_gray),
                        getResources().getColor(android.R.color.white));

                MoaChartItem item511 = new MoaChartItem(1,
                        getResources().getColor(android.R.color.holo_red_light),
                        getResources().getColor(android.R.color.white));

                chartItems11.add(item11);
                chartItems11.add(item21);
                chartItems11.add(item31);
                chartItems11.add(item411);
                chartItems11.add(item511);
                TPieChart.setChartItemsList(chartItems11);
                TPieChart.playAnimation();
                break;
        }
    }


}

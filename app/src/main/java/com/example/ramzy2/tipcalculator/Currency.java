package com.example.ramzy2.tipcalculator;


import java.util.ArrayList;

import java.util.List;

import android.app.Activity;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

import android.view.View.OnClickListener;

import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import android.widget.Button;

import android.widget.Spinner;

import android.widget.Toast;



public class Currency  extends AppCompatActivity
        implements View.OnClickListener {



    private Spinner spinner1;

    private Button btnSubmit;



    @Override

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.currency);



        addItemsOnSpinner1();

        addListenerOnButton();

        addListenerOnSpinnerItemSelection();

    }



    // add items into spinner dynamically

    public void addItemsOnSpinner1() {



        spinner1 = (Spinner) findViewById(R.id.spinner1);

        List<String> list = new ArrayList<String>();

        list.add("Dollor");

        list.add("Pound");

        list.add("Taka");

        list.add("Rupees");

        list.add("Rupees");



        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,

                android.R.layout.simple_spinner_item, list);

        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(dataAdapter);

    }



    public void addListenerOnSpinnerItemSelection() {

        spinner1 = (Spinner) findViewById(R.id.spinner1);

        spinner1.setOnItemSelectedListener((AdapterView.OnItemSelectedListener) new CustomOnItemSelectedListener());

    }



    // get the selected dropdown list value

    public void addListenerOnButton() {



        spinner1 = (Spinner) findViewById(R.id.spinner1);



        btnSubmit = (Button) findViewById(R.id.btnSubmit);



        btnSubmit.setOnClickListener(new OnClickListener() {



            @Override

            public void onClick(View v) {



                Toast.makeText(Currency.this,

                        "OnClickListener : " +

                                "\nSpinner 1 : "+ String.valueOf(spinner1.getSelectedItem()),

                        Toast.LENGTH_SHORT).show();

            }



        });

    }

    @Override
    public void onClick(View v) {

    }
}
package com.example.mayanktripathi.smartgrid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.mayanktripathi.smartgrid.R.id.button2;
import static com.example.mayanktripathi.smartgrid.R.id.parent;
import static com.example.mayanktripathi.smartgrid.R.id.text1;

/**
 * Created by mayanktripathi on 21/01/17.
 */

public class appliances extends AppCompatActivity implements AdapterView.OnItemSelectedListener {



    List<String> ac = new ArrayList<String>();
    List<String> acs = new ArrayList<String>();
    Spinner s;
    Spinner spinner ;
    Spinner spinner1;
    Spinner spinner2;
    Button submit;

    Button second_login;

    TextView text1;
    TextView text2;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.appliance);

        // Spinner element
        spinner  = (Spinner) findViewById(R.id.spinner);
        spinner1 = (Spinner) findViewById(R.id.spinner1);
        spinner2 = (Spinner) findViewById(R.id.spinner2);

        second_login = (Button) findViewById(R.id.button2);

        text1 = (TextView)findViewById(R.id.text1) ;
        text2 = (TextView)findViewById(R.id.text2) ;
        submit = (Button) findViewById(R.id.submit);



        second_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View  v) {
                Intent i = getIntent();
                finish();
                startActivity(i);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(appliances.this,SecondLogin.class);
                startActivity(i);
            }
        });
        // Spinner click listener
        spinner.setOnItemSelectedListener(this);

        // Spinner Drop down elements
        List<String> categories = new ArrayList<String>();
        categories.add("Air Conditioner");
        categories.add("Bulb");
        categories.add("Washing Machine");
        categories.add("Water heater");
        categories.add("Television");
        categories.add("Refridgerator");


        List<String> number = new ArrayList<>();
        number.add("1");
        number.add("2");
        number.add("3");
        number.add("4");
        number.add("5");
        number.add("6");

        List<String> power = new ArrayList<String>();
        power.add("10W");
        power.add("100W");
        power.add("200W");
        power.add("300W");
        power.add("400W");
        power.add("500W");




        // Creating adapter for spinner
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<>(this, R.layout.spiner_layout, categories);
        ArrayAdapter<String> dataAdapter1 = new ArrayAdapter<>(this,  R.layout.spiner_layout, number);
        ArrayAdapter<String> dataAdapter2 = new ArrayAdapter<>(this,  R.layout.spiner_layout, power);

        // Drop down layout style - list view with radio button
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dataAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(dataAdapter);
        spinner1.setAdapter(dataAdapter1);
        spinner2.setAdapter(dataAdapter2);
    }



    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

            // On selecting a spinner item
            String item = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item

        if(position == 0 ) {
            ac.clear();

           ac.add("1 Ton");
            ac.add("1.5 Ton");
           ac.add("2 Ton");
            ac.add("2.5 Ton");
           ac.add("3 Ton");
        }

        if(position == 1 ) {

            ac.clear();
            ac.add("40 W");
            ac.add("60 W");
            ac.add("100 W");
            ac.add("200W");
        }


        ArrayAdapter<String> data = new ArrayAdapter<>(this, R.layout.spiner_layout, ac);
        data.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setVisibility(View.VISIBLE);
        text1.setVisibility(View.VISIBLE);
        spinner1.setAdapter(data);





            acs.clear();

            acs.add("1");
            acs.add("2");
            acs.add("3");
            acs.add("4");
            acs.add("5");

        ArrayAdapter<String> datas = new ArrayAdapter<>(this, R.layout.spiner_layout, acs);
        datas.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setVisibility(View.VISIBLE);
        text2.setVisibility(View.VISIBLE);
        spinner2.setAdapter(datas);






    }



    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}

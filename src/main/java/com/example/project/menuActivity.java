package com.example.project;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class menuActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //get the spinner from the xml.
        Spinner s1 = findViewById(R.id.spinner1);
        Spinner s2 = findViewById(R.id.spinner2);
        Spinner s3 = findViewById(R.id.spinner3);
        Spinner s4 = findViewById(R.id.spinner4);
        Spinner s5 = findViewById(R.id.spinner5);

//create a list of items for the spinner.
        String[] items1 = new String[]{"veg","non-veg","vegan"};
        String[] items2 = new String[]{"juice", "soups", "coca cola"};
        String[] items3 = new String[]{"Tikka", "Kabab", "Dahi-bada"};
        String[] items4 = new String[]{"Roti", "Noodles", "Biryani","chhole Bhature"};
        String[] items5 = new String[]{"IceCream", "sweet Dish", "Gulab Jamun"};

//create an adapter to describe how the items are displayed, adapters are used in several places in android.
        ArrayAdapter<String> adapter1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items1);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);

//setting default value
        s1.setSelection(0);
        s2.setSelection(0);
        s3.setSelection(0);
        s4.setSelection(0);
        s5.setSelection(0);

//set the spinners adapter to the previously created one.
        s1.setAdapter(adapter1);
        s2.setAdapter(adapter2);
        s3.setAdapter(adapter3);
        s4.setAdapter(adapter4);
        s5.setAdapter(adapter5);
    }
}
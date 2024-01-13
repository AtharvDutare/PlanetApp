package com.example.planetapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Planet> planetArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //adpaterView: a ListView
        listView=findViewById(R.id.listview);

        //adapter
        MyCustomAdapter myCustomAdapter;

        //dataSource ArrayList<Planet>
        planetArrayList=new ArrayList<>();
        Planet planet1=new Planet("earth","1 moons",R.drawable.earth);
        Planet planet2=new Planet("mercury","0 moons",R.drawable.mercury);
        Planet planet3=new Planet("venus"," 0 moons",R.drawable.venus);
        Planet planet4=new Planet("mars","2 moons",R.drawable.mars);
        Planet planet5=new Planet("jupiter","79 moons",R.drawable.jupiter);
        Planet planet6=new Planet("Saturn","83 moons",R.drawable.saturn);
        Planet planet7=new Planet("Uranus","27 moons",R.drawable.uranus);
        Planet planet8=new Planet("Neptune","14 moons",R.drawable.neptune);
        Planet planet9=new Planet("Pluto","0 moons",R.drawable.pluto);
        planetArrayList.add(planet1);
        planetArrayList.add(planet2);
        planetArrayList.add(planet3);
        planetArrayList.add(planet4);
        planetArrayList.add(planet5);
        planetArrayList.add(planet6);
        planetArrayList.add(planet7);
        planetArrayList.add(planet8);
        planetArrayList.add(planet9);

        //adapter
        myCustomAdapter=new MyCustomAdapter(planetArrayList,getApplicationContext()
        );
        listView.setAdapter(myCustomAdapter);




    }
}
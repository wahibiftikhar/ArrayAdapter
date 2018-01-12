package com.example.wahib.arrayadapter;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    //custom data source
    String days[] = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Sunday","Monday","Tuesday","Wednesday","Thursday","Friday"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lv = (ListView) findViewById(R.id.ListView);

        //adapter
        ArrayAdapter arrayAdapter = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,days);



        //bind data source
        lv.setAdapter(arrayAdapter);






    }
}

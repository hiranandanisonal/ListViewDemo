package com.example.a4.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListViewDemo extends AppCompatActivity {

    ListView listView;
    String i;
    String[] s={"No Codename","No Codename","Cupcake","Donut","Eclair","Froyo","GingerBread","HoneyComb","IceCream Sandwich","Jelly Bean","KitKat","Lollipop","Nougat","Orio",};
    ArrayList<String> arrayList=new ArrayList<String>();
    TextView textView;
    ArrayAdapter adapter;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_demo);
        button=(Button)findViewById(R.id.button);

        for(int i=0;i<s.length;i++)
        {
            arrayList.add(s[i].toString());
        }
        Log.i("AAAAA",arrayList.toString());
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayList);

        listView=(ListView)findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getBaseContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT).show();
            }
        });

        textView=(TextView)findViewById(R.id.textView);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                i=textView.getText().toString();
                adapter.add(i);

            }
        });


    }
}

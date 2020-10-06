package com.example.studentmanagementproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class ViewActivity extends AppCompatActivity {
    Toolbar toolbar;
    Spinner displaySpinner;
    MyCustomAdapter myCustomAdapter;
    DatabaseHelper databaseHelper;
    List<ModelClass> arrayList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view);
        if(Build.VERSION.SDK_INT>=21){
            Window window=getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(getResources().getColor(R.color.statusbarcolor));
        }
        toolbar=findViewById(R.id.toolbarId);
        recyclerView=findViewById(R.id.recycleViewId);
        recyclerView.setLayoutManager(new LinearLayoutManager(ViewActivity.this));
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        displaySpinner=findViewById(R.id.displaySpinnerId);
        ArrayAdapter<CharSequence> arrayAdapter2=ArrayAdapter.createFromResource(this,R.array.displaysemester,android.R.layout.simple_spinner_item);
        arrayAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        displaySpinner.setAdapter(arrayAdapter2);
        displaySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {


                if(id==0){

                       databaseHelper=new DatabaseHelper(ViewActivity.this);
                       arrayList=new ArrayList<>();
                       arrayList= databaseHelper.readTable1Data();
                       if(arrayList.size()>0){

                           myCustomAdapter=new MyCustomAdapter(ViewActivity.this,arrayList);
                           recyclerView.setAdapter(myCustomAdapter);
                       }
                       else {
                           Toast.makeText(ViewActivity.this, "You have no data", Toast.LENGTH_SHORT).show();
                       }
                }
                if(id==1){
                    databaseHelper=new DatabaseHelper(ViewActivity.this);
                    arrayList=new ArrayList<>();
                    arrayList= databaseHelper.readTable2Data();
                    if(arrayList.size()>0){

                        myCustomAdapter=new MyCustomAdapter(ViewActivity.this,arrayList);
                        recyclerView.setAdapter(myCustomAdapter);
                    }
                    else {
                        Toast.makeText(ViewActivity.this, "You have no data", Toast.LENGTH_SHORT).show();
                    }

                }
                if(id==2){
                    databaseHelper=new DatabaseHelper(ViewActivity.this);
                    arrayList=new ArrayList<>();
                    arrayList= databaseHelper.readTable3Data();
                    if(arrayList.size()>0){

                        myCustomAdapter=new MyCustomAdapter(ViewActivity.this,arrayList);
                        recyclerView.setAdapter(myCustomAdapter);
                    }
                    else {
                        Toast.makeText(ViewActivity.this, "You have no data", Toast.LENGTH_SHORT).show();
                    }

                }
                if(id==3){
                    databaseHelper=new DatabaseHelper(ViewActivity.this);
                    arrayList=new ArrayList<>();
                    arrayList= databaseHelper.readTable4Data();
                    if(arrayList.size()>0){

                        myCustomAdapter=new MyCustomAdapter(ViewActivity.this,arrayList);
                        recyclerView.setAdapter(myCustomAdapter);
                    }
                    else {
                        Toast.makeText(ViewActivity.this, "You have no data", Toast.LENGTH_SHORT).show();
                    }

                }
                if(id==4){
                    databaseHelper=new DatabaseHelper(ViewActivity.this);
                    arrayList=new ArrayList<>();
                    arrayList= databaseHelper.readTable5Data();
                    if(arrayList.size()>0){

                        myCustomAdapter=new MyCustomAdapter(ViewActivity.this,arrayList);
                        recyclerView.setAdapter(myCustomAdapter);
                    }
                    else {
                        Toast.makeText(ViewActivity.this, "You have no data", Toast.LENGTH_SHORT).show();
                    }

                }
                if(id==6){
                    databaseHelper=new DatabaseHelper(ViewActivity.this);
                    arrayList=new ArrayList<>();
                    arrayList= databaseHelper.readTable7Data();
                    if(arrayList.size()>0){

                        myCustomAdapter=new MyCustomAdapter(ViewActivity.this,arrayList);
                        recyclerView.setAdapter(myCustomAdapter);
                    }
                    else {
                        Toast.makeText(ViewActivity.this, "You have no data", Toast.LENGTH_SHORT).show();
                    }

                }
                if(id==7){
                    databaseHelper=new DatabaseHelper(ViewActivity.this);
                    arrayList=new ArrayList<>();
                    arrayList= databaseHelper.readTable8Data();
                    if(arrayList.size()>0){

                        myCustomAdapter=new MyCustomAdapter(ViewActivity.this,arrayList);
                        recyclerView.setAdapter(myCustomAdapter);
                    }
                    else {
                        Toast.makeText(ViewActivity.this, "You have no data", Toast.LENGTH_SHORT).show();
                    }

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        MenuItem menuItem = menu.findItem(R.id.searchViewId);
        SearchView searchView = (SearchView) menuItem.getActionView();
        searchView.setQueryHint("Search here...");
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);

    }
}

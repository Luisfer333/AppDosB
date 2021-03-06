package com.example.jefes.appdos;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MyActivity extends Activity implements View.OnClickListener {
    private Button theButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int i = 0;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        theButton = (Button)findViewById(R.id.Tocame);
        theButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        //respond to click
        if (v.getId() == theButton.getId()) {
            //the button was clicked
            theButton.setText("Ouch");
        }
    }

    public void buttonClicked(View v){
        Button boton = (Button)v;
        boton.setText("Ouch");
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.my, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

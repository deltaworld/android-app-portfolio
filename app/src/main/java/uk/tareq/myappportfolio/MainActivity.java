package uk.tareq.myappportfolio;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void buttonToastHelper(String t)
    {
        Context context = getApplicationContext();
        CharSequence text = t;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        toast.setGravity(Gravity.BOTTOM, 0, 10);
    }

    public void spotifyStreamerClick(View v) {
        buttonToastHelper("This button will launch my Spotify Streamer!");

    }
    public void scoresAppClick(View v) {
        buttonToastHelper("This button will launch my Scores App!");
    }
    public void libraryAppClick(View v) {
        buttonToastHelper("This button will launch my Library App!");
    }
    public void buildItBiggerClick(View v) {
        buttonToastHelper("This button will launch my Build It Bigger App!");
    }
    public void xyzReaderClick(View v) {
        buttonToastHelper("This button will launch my XYZ Reader!");
    }
    public void capstoneClick(View v) {
        buttonToastHelper("This button will launch my Capstone App!");
    }
}

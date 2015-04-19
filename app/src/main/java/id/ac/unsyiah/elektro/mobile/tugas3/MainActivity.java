package id.ac.unsyiah.elektro.mobile.tugas3;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


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
    public void onClickTombol (View view) {
        TextView txtTulisan = (TextView) findViewById(R.id.txtTulisan);
        Button button = (Button) findViewById(R.id.button);
        if (bahasaIndonesia == false) {
            String text = getString(R.string.indonesia);
            String tombol = getString(R.string.btn_inggris);
            txtTulisan.setText(text);
            button.setText(tombol);
            bahasaIndonesia = true;
        } else {
            String text2 = getString(R.string.inggris);
            String tombol2 = getString(R.string.btn_indonesia);
            txtTulisan.setText(text2);
            button.setText(tombol2);
            bahasaIndonesia = false;
        }
    }
    private boolean bahasaIndonesia = false;
}

package pbru.bounnaphonh.phonepasuerth.easytraffic;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends AppCompatActivity {

    //Explicit
    private ListView trafficListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Initial widget
        initialWidget();

    }//Main Method

    private void initialWidget() {
        trafficListView = (ListView) findViewById(R.id.listView);
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
        }//Main Method

        return super.onOptionsItemSelected(item);
    }

    public void clickAboutMe(View view) {
        Intent objIntent = new Intent(ACTION_VIEW);
        objIntent.setData(Uri.parse("http://vientianecollege.com/"));
        startActivity(objIntent);
    }//Click
}

package pt.ulisboa.tecnico.sise.autoinsure.app.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import pt.ulisboa.tecnico.sise.autoinsure.app.WSCallTask;
import pt.ulisboa.tecnico.sise.autoinsurewsapp.R;

public class MainActivity extends AppCompatActivity {
    public final static String TAG = "SISE_MainActivity";
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (TextView) findViewById(R.id.result);
    }

    @Override
    protected void onStart() {
        super.onStart();
        resultView.setText("");
        // create separate AsynkTasks that behave differently for each request in different app
        new WSCallTask(resultView).execute();
    }
}

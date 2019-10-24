package br.com.barrsoft.snackbars;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = MainActivity.class.getName();
    @BindView(R.id.floatingActionButton)
    FloatingActionButton floatingActionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ButterKnife.bind(this);


    }

    @OnClick(R.id.floatingActionButton)
    public void submit(View view) {
        // TODO submit data to server...

        Log.i(TAG, "submit:");
        Snackbar snackbar = Snackbar.make(view,getString(R.string.snack_title),Snackbar.LENGTH_INDEFINITE);
        snackbar.setAction(getString(R.string.snack_action), new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                snackbar.dismiss();
            }
        });
        snackbar.show();
    }

}

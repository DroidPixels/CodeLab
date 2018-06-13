package codelab.co.uk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class CodeLab extends AppCompatActivity {

    public void Build_a(View view) {
        Intent startNewActivity = new Intent(this, Build_a.class);
        startActivity(startNewActivity);
    }

    public void ThisAppIsNotDoneIt (View v) {
        Toast myToast = Toast.makeText(getApplicationContext(),"This feature is no longer available",Toast.LENGTH_LONG);
        myToast.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.codelab);
    }
}

package computing.mobile.com.ridesharing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void Onclick_log(View v)
    {
        if(v.getId()==R.id.button8)
        {
            Intent myIntent = new Intent(this, MainActivity.class);
            startActivity(myIntent);
        }
    }
}

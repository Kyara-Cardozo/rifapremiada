package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Rifa_assinada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rifa_assinada);
    }

    public void principal(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
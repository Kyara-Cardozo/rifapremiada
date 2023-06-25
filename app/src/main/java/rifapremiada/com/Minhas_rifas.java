package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class Minhas_rifas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_rifas);
    }

    public void criarifa(View view) {
        Intent intent = new Intent(this, CriarRifa.class);
        startActivity(intent);
    }
}
package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class Pos_login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pos_login);
    }

    public void criarRifa(View view) {
        Intent intent = new Intent(this, CriarRifa.class);
        startActivity(intent);
    }

    public void minhasrifas(View view) {
        Intent intent = new Intent(this, Minhas_rifas.class);
        startActivity(intent);
    }
}
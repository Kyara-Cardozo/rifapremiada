package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CriarRifa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_rifa);
    }

    public void minhasRifas(View view) {
        Intent intent = new Intent(this, Redefinir_senha.class);
        startActivity(intent);
    }

    public void minhasrifas2(View view) {
        Intent intent = new Intent(this, Minhas_rifas.class);
        startActivity(intent);
    }
}
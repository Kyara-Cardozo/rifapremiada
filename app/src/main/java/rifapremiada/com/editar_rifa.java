package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

public class editar_rifa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_rifa);
    }

    public void minhasrifas3(View view) {
        Intent intent = new Intent(this, Minhas_rifas.class);
        startActivity(intent);
    }
}
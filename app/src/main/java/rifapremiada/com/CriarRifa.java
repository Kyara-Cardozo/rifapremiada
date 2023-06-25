package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.itemsair:

                Intent intent3 = new Intent(this, MainActivity.class);
                startActivity(intent3);

                break;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){
            case R.id.iteminicio:

                Intent intent = new Intent(this, Pos_login.class);
                startActivity(intent);

                break;
            case R.id.itemperfil:

                Intent intent2 = new Intent(this, Perfil.class);
                startActivity(intent2);

                break;
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
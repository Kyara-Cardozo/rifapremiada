package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class Redefinir_senha extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_redefinir_senha);

        Button showDialogButton = findViewById(R.id.voltarMain);

        showDialogButton.setOnClickListener(v -> showAlertDialog());


    }



private void showAlertDialog() {
    AlertDialog.Builder builder = new AlertDialog.Builder(this);
    builder.setTitle("Rifa Premiada")
            .setMessage("Enviamos um email para redefinição de senha.")

            .setPositiveButton("OK", (dialog, which) -> {
                // Lógica a ser executada quando o botão OK for clicado

                // Criar um Intent para iniciar a próxima atividade
                Intent intent = new Intent(Redefinir_senha.this, MainActivity.class);
                startActivity(intent);
            });



    AlertDialog dialog = builder.create();
    dialog.show();
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

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

                break;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}








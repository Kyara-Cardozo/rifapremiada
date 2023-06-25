package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

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




}








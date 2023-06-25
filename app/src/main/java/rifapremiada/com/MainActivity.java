package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void redefinirsenha(View view) {
        Intent intent = new Intent(this, Redefinir_senha.class);
        startActivity(intent);
    }

    public void pos(View view) {
        Intent intent = new Intent(this, Pos_login.class);
        startActivity(intent);
    }

    public void acessarsuasrifas(View view) {
        Intent intent = new Intent(this, Acessar_cpf_verSuasRifas.class);
        startActivity(intent);
    }

    public void criarconta(View view) {
        Intent intent = new Intent(this, CriarConta.class);
        startActivity(intent);
    }




}
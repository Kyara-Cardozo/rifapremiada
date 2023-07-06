package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

import rifapremiada.com.databinding.ActivityCriarContaBinding;


public class CriarConta extends AppCompatActivity {
    //update next line
    // private @NonNull ActivityMainBinding editTextTextEmailAddress3;
    private ActivityCriarContaBinding recebe;

    private ActivityCriarContaBinding recebe2;
    FirebaseFirestore banco_dados = FirebaseFirestore.getInstance();

    //private ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);

        //update next line


        recebe = ActivityCriarContaBinding.inflate(getLayoutInflater());
        View view = recebe.getRoot();
        setContentView(view);

        recebe.cadastroButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = recebe.cadastroEmail.getText().toString();
                String senha = recebe.cadastroSenha.getText().toString();
                String nome  = recebe.cadastroNome.getText().toString();
                String cpf = recebe.cadastroCpf.getText().toString();

                if(email.isEmpty() || senha.isEmpty() || nome.isEmpty() || cpf.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Preencha todos os campos!", Toast.LENGTH_LONG).show();
                }else{
                    Toast.makeText(getApplicationContext(),"Sucesso!", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(), Pos_login.class);
                    startActivity(intent);
                }

                // Dados do usuário
                Map<String, Object> usuariosMap = new HashMap<>();
                usuariosMap.put("nome", nome);
                usuariosMap.put("email", email);
                usuariosMap.put("cpf", cpf);

                // Referência ao documento onde os dados serão salvos
                DocumentReference usuarioRef = banco_dados.collection("usuarios").document("id_do_usuario");

                // Salvando os dados no documento
                usuarioRef.set(usuariosMap)
                        .addOnCompleteListener(new OnCompleteListener<Void>() {
                            @Override
                            public void onComplete(@NonNull Task<Void> task) {
                                if (task.isSuccessful()) {
                                    Log.d("db", "Sucesso ao salvar os dados do usuário");
                                }
                            }
                        });
            }
        });


    }// end onCreat

    public void posLogin(View view) {
        Intent intent = new Intent(this, Pos_login.class);
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

                Intent intent = new Intent(this, MainActivity.class);
                startActivity(intent);

                break;

            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }


}
package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;

import rifapremiada.com.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {


    //update next line
    private ActivityMainBinding recebe2;
    FirebaseAuth auth2 = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        recebe2 = ActivityMainBinding.inflate(getLayoutInflater()); //update line
        setContentView(recebe2.getRoot()); //update line

        recebe2.button3.setOnClickListener(new View.OnClickListener() {

            //lendo o que foi digitado
            @Override
            public void onClick(View v) {
                String email2 = recebe2.entradaLoginInicial.getText().toString();
                String senha2 = recebe2.entradaSenhaInicial.getText().toString();


                if(email2.isEmpty() || senha2.isEmpty() ){
                    Toast.makeText(getApplicationContext(),"Preencha todos os campos!", Toast.LENGTH_LONG).show();
                }else{
                    //Toast.makeText(getApplicationContext(),"Parabéns!", Toast.LENGTH_LONG).show();
                    auth2.signInWithEmailAndPassword(email2,senha2).addOnCompleteListener(task -> {
                        if (task.isSuccessful()) {
                            Toast.makeText(getApplicationContext(),"Sucesso!", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(getApplicationContext(), Pos_login.class);
                            startActivity(intent);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception exception) {
                            String mensagemErro;
                            if (exception instanceof FirebaseAuthInvalidCredentialsException) {
                                mensagemErro = "Senha invalida";
                            }else {
                                mensagemErro = "email inválido";
                            }
                            Toast.makeText(getApplicationContext(),mensagemErro, Toast.LENGTH_LONG).show();

                        }
                    });
                }
            }


        });

    }


    public void redefinirsenha(View view) {
        Intent intent = new Intent(this, Redefinir_senha.class);
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

    //update next line


    @Override
    protected void onStart() {
        super.onStart();

        FirebaseUser usuarioAtual = FirebaseAuth.getInstance().getCurrentUser();

        if(usuarioAtual != null){
            Intent intent = new Intent(this, Pos_login.class);
            startActivity(intent);
        }
    }


}
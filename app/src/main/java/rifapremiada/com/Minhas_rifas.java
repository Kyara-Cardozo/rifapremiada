package rifapremiada.com;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Minhas_rifas extends AppCompatActivity {
    private ArrayList<Object> numerosSelecionados;
    private Map<Integer, String> numerosUsuarios = new HashMap<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minhas_rifas);

        TableLayout tableLayout5 = findViewById(R.id.tableLayout5);

        // Carregar os números selecionados das Preferências Compartilhadas
        SharedPreferences preferences = getSharedPreferences("RifaPreferences", MODE_PRIVATE);
        Set<String> numerosSelecionadosStringSet = preferences.getStringSet("numerosSelecionados", new HashSet<>());
        numerosSelecionados = new ArrayList<>();
        for (String numeroString : numerosSelecionadosStringSet) {
            numerosSelecionados.add(Integer.parseInt(numeroString));
        }

        int number = 1; // Número inicial

        for (int i = 0; i < 5; i++) {
            TableRow tableRow = new TableRow(this);

            for (int j = 0; j < 5; j++) {
                TextView textView = new TextView(this);
                textView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                textView.setText(String.valueOf(number));
                textView.setPadding(16, 16, 16, 16);

                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        int selectedNumber = Integer.parseInt(textView.getText().toString());
                        if (numerosSelecionados.contains(selectedNumber)) {
                            numerosSelecionados.remove(Integer.valueOf(selectedNumber));
                            numerosUsuarios.remove(selectedNumber);
                        } else {
                            numerosSelecionados.add(selectedNumber);
                            //numerosUsuarios.put(selectedNumber, nomeUsuario);
                        }

                        // Salvar a lista numerosSelecionados nas Preferências Compartilhadas
                        Set<String> numerosSelecionadosStringSet = new HashSet<>();
                        for (Object numero : numerosSelecionados) {
                            numerosSelecionadosStringSet.add(String.valueOf(numero));
                        }
                /*        String usuarioCorrespondente = numerosUsuarios.get(1);

                        Toast.makeText(getApplicationContext(), getClass().getName()+ usuarioCorrespondente, Toast.LENGTH_SHORT).show();*/

                        SharedPreferences preferences = getSharedPreferences("RifaPreferences", MODE_PRIVATE);
                        SharedPreferences.Editor editor = preferences.edit();
                        editor.putStringSet("numerosSelecionados", numerosSelecionadosStringSet);
                        editor.apply();

                        textView.setSelected(!textView.isSelected());
                    }
                });

                textView.setBackground(ContextCompat.getDrawable(this, R.drawable.cell_background)); // Plano de fundo personalizado

                // Definir a seleção da célula com base na lista de números selecionados
                textView.setSelected(numerosSelecionados.contains(number));

                tableRow.addView(textView);
                number++;
            }

            tableLayout5.addView(tableRow);
        }
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

    //Menu
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
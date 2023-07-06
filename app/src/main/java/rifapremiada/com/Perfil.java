package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Perfil extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        /*TableLayout tableLayout = findViewById(R.id.tableLayout);
        TableLayout tableLayout2 = findViewById(R.id.tableLayout2);
        TableLayout tableLayout3 = findViewById(R.id.tableLayout3);
        TableLayout tableLayout4 = findViewById(R.id.tableLayout4);

        for (int i = 0; i < 5; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < 5; j++) {
                int number = i * 5 + j + 1;
                TextView textView = new TextView(this);
                textView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                textView.setText(String.valueOf(number));
                textView.setPadding(16, 16, 16, 16);
                textView.setBackgroundResource(android.R.drawable.editbox_dropdown_light_frame); // Opcional: define um plano de fundo para as células

                tableRow.addView(textView);
            }

            tableLayout.addView(tableRow);
        }


        for (int i = 0; i < 5; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < 5; j++) {
                int number = i * 5 + j + 1;
                TextView textView = new TextView(this);
                textView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                textView.setText(String.valueOf(number));
                textView.setPadding(16, 16, 16, 16);
                textView.setBackgroundResource(android.R.drawable.editbox_dropdown_light_frame); // Opcional: define um plano de fundo para as células

                tableRow.addView(textView);
            }

            tableLayout2.addView(tableRow);
        }

        for (int i = 0; i < 5; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < 5; j++) {
                int number = i * 5 + j + 1;
                TextView textView = new TextView(this);
                textView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                textView.setText(String.valueOf(number));
                textView.setPadding(16, 16, 16, 16);
                textView.setBackgroundResource(android.R.drawable.editbox_dropdown_light_frame); // Opcional: define um plano de fundo para as células

                tableRow.addView(textView);
            }

            tableLayout3.addView(tableRow);
        }

        for (int i = 0; i < 5; i++) {
            TableRow tableRow = new TableRow(this);
            tableRow.setLayoutParams(new TableLayout.LayoutParams(TableLayout.LayoutParams.MATCH_PARENT, TableLayout.LayoutParams.WRAP_CONTENT));

            for (int j = 0; j < 5; j++) {
                int number = i * 5 + j + 1;
                TextView textView = new TextView(this);
                textView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT));
                textView.setText(String.valueOf(number));
                textView.setPadding(16, 16, 16, 16);
                textView.setBackgroundResource(android.R.drawable.editbox_dropdown_light_frame); // Opcional: define um plano de fundo para as células

                tableRow.addView(textView);
            }

            tableLayout4.addView(tableRow);
        }*/

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
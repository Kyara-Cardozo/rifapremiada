package rifapremiada.com;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CriarConta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_criar_conta);
    }

    public void posLogin(View view) {
        Intent intent = new Intent(this, Pos_login.class);
        startActivity(intent);
    }

}
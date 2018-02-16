package carlos.com.bienvenida;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private Button boton_ingresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=(EditText)findViewById(R.id.editTextNombre);
        boton_ingresar=(Button)findViewById(R.id.button_ingresar);
    }

    public void Ingresar(View v){
        Intent i;
        i = new Intent(this,Registrado.class);
        i.putExtra("usuario",nombre.getText());

        startActivity(i);
    }
}

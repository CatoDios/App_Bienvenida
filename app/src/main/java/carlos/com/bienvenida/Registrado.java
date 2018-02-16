package carlos.com.bienvenida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Registrado extends AppCompatActivity {
    TextView mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrado);
        mensaje=(TextView)findViewById(R.id.mensaje);
    }

    public void MostrarBienvenida(){
        Bundle datos=getIntent().getExtras();
        String saludo=datos.getString("usuario");
        mensaje.setText("Bienvenidozzz"+saludo);
    }
}

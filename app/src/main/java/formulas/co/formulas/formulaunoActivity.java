package formulas.co.formulas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mariaantonia on 10/05/2015.
 */
public class formulaunoActivity extends Activity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.formulauno);
        }
        public void energiaCinetica_1 (View view)
        {
            String Kmax = editText_Kmax.getText().toString();
            String V = editText_V.getText().toString();
            double potencia = math.pow(10,-19);
            double e = 1.6 * potencia;
            //textView_variables.setText("Kmax: energia cinetica maxima"+"\n"+"e: carga del electron"+"\n"+"V: diferencia de potencial o potencial de frenado");
            double Vdif, K;
            if(Kmax==null)
            {

                Vdif=Double.valueOf(V).doubleValue();
                K=Vdif*e;
                textView_resultado.setText("el valor de Kmax = "+K+"Julios");
                if(V==null)
                {
                    textView_resultado.setText("error, ingrese de nuevo las variables");
                }
            }
            else
            {
                K=Double.valueOf(Kmax).doubleValue();
                Vdif= K/e;
                textView_resultado.setText("el valor de V = "+Vdif+ "Voltios");
            }

        }


}

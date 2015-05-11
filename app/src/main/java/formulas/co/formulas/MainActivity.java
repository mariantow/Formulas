package formulas.co.formulas;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }




    public void frecuencia_de_corte(View view)
    {
        double potenciae = math.pow(10,-19);
        double e = 1.6 * potenciae;
        double potenciah = math.pow(10,-34);
        double h=6.63*potenciah;
        String Vc = editText_Vc.getText().toString();
        String tra = editText_tra.getText().toString();
        textView_variables.setText("Vc: frecuencia de corte o frecuencia umbral"+"\n"+"h: constante de planck"+"\n"+"Φ: funcion de trabajo");
        double fi, frec;
        if (Vc==null)
        {
            if (tra==null)
            {
                textView_resultado.setText("error, ingrese de nuevo las variables");
            }
            else
            {
                fi=Double.valueOf(tra).doubleValue();
                if (tra<=0)
                {
                    textView_resultado.setText("error, ingrese de nuevo las variables");
                }
                frec=fi/h;
                textView_resultado.setText("el valor de Vc = "+frec+ " Hz");
            }
        }
        else
        {
            if (tra==null)
            {
                textView_resultado.setText("error, ingrese de nuevo las variables");
            }
            else
            {
                frec=Double.valueOf(Vc).doubleValue();
                if(frec==0)
                {
                    textView_resultado.setText("error, ingrese de nuevo las variables");
                }
                fi=frec*h;
                textView_resultado.setText("el valor de Φ = "+fi+ " Julios");
            }
        }
    }
    public void umbral_de_corte(View view)
    {
        double potenciae = math.pow(10,-19);
        double e = 1.6 * potenciae;
        double potenciah = math.pow(10,-34);
        double h=6.63*potenciah;
        double potenciac = math.pow(10,8);
        double c = 3*potenciac;
        String landac = editText_lc.getText().toString();
        String tra = editText_tra.getText().toString();
        double fi, lc, multi, fiJ;
        textView_variables.setText("λc: umbra de corte "+"\n"+"h: constante de planck"+"\n"+"Φ: funcion de trabajo"+"\n"+"c: velocidad de la luz");
        if (landac==null)
        {
            if (tra==null)
            {
                textView_resultado.setText("error, ingrese de nuevo las variables");
            }
            else
            {
                fi=Double.valueOf(tra).doubleValue();
                if (fi<=0)
                {
                    textView_resultado.setText("error, ingrese de nuevo las variables");
                }
                fiJ=fi*e;
                multi= h*c;
                lc=multi/fiJ;
                textView_resultado.setText("el valor de λc = "+lc+ " metros");
            }
        }
        else
        {
            if (tra=!null)
            {
                textView_resultado.setText("Deje una variable libre para calcular");
            }
            else
            {
                lc = Double.valueOf(landac).doubleValue();

                if (lc == 0) {
                    textView_resultado.setText("error, longitud de onda de corte no puede ser cero");
                }
                multi = h * c;
                fi = multi / lc;
                textView_resultado.setText("el valor de Φ = " + fi + " Julios");
            }
        }
    }
    public void energia_radiacion(View view)
    {
        double potenciah = math.pow(10,-34);
        double h=6.63*potenciah;
        double potenciac = math.pow(10,8);
        double c = 3*potenciac;
        String landa = editText_l.getText().toString();
        String Energia = editText_E.getText().toString();
        double l, E, multi;
        textView_variables.setText("λ: longitud de onda "+"\n"+"h: constante de planck"+"\n"+"E: energia de la radiacion incidente"+"\n"+"c: velocidad de la luz");
        if (Energia==null)
        {
            if (landa==null)
            {
                textView_resultado.setText("error, ingrese de nuevo las variables");
            }
            else
            {
                l=Double.valueOf(landa).doubleValue();
                if (l==0)
                {
                    textView_resultado.setText("error, ingrese de nuevo las variables");
                }
                else
                {
                    multi=h*c;
                    E=multi/l;
                    textView_resultado.setText("El valor de E = "+E+ " Julios");
                }
            }
        }
        else
        {
            if (E=!null)
            {
                textView_resultado.setText("Deje una variable libre para calcular");
            }
            else
            {
                E=Double.valueOf(Energia).doubleValue();
                if (E==0)
                {
                    textView_resultado.setText("Error, ingrese de nuevo las variables");
                }
                else
                {
                    multi=h*c;
                    l=multi/E;
                    textView_resultado.setText("El valor de λ = "+l+ " metros");
                }
            }

        }
    }
//corregir cuando todas las variables estan llenas









    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

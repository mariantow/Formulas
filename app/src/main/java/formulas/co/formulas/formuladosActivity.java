package formulas.co.formulas;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;






/**
 * Created by mariaantonia on 11/05/2015.
 */
public class formuladosActivity extends Activity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formulados);
    }

    public void energiaCinetica_2(View view)
    {
        double potenciae = math.pow(10,-19);
        double e = 1.6 * potenciae;
        double potenciah = math.pow(10,-34);
        double h=6.63*potenciah;
        String Kmax = editText_Kmax.getText().toString();
        String v = editText_v.getText().toString();
        String tra = editText_tra.getText().toString();

        double K, vf, fi, multi,fJ;

        if (Kmax==null)
        {
            if (v==null || tra==null)
            {
                textView_resultado.setText("error, ingrese de nuevo las variables");
            }
            else
            {
                vf=Double.valueOf(v).doubleValue();
                multi= v*h;
                fi=Double.valueOf(tra).doubleValue();
                fJ=fi*e;
                K=multi-fJ;
                textView_resultado.setText("el valor de Kmax = "+K+ " Julios");
            }
        }
        else
        {
            if (v==null)
            {
                if (tra==null){
                    textView_resultado.setText("error, ingrese de nuevo las variables");
                }
                else {
                    fi=Double.valueOf(tra).doubleValue();
                    K=Double.valueOf(Kmax).doubleValue();
                    multi=K+fi;
                    vf=multi/h;
                    textView_resultado.setText("el valor de v = "+vf+ " Hz");
                }
            }
            else {
                K=Double.valueOf(Kmax).doubleValue();
                vf=Double.valueOf(v).doubleValue();
                multi=h*vf;
                fi=multi-K;
                textView_resultado.setText("el valor de ? = "+fi+ " Julios");
            }

        }

    }
}

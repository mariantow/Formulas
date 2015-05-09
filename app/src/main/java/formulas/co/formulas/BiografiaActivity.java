package formulas.co.formulas;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

/**
 * Created by mariaantonia on 08/05/2015.
 */
public class BiografiaActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.biografia);
    }
    public void clickText(View v){
        //fijate donde quiero que salga el link
        switch (v.getId()){
            case R.id.textView4:
                goLink("http://es.wikipedia.org/wiki/Albert_Einstein");
                break;
        }
    }
    public void goLink(String url){
        Intent url_ = new Intent(Intent.ACTION_VIEW);
        url_.setData(Uri.parse(url));
        this.startActivity(url_);
    }
}


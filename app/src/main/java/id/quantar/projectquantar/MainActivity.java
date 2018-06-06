package id.quantar.projectquantar;

import android.graphics.Typeface;
import android.support.design.widget.TabItem;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    //deklarasi
    TextView tv_name,tv_qucoin,tv_balance;
    TabItem tabQuPesan,tabActivity,tabQuAntar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar)findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        TextView tv_name;
        tv_name = findViewById(R.id.tv_name);
        tv_name.setTypeface(null, Typeface.BOLD);

        tv_name =  findViewById(R.id.tv_name);
        tv_qucoin = findViewById(R.id.tv_qucoin);
        tv_balance = findViewById(R.id.tv_balance);

        Typeface fontaplikasibold=Typeface.createFromAsset(getAssets(),"font/glacialindifferencebold.otf");
        Typeface fontaplikasiregular=Typeface.createFromAsset(getAssets(),"font/glacialindifferenceregular.otf");

        tv_name.setTypeface(fontaplikasibold);
        tv_qucoin.setTypeface(fontaplikasiregular);
        tv_balance.setTypeface(fontaplikasiregular);

        tabQuPesan = findViewById(R.id.tabqupesan);

    }

}

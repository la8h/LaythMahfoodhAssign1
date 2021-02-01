/*
Layth Mahfoodh s991523983
This is assignment 1 to demonstrate the use of
activities and how to invoke 3rd party app
 */
package layth.mahfoodh.s991523983;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;


public class LaythActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callWeb(View view){
        Intent intent = null;
        switch (view.getId()) {
            case R.id.btnBrowser:
            Context context = getApplicationContext();
            CharSequence text =getString(R.string.label_toast);
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, text, duration);
            toast.show();

                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.cp24.com"));
                startActivity(intent);
                break;
            case R.id.btnActivity:
                intent = new Intent(  this, MahfoodhActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}
/*
Layth Mahfoodh s991523983
This is assignment 1 to demonstrate the use of
activities and how to invoke 3rd party app
 */
package layth.mahfoodh.s991523983;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

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
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.cp24.com"));
                startActivity(intent);
                break;

        }
    }
}
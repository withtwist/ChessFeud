package se.chalmers.chessfeud;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener{
	private Button bPlay, bMyProfile, bSettings, bAbout;
	

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);
        
        bPlay = (Button) findViewById(R.id.button_play);
        bMyProfile = (Button) findViewById(R.id.button_myprofile);
        bSettings = (Button) findViewById(R.id.button_settings);
        bAbout = (Button) findViewById(R.id.button_about);
        
        bPlay.setOnClickListener(this);
        bMyProfile.setOnClickListener(this);
        bSettings.setOnClickListener(this);
        bAbout.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
    public void onClick(View v) {
    	int id = v.getId();
    	
    	switch(id){
    	case R.id.button_play:
    		Log.d("Play", "Hej");
    		break;
    	case R.id.button_myprofile:
    		Log.d("MyProfile", "Hej");
    		break;
    	case R.id.button_settings:
    		Log.d("Settings", "Hej");
    		break;
    	case R.id.button_about:
    		Log.d("About", "Hej");
    		break;
    	default:
    		Log.d("Default", "Hej");
    	}
    }
}

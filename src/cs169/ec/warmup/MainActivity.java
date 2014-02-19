package cs169.ec.warmup;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebView;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.loadUrl("http://cs169-ec-warmup.herokuapp.com/");
		//setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		super.onCreateOptionsMenu(menu);
		getMenuInflater().inflate(R.menu.website, menu);
		return true;
	}
	
	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
		if (item.getItemId() == R.id.website) {
			Intent intent = new Intent(this, WebActivity.class);
			startActivity(intent);
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	
	public void onLogin(View view){
		String[] pair = getFields();
 	}
	
	public void onAdd(View view){
		String[] pair = getFields();
		
 	}
	
	private String[] getFields() {
		EditText usernameView = (EditText) findViewById(R.id.username_field);
		EditText passwordView = (EditText) findViewById(R.id.password_field);
		String[] pair = {usernameView.getText().toString(), passwordView.getText().toString()};
		return pair;
	}

}

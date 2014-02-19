package cs169.ec.warmup;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WebView webview = new WebView(this);
		setContentView(webview);
		webview.loadUrl("http://cs169-ec-warmup.herokuapp.com/");

		//WebView webview = (WebView) findViewById(R.layout.website);
		//setContentView(webview);

		//webview.loadUrl("http://cs169-ec-warmup.herokuapp.com/");
		
		//webview.loadUrl("http://cs169-ec-warmup.herokuapp.com/");
	}
	
	
}

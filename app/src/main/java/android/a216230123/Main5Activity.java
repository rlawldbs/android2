package android.a216230123;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

// 3 - 2 webView control 을 사용하여 URL 을 입력하면 해당 web page 를 WebView 를 이용해서 보여 준다.
public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
    // url을 연결해서 새창이 뜨게 하는 방법
    public void goURL(View view){
        TextView tvURL = (TextView)findViewById(R.id.txtURL);
        String url = tvURL.getText().toString();
        Log.i("URL","Opening URL :"+url);

        WebView webView = (WebView)findViewById(R.id.webView);
        webView.setWebViewClient(new WebViewClient()); // 이걸 안해주면 새창이 뜸
        webView.loadUrl(url);

    }
}
//setWebViewClient()  메서드를 사용해야 하는데,
// 안드로이드에서는 디폴트로, 다른 링크로 이동하고자 할때는 안드로이드의 디폴트 외부 웹 브라우져를 통해서 이동하도록 하고 있다.
// 그래서 만약 setWebViewClient로 내부 웹뷰 클라이언트를 지정해주지 않으면 별도의 브라우져가 뜨는 것을 볼 수 있다.

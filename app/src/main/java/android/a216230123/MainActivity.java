package android.a216230123;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TabHost;

//탭이 있는 메인화면 하나씩 누르면 나와염
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TabHost tabHost1 = (TabHost) findViewById(R.id.tabHost1);
        tabHost1.setup();
        // 첫 번째 Tab. (탭 표시 텍스트:"TAB 1"), (페이지 뷰:"content1") _ 메인
        TabHost.TabSpec ts1 = tabHost1.newTabSpec("Tab Spec 1");
        ts1.setContent(R.id.content1);
        ts1.setIndicator("TAB 1");
        tabHost1.addTab(ts1);

        // 두 번째 Tab. (탭 표시 텍스트:"TAB 2"), (페이지 뷰:"content2") _지윤 자기소개
        TabHost.TabSpec ts2 = tabHost1.newTabSpec("Tab Spec 2");
        ts2.setContent(R.id.content2);
        ts2.setIndicator("TAB 2");
        tabHost1.addTab(ts2);

        // 세 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3") _사랑한지 메인부분
        TabHost.TabSpec ts3 = tabHost1.newTabSpec("Tab Spec 3");
        ts3.setContent(R.id.content3);
        ts3.setIndicator("TAB 3");
        tabHost1.addTab(ts3);

        // 네 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3") _구글 지도보이기
        TabHost.TabSpec ts4 = tabHost1.newTabSpec("Tab Spec 4");
        ts3.setContent(R.id.content4);
        ts3.setIndicator("TAB 4");
        tabHost1.addTab(ts4);

        // 다섯 번째 Tab. (탭 표시 텍스트:"TAB 3"), (페이지 뷰:"content3") _WebView
        TabHost.TabSpec ts5 = tabHost1.newTabSpec("Tab Spec 5");
        ts3.setContent(R.id.content5);
        ts3.setIndicator("TAB 5");
        tabHost1.addTab(ts3);
    }

    // 6번째가  CREATE READ 2가지 기능을 보여주는 DB application
    public void ji(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }

    public void home(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
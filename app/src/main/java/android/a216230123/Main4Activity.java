//package android.a216230123;
//
//import android.app.FragmentManager;
//import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
//import android.support.v7.app.AppCompatActivity;
//import android.support.v7.widget.Toolbar;
//import android.view.View;
//import android.app.FragmentManager;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//
//
//// 3 - 1 구글 지도 를 보여준다
//// http://webnautes.tistory.com/647
//public class Main4Activity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main4);
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);
//
//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
//    }
////    FragmentManager fragmentManager = getFragmentManager();
////    MapFragment mapFragment = (MapFragment)fragmentManager
////            .findFragmentById(R.id.map);
////        mapFragment.getMapAsync(this);
////}
//
////    @Override
////    public void onMapReady(final GoogleMap map) {
////
////        LatLng SEOUL = new LatLng(37.56, 126.97);
////
////        MarkerOptions markerOptions = new MarkerOptions();
////        markerOptions.position(SEOUL);
////        markerOptions.title("서울");
////        markerOptions.snippet("한국의 수도");
////        map.addMarker(markerOptions);
////
////        map.moveCamera(CameraUpdateFactory.newLatLng(SEOUL));
////        map.animateCamera(CameraUpdateFactory.zoomTo(10));
////    }
//}

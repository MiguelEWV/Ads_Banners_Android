package com.example.ads_banners_android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;

public class MainActivity extends AppCompatActivity {
private AdManagerAdView mAdManagerAdView;
private AdManagerAdRequest AdManagerAdRequest;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdManagerAdView = findViewById(R.id.adManagerAdView);
        com.google.android.gms.ads.admanager.AdManagerAdRequest adRequest = new AdManagerAdRequest.Builder().build();
        mAdManagerAdView.loadAd( adRequest );

        //para hacer una escucha del banner:
        mAdManagerAdView.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {
                Toast.makeText(MainActivity.this,"Banner Cargado",Toast.LENGTH_SHORT).show();
                // Code to be executed when an ad finishes loading.

            }

            @Override
            public void onAdFailedToLoad(LoadAdError adError) {
                // Code to be executed when an ad request fails.
            }

            @Override
            public void onAdOpened() {
                // Code to be executed when an ad opens an overlay that
                // covers the screen.
            }

            @Override
            public void onAdClicked() {
                // Code to be executed when the user clicks on an ad.
            }

            @Override
            public void onAdClosed() {
                // Code to be executed when the user is about to return
                // to the app after tapping on an ad.
            }
        });

    }
}
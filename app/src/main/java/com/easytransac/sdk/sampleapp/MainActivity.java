package com.easytransac.sdk.sampleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.widget.Toast;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    private final static String TAG = "SampleApp";

    private final static String API_KEY = "YOUR_API_KEY==";
    private final static String EASYTRANSAC_SCHEME = "easytransac://pay";

    // callback scheme is defined on the Android Manifest
    // https://developer.android.com/training/app-links/deep-linking
    private final static String CALLBACK_SCHEME = "easytransacsampleapp://result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        if (Intent.ACTION_VIEW.equals(intent.getAction())) {
            Uri uri = intent.getData();
            Log.d(TAG, uri.toString());
            Toast.makeText(this, uri.toString(), Toast.LENGTH_LONG).show();
        }
    }

    public void actionSingleNfc(View view) {
        Map<String, String> queryParams = new ArrayMap<>();
        queryParams.put("apiKey", API_KEY);
        queryParams.put("paymentMethod", "nfc");
        queryParams.put("amount", "101");
        queryParams.put("demo", "true");
        queryParams.put("callback", CALLBACK_SCHEME);

        queryParams.put("lastname", "Lademo");
        queryParams.put("firstname", "Pierre");

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(generateUrlScheme(queryParams)));
        startActivity(intent);
    }

    public void actionSingleManual(View view) {
        Map<String, String> queryParams = new ArrayMap<>();
        queryParams.put("apiKey", API_KEY);
        queryParams.put("paymentMethod", "manual");
        queryParams.put("amount", "102");
        queryParams.put("demo", "true");
        queryParams.put("callback", CALLBACK_SCHEME);

        queryParams.put("lastname", "Lademo");
        queryParams.put("firstname", "Pierre");

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(generateUrlScheme(queryParams)));
        startActivity(intent);
    }

    public void actionMultipleFlash(View view) {
        Map<String, String> queryParams = new ArrayMap<>();
        queryParams.put("apiKey", API_KEY);
        queryParams.put("paymentMethod", "flash");
        queryParams.put("amount", "10000");
        queryParams.put("demo", "true");
        queryParams.put("multiplePayments", "true");
        queryParams.put("downPayment", "3000");
        queryParams.put("multiplePaymentsRepeat", "3");
        queryParams.put("callback", CALLBACK_SCHEME);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(generateUrlScheme(queryParams)));
        startActivity(intent);
    }

    public void actionSingleMail(View view) {
        Map<String, String> queryParams = new ArrayMap<>();
        queryParams.put("apiKey", API_KEY);
        queryParams.put("paymentMethod", "mail");
        queryParams.put("email", "demo@easytransac.com");
        queryParams.put("amount", "103");
        queryParams.put("demo", "true");
        queryParams.put("callback", CALLBACK_SCHEME);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(generateUrlScheme(queryParams)));
        startActivity(intent);
    }

    public void actionSingleQRCode(View view) {
        Map<String, String> queryParams = new ArrayMap<>();
        queryParams.put("apiKey", API_KEY);
        queryParams.put("paymentMethod", "qrcode");
        queryParams.put("amount", "104");
        queryParams.put("demo", "true");
        queryParams.put("callback", CALLBACK_SCHEME);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(generateUrlScheme(queryParams)));
        startActivity(intent);
    }

    public void actionSingleSms(View view) {
        Map<String, String> queryParams = new ArrayMap<>();
        queryParams.put("apiKey", API_KEY);
        queryParams.put("paymentMethod", "sms");
        queryParams.put("amount", "105");
        queryParams.put("demo", "true");
        queryParams.put("phone", "0611223344");
        queryParams.put("callingCode", "33");
        queryParams.put("callback", CALLBACK_SCHEME);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(generateUrlScheme(queryParams)));
        startActivity(intent);
    }

    public void actionSingleFlash(View view) {
        Map<String, String> queryParams = new ArrayMap<>();
        queryParams.put("apiKey", API_KEY);
        queryParams.put("paymentMethod", "flash");
        queryParams.put("amount", "107");
        queryParams.put("demo", "true");
        queryParams.put("callback", CALLBACK_SCHEME);

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(generateUrlScheme(queryParams)));
        startActivity(intent);
    }

    /**
     * Generate URL scheme from given parameters
     * @param queryParams Map<String, String>
     * @return String url
     */
    private String generateUrlScheme(Map<String, String> queryParams) {

        StringBuilder url = new StringBuilder(EASYTRANSAC_SCHEME);
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            url.append(url.toString().equals(EASYTRANSAC_SCHEME) ? "?" : "&");
            url.append(entry.getKey());
            url.append("=");
            url.append(entry.getValue());
        }

        Log.d(TAG, url.toString());
        return url.toString();
    }
}
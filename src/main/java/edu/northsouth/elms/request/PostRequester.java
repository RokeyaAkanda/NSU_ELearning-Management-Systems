package edu.northsouth.elms.request;

import okhttp3.*;

import java.io.IOException;

public class PostRequester {
    public boolean doPost(String number, String text) {
        OkHttpClient client = new OkHttpClient();

        RequestBody formBody = new FormBody.Builder()
                .add("username", "01843105424")
                .add("password", "QW64BFTG")
                .add("number", number)
                .add("message", text)
                .build();
        Request request = new Request.Builder()
                .url("http://66.45.237.70/api.php")
                .post(formBody)
                .build();

        try {
            Response response = client.newCall(request).execute();
            System.out.println("Response: " + response.toString());
            return true;
            // Do something with the response.
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}

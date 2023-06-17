package org.example;


import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {

        URL url=null;
        HttpURLConnection httpURLConnection=null;
        int responseCode=0;
        String urlString="https://api.chucknorris.io/jokes/random";
        try{
            url=new URL(urlString);

        }
        catch (MalformedURLException e)
        {
            System.out.print("Problem in URL");
        }
        //Connection
        try{
            httpURLConnection =(HttpURLConnection) url.openConnection();
            responseCode = httpURLConnection.getResponseCode();
        }
        catch (Exception e)
        {
            System.out.print("Connection in Problem");
        }
        if(responseCode==200)
        {
            BufferedReader in = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
            StringBuilder apiData = new StringBuilder();
            String readLine = null;

            while((readLine = in.readLine())!= null)
            {
                apiData.append(readLine);
            }
            try {
                in.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            JSONObject jsonAPIResponse = new JSONObject(apiData.toString());
            System.out.println(jsonAPIResponse.get("categories"));
            System.out.println(jsonAPIResponse.get("created_at"));
            System.out.println(jsonAPIResponse.get("icon_url"));
            System.out.println(jsonAPIResponse.get("id"));
            System.out.println(jsonAPIResponse.get("updated_at"));
            System.out.println(jsonAPIResponse.get("url"));
            System.out.println(jsonAPIResponse.get("value"));





        }


    }
}
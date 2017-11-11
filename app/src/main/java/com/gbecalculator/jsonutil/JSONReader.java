package com.gbecalculator.jsonutil;

import android.content.Context;
import android.util.Log;
import com.gbecalculator.jsonpoco.GbeConfigurationJson;
import com.gbecalculator.main.R;
import com.google.gson.Gson;

import java.io.*;

/**
 * Created by beppe on 05/11/17.
 */
public class JSONReader {

    private static final String LOGTAG = JSONReader.class.getSimpleName();

    private Context context;

    public JSONReader(Context _context){
        context = _context;
    }

    public String readJson()
    {
        InputStream is = context.getResources().openRawResource(R.raw.gbecalculator);

        Writer writer = new StringWriter();
        char[] buffer = new char[1024];

        try {
            Reader reader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            int n;
            while ((n = reader.read(buffer)) != -1) {
                writer.write(buffer, 0, n);
            }
        }
        catch(IOException ioexp){
            Log.e(LOGTAG, "IOException while using JSONReader", ioexp);
        }
        finally {
            closeQuietly(is);
        }

        String jsonString = writer.toString();

        return jsonString;
    }

    protected void closeQuietly( InputStream inputStream ) {
        try {
            if (inputStream != null) {
                inputStream.close();
            }
        } catch( Exception ex ) {
            Log.e(LOGTAG,"Exception during closeQuietly()", ex );
        }
    }

    public GbeConfigurationJson Deserialize_Json()
    {
        Gson gson = new Gson();
        GbeConfigurationJson gbeConfigurationJson = gson.fromJson(readJson(), GbeConfigurationJson.class);
        return gbeConfigurationJson;
    }
}

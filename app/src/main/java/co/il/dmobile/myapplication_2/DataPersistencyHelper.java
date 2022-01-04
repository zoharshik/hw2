package co.il.dmobile.myapplication_2;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class DataPersistencyHelper {

    public static Context Context;

    public static void StoreData(List<Car> cars)
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        SharedPreferences.Editor editor = sp.edit();
        String json = new Gson().toJson(cars );
        editor.putString("cars", json);
        editor.commit();
    }

    public static List<Car> LoadData()
    {
        SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(Context);
        String json = sp.getString("cars",null);
        if (json != null)
        {
            Type type = new TypeToken<List<Car>>(){}.getType();
            return new Gson().fromJson(json,type);
        }
        else
        {
            List<Car> cars = new ArrayList<Car>();
            cars.add(new Car(R.drawable.toyota,"Toyota","Corolla","2021","120000 $"));
            cars.add(new Car(R.drawable.nissan,"Nissan","Sentra","2020","180000 $"));
            cars.add(new Car(R.drawable.renault,"Renault","Clio","2019","110000 $"));
            cars.add(new Car(R.drawable.mazda,"Mazda","Series 3","2018","105000 $"));
            cars.add(new Car(R.drawable.kia,"Kia","Picanto","2017","80000 $"));
            cars.add(new Car(R.drawable.hyundai,"Hyundai","Tucson","2016","70000 $"));
            cars.add(new Car(R.drawable.range,"Range Rover","Evoque","2015","95000 $"));
            cars.add(new Car(R.drawable.skoda,"Skoda","Rapid","2014","60000 $"));
            return cars;
        }
    }

}

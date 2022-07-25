package martins.eduardo.uno.morintegracaocomjava.database_app;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.Executors;

import martins.eduardo.uno.morintegracaocomjava.database_app.converter.Converters;

@TypeConverters({Converters.class})

public abstract class DatabaseApp extends RoomDatabase {

    private static final String DB_NAME = "db_app.db";
    private static volatile DatabaseApp sInstance;
    public static final String TAG = "DatabaseApp";

    public DatabaseApp(){

    }


    public static synchronized DatabaseApp getInstance(Context context){

        return null;
    }

    private static DatabaseApp getConnection(Context contextActivity){
        return null;
    }

    static RoomDatabase.Callback initDB = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadScheduledExecutor().execute(() -> {
                //Executar métodos e\ou rotinas logo após a criação do banco
                Log.d(TAG, "Banco criado com sucesso! Executar rotinas posteriores. ");
            });
        }

        public  void onOpen(SupportSQLiteDatabase db){

        }
    };

}

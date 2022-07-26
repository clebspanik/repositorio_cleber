package graef.aloisio.joao.uno.persistenciabdcomjava.database_app;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

import java.util.concurrent.Executors;

import graef.aloisio.joao.uno.persistenciabdcomjava.database_app.converter.Converters;
import graef.aloisio.joao.uno.persistenciabdcomjava.database_app.tabelas.Aluno;

@Database(entities = {Aluno.class}
        , version = 1)

@TypeConverters({Converters.class})

public abstract class DataBaseApp extends RoomDatabase {

    private static final String TAG = "DatabaseAp";
    private static final String DB_NAME = "db_app.db";
    private static volatile DataBaseApp sInstance;

    public DataBaseApp() {}

    public static synchronized DataBaseApp getInstance(Context context){
        //Padrão Singleton
        if(sInstance == null){
            sInstance = getConnection(context);
        }
        return sInstance;
    }

    private static DataBaseApp getConnection(Context activityContext){
        //Criação e inicialização do banco (SQLite)
        DataBaseApp db = Room.databaseBuilder(activityContext
                , DataBaseApp.class, DB_NAME)
                .addCallback(initDB)
                .build();
        return db;
    }

    static Callback initDB = new Callback() {
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            Executors.newSingleThreadScheduledExecutor().execute(() ->{
                //Executar métodos e/ou rotinas logo após a criação do banco
                Log.d(TAG, "Banco criado com sucesso! Executar rotinas posteriores.");
            });
        }
        public void onOpen(SupportSQLiteDatabase db){

        }
    };


    @NonNull
    @Override
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
        return null;
    }

    @NonNull
    @Override
    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    @Override
    public void clearAllTables() {

    }
}

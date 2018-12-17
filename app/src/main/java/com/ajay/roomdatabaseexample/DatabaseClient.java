package com.ajay.roomdatabaseexample;

import android.arch.persistence.room.Room;
import android.content.Context;

public class DatabaseClient {

    //This class is to create a Database Object . that we are going to use when we are doing any query on the Database (insert ,delete ,Update etc )

    private Context mCtx;
    private static DatabaseClient mInstance;  // we need database client object to get DATABASE object..

    //our app database object
    private AppDatabase appDatabase;

    private DatabaseClient(Context mCtx) {
        this.mCtx = mCtx;

        //creating the app database with Room database builder
        //MyToDos is the name of the database
        appDatabase = Room.databaseBuilder(mCtx, AppDatabase.class, "MyToDos").build();
    }

    public static synchronized DatabaseClient getInstance(Context mCtx) {
        if (mInstance == null) {
            mInstance = new DatabaseClient(mCtx);
        }
        return mInstance;
    }

    public AppDatabase getAppDatabase() {
        return appDatabase;
    }
}

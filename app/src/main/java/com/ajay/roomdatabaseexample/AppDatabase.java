package com.ajay.roomdatabaseexample;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

// we are telling to create a database from Task (object class )
@Database(entities = {Task.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TaskDao taskDao();  //  Dao class contains queries that we can use on Task Class
}

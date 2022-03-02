package nicolae.cozma.realmdbdemo

import android.app.Application
import io.realm.Realm
import io.realm.RealmConfiguration

class App : Application() {
    private val realmVersion = 4L
    override fun onCreate() {
        super.onCreate()

        Realm.init(this)

        val config = RealmConfiguration.Builder()
            .name("test.realm")
            .schemaVersion(realmVersion)
            .deleteRealmIfMigrationNeeded()
            .build()
        Realm.setDefaultConfiguration(config)

    }
}
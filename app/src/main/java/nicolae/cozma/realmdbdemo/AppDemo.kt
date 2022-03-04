package nicolae.cozma.realmdbdemo

import android.app.Application
import io.realm.Realm
import io.realm.mongodb.App
import io.realm.mongodb.AppConfiguration
import io.realm.mongodb.Credentials
import io.realm.mongodb.sync.SyncConfiguration

class AppDemo : Application() {
    var realm: Realm? = null
    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
        signInMongoDb()
    }

    private fun signInMongoDb() {
        val appID = BuildConfig.APP_ID
        val app = App(AppConfiguration.Builder(appID).build())

        //Note, if you will set in dashboard mongodb login with login and password
        // can use this method
        val credentials: Credentials =
            Credentials.emailPassword(BuildConfig.REALM_USERNAME, BuildConfig.REALM_PWD)
        //Note, if you want signIn only with app_id
        // can use this method
        //val credentials: Credentials = Credentials.anonymous()

        app.loginAsync(credentials) {
            if (it.isSuccess) {
                val user = app.currentUser()
                val partitionValue = "partition"
                val config = SyncConfiguration.Builder(user!!, partitionValue)
                    .build()
                Realm.getInstanceAsync(config, object : Realm.Callback() {
                    override fun onSuccess(_realm: Realm) {
                        realm = _realm
                    }
                })
            }
        }
    }

}
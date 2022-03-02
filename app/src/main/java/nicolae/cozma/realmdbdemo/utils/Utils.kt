package nicolae.cozma.realmdbdemo.utils

import android.content.Context
import io.realm.Realm
import io.realm.internal.IOException
import nicolae.cozma.realmdbdemo.data.local.entity.SurgeryModel

@Throws(IOException::class)
fun loadJsonFromStream(ctx: Context, realm: Realm, callback: (Boolean) -> Unit) {
    ctx.assets.open("surgery.json").use { stream ->
        try {
            realm.beginTransaction()
            realm.createAllFromJson(SurgeryModel::class.java, stream)
            realm.commitTransaction()
            callback(true)
        } catch (e: IOException) {
            if (realm.isInTransaction) {
                realm.cancelTransaction()
            }
            callback(false)
        }
    }
}
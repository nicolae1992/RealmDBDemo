package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject
import io.realm.annotations.Ignore
import io.realm.annotations.PrimaryKey

open class Theatre : RealmObject() {
    @PrimaryKey
    var id: Int = 0
    var code: Int = 0
    var description: String? = null
}
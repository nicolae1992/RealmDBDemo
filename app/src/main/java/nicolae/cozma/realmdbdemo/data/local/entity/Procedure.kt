package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Procedure : RealmObject() {
    @PrimaryKey
    var id: Int = 0
    var body_side: String? = null
    var code: Int? = null
    var description: String? = null
    var name: String? = null
}
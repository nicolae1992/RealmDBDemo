package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Surgeon : RealmObject() {
    @PrimaryKey
    var id: Int = 0
    var code: Int? = 0
    var forename: String? = null
    var surname: String? = null
    var title: String? = null
}
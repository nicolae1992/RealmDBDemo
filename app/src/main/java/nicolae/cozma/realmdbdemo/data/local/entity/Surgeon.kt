package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class Surgeon(
    @PrimaryKey var _id: ObjectId? = null,
    var Active: Boolean? = null,
    var Code: String? = null,
    var CreatedOn: Date? = null,
    var FirstName: String? = null,
    var InternId: String? = null,
    var LastName: String? = null,
    var LastUpdatedOn: Date? = null,
    var Title: String? = null,
    var _partition: String = ""
): RealmObject() {}
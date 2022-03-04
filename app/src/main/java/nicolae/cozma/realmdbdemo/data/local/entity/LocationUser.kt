package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class LocationUser(
    @PrimaryKey var _id: ObjectId? = null,
    var Active: Boolean? = null,
    var CreatedBy: String? = null,
    var CreatedOn: Date? = null,
    var InternId: String? = null,
    var LastUpdatedBy: String? = null,
    var LastUpdatedOn: Date? = null,
    var LocationId: String? = null,
    var UserId: String? = null,
    var _partition: String = ""
): RealmObject()
package nicolae.cozma.realmdbdemo.data.local.entity.body

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class BodySide(
    @PrimaryKey var _id: ObjectId? = null,
    var Code: String? = null,
    var CreatedBy: String? = null,
    var CreatedOn: Date? = null,
    var Description: String? = null,
    var InternId: String? = null,
    var LastUpdatedBy: String? = null,
    var LastUpdatedOn: Date? = null,
    var _partition: String = ""
): RealmObject()
package nicolae.cozma.realmdbdemo.data.local.entity.surgery

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class SurgeryItemStatusReason(
    @PrimaryKey var _id: ObjectId? = null,
    var CreatedOn: Date? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var Reason: String? = null,
    var SurgeryItemStatus: Long? = null,
    var _partition: String = ""
): RealmObject()
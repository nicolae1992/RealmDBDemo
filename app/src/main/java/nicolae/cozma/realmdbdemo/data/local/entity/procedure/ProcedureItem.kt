package nicolae.cozma.realmdbdemo.data.local.entity.procedure

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class ProcedureItem(
    @PrimaryKey var _id: ObjectId? = null,
    var CreatedOn: Date? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var Quantity: Long? = null,
    var RatioToBase: Long? = null,
    var _partition: String = ""
): RealmObject()
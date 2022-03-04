package nicolae.cozma.realmdbdemo.data.local.entity.surgery

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class SurgeryScheduleSecondaryProcedure(
    @PrimaryKey var _id: ObjectId? = null,
    var CreatedOn: Date? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var PreferenceCardId: Long? = null,
    var ProcedureId: String? = null,
    var SurgeryScheduleId: String? = null,
    var _partition: String = ""
): RealmObject()
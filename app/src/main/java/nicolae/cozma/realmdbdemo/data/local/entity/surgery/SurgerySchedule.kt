package nicolae.cozma.realmdbdemo.data.local.entity.surgery

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class SurgerySchedule(
    @PrimaryKey var _id: ObjectId? = null,
    var CreatedOn: Date? = null,
    var HasMultipleSurgeons: Boolean? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var Laterality: String? = null,
    var PatientId: String? = null,
    var PreferenceCardId: Long? = null,
    var ProcedureId: String? = null,
    var Status: Long? = null,
    var SurgeonId: String? = null,
    var SurgeryDate: Date? = null,
    var SurgeryScheduleCode: String? = null,
    var TheatreId: String? = null,
    var _partition: String = ""
): RealmObject()
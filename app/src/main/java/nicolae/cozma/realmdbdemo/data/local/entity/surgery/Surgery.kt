package nicolae.cozma.realmdbdemo.data.local.entity.surgery

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class Surgery(
    @PrimaryKey var _id: ObjectId? = null,
    var BodySide: String? = null,
    var CreatedOn: Date? = null,
    var Duration: String? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var Lines: Long? = null,
    var ModuleId: String? = null,
    var PatientIdentificationNumber: String? = null,
    var ProcedureCode: String? = null,
    var ProcedureId: String? = null,
    var ProcedureName: String? = null,
    var Reference: String? = null,
    var SecondaryProcedures: String? = null,
    var StartedOn: Date? = null,
    var Surgeon: String? = null,
    var SurgeonId: String? = null,
    var SurgeonWithCode: String? = null,
    var SurgeryId: String? = null,
    var SurgeryItemTotalCost: Double? = null,
    var SurgeryItemTotalCostIncludingVat: Double? = null,
    var SurgeryStaffTotalCost: Double? = null,
    var Theatre: String? = null,
    var TheatreId: String? = null,
    var TheatreTotalCost: Double? = null,
    var TotalCost: Double? = null,
    var TotalCostIncludingVat: Double? = null,
    var _partition: String = ""
): RealmObject()
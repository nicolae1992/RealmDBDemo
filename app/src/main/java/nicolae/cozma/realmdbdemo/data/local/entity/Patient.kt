package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class Patient(
    @PrimaryKey var _id: ObjectId? = null,
    var CreatedBy: String? = null,
    var CreatedOn: Date? = null,
    var GlobalServiceRelationNumber: String? = null,
    var InternId: String? = null,
    var LastUpdatedBy: String? = null,
    var LastUpdatedOn: Date? = null,
    var PatientIdentificationNumber: String? = null,
    var _partition: String = ""
): RealmObject()
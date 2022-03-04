package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class Location(
    @PrimaryKey var _id: ObjectId? = null,
    var Code: String? = null,
    var CreatedBy: String? = null,
    var CreatedOn: Date? = null,
    var Description: String? = null,
    var GlobalLocationNumber: String? = null,
    var InternId: String? = null,
    var IsQuarantineLocation: Boolean? = null,
    var IsStore: Boolean? = null,
    var LastUpdatedBy: String? = null,
    var LastUpdatedOn: Date? = null,
    var OrganisationSiteId: String? = null,
    var _partition: String = ""
): RealmObject()
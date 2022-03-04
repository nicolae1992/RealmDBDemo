package nicolae.cozma.realmdbdemo.data.local.entity.preference

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class PreferenceCardSite(
    @PrimaryKey var _id: ObjectId? = null,
    var Active: Boolean? = null,
    var CreatedOn: Date? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var OrganisationSiteId: String? = null,
    var PreferenceCardId: Long? = null,
    var _partition: String = ""
): RealmObject()
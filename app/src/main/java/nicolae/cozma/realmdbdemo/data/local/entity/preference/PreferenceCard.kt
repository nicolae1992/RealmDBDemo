package nicolae.cozma.realmdbdemo.data.local.entity.preference

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class PreferenceCard(
    @PrimaryKey var _id: ObjectId? = null,
    var Active: Boolean? = null,
    var Code: String? = null,
    var CreatedOn: Date? = null,
    var DataSourceId: String? = null,
    var Description: String? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var _partition: String = ""
): RealmObject()
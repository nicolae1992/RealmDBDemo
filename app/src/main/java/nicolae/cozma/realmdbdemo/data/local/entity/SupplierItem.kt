package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class SupplierItem(
    @PrimaryKey var _id: ObjectId? = null,
    var CreatedOn: Date? = null,
    var Description: String? = null,
    var Discontinued: Boolean? = null,
    var DiscontinuedDate: Date? = null,
    var InternId: String? = null,
    var ItemId: String? = null,
    var LastUpdatedOn: Date? = null,
    var SupplierId: String? = null,
    var SupplierItemCode: String? = null,
    var SupplierItemDescription: String? = null,
    var SupplierItemLongDescription: String? = null,
    var UnitOfMeasureId: String? = null,
    var UnitPrice: Double? = null,
    var _partition: String = ""
): RealmObject()
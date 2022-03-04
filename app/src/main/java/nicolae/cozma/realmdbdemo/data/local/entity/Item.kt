package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class Item(
    @PrimaryKey var _id: ObjectId? = null,
    var AcceptableTemperatureFrom: Double? = null,
    var AcceptableTemperatureRange: String? = null,
    var AcceptableTemperatureTo: Double? = null,
    var AutoReceipt: Boolean? = null,
    var BodySideId: String? = null,
    var CreatedBy: String? = null,
    var CreatedOn: Date? = null,
    var InternId: String? = null,
    var IsImplant: Boolean? = null,
    var ItemCategoryId: String? = null,
    var ItemCode: String? = null,
    var ItemDescription: String? = null,
    var ItemStatusId: String? = null,
    var LastUpdatedBy: String? = null,
    var LastUpdatedOn: Date? = null,
    var RatioToBase: Long? = null,
    var RequiresExpiryDate: Boolean? = null,
    var RequiresLotNumber: Boolean? = null,
    var RequiresSerialNumber: Boolean? = null,
    var SupplierId: String? = null,
    var SupplierItemCode: String? = null,
    var SupplierItemId: String? = null,
    var SupplierItemLastUpdatedOn: Date? = null,
    var UOMDescription: String? = null,
    var UnitPrice: Double? = null,
    var _partition: String = ""
): RealmObject()
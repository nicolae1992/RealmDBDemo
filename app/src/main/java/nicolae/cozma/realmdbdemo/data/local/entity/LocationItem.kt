package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class LocationItem(
    @PrimaryKey var _id: ObjectId? = null,
    var CanBeQuarantined: Boolean? = null,
    var CellContentLastUpdatedOn: Date? = null,
    var CreatedBy: String? = null,
    var CreatedOn: Date? = null,
    var Deactivated: Boolean? = null,
    var InternId: String? = null,
    var IsKanBan: Boolean? = null,
    var IsReplenishLocationActive: Boolean? = null,
    var IsReplenishedFromSupplier: Boolean? = null,
    var IsRequisitionAllowed: Boolean? = null,
    var ItemId: String? = null,
    var ItemOrder: Long? = null,
    var ItemSublocationCode: String? = null,
    var KanBanLevel: Long? = null,
    var LastUpdatedBy: String? = null,
    var LastUpdatedOn: Date? = null,
    var LocationId: String? = null,
    var LocationProfileItemLastUpdatedOn: Date? = null,
    var LpiCalculationLastUpdatedOn: Date? = null,
    var MaxLevel: Long? = null,
    var MinLevel: Long? = null,
    var QuantityAllocatedInBaseUnits: Long? = null,
    var QuantityAwaitingReleaseInBaseUnits: Long? = null,
    var QuantityOrderedInBaseUnits: Long? = null,
    var QuantityReturningInBaseUnits: Long? = null,
    var RatioToBase: Long? = null,
    var ReorderLevel: Long? = null,
    var ReorderQty: Long? = null,
    var ReplenishFromLocationItemId: String? = null,
    var ReplenishFromSupplierItemId: String? = null,
    var RequiresExpiryDate: Boolean? = null,
    var RequiresLotNumber: Boolean? = null,
    var RequiresSerialNumber: Boolean? = null,
    var StockLevelQuantity: Long? = null,
    var TombstoneOperationOn: Date? = null,
    var UOMDescription: String? = null,
    var _partition: String = ""
): RealmObject()
package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;

open class RolePermission(
    @PrimaryKey var _id: ObjectId? = null,
    var AssetManagementTransferEnabled: Boolean? = null,
    var AssetManagementViewAssetEnabled: Boolean? = null,
    var CreatedOn: Date? = null,
    var Description: String? = null,
    var InternId: String? = null,
    var InventoryStockEnquiryEnabled: Boolean? = null,
    var InventoryStockExpiryEnabled: Boolean? = null,
    var InventoryStockGoodsReceiptEnabled: Boolean? = null,
    var InventoryStockIssueEnabled: Boolean? = null,
    var InventoryStockLocationDeliveryEnabled: Boolean? = null,
    var InventoryStockQuarantineEnabled: Boolean? = null,
    var InventoryStockRequisitionEnabled: Boolean? = null,
    var InventoryStockReturnEnabled: Boolean? = null,
    var InventoryStockSiteDeliveryEnabled: Boolean? = null,
    var InventoryStockTakeEnabled: Boolean? = null,
    var InventoryStockTransferEnabled: Boolean? = null,
    var InventoryStockUnplannedReceiptEnabled: Boolean? = null,
    var LastUpdatedOn: Date? = null,
    var PointOfCareBedsideEnabled: Boolean? = null,
    var PointOfCarePreferenceCardsEnabled: Boolean? = null,
    var PointOfCareSurgeryEnabled: Boolean? = null,
    var TissueTrackingGoodsReturnEnabled: Boolean? = null,
    var TissueTrackingStockDockReceiptEnabled: Boolean? = null,
    var TissueTrackingStockReceiptInspectionEnabled: Boolean? = null,
    var TissueTrackingTemperatureTrackingEnabled: Boolean? = null,
    var TissueTrackingTransferEnabled: Boolean? = null,
    var _partition: String = ""
) : RealmObject()
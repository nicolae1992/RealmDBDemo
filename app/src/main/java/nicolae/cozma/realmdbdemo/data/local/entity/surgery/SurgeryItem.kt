package nicolae.cozma.realmdbdemo.data.local.entity.surgery

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class SurgeryItem(
    @PrimaryKey var _id: ObjectId? = null,
    var BodySide: String? = null,
    var BrandName: String? = null,
    var CostCenterCode: String? = null,
    var CreatedOn: Date? = null,
    var ExpiryDateFull: String? = null,
    var GrossCost: Double? = null,
    var ImplantDocumentTime: Date? = null,
    var ImplantNotes: String? = null,
    var ImplantStaffFullName: String? = null,
    var ImplantSurgeonFullName: String? = null,
    var ImplantTime: Date? = null,
    var InternId: String? = null,
    var ItemCategoryId: String? = null,
    var ItemCode: String? = null,
    var ItemDescription: String? = null,
    var LastUpdatedOn: Date? = null,
    var Laterality: String? = null,
    var Level1GrossCost: Double? = null,
    var Level1NettCost: Double? = null,
    var Level1Vat: Double? = null,
    var LotNumber: String? = null,
    var ManufacturerName: String? = null,
    var NettCost: Double? = null,
    var Quantity: Long? = null,
    var RatioToBase: Long? = null,
    var SerialNumber: String? = null,
    var Supplier: String? = null,
    var SurgeryId: String? = null,
    var UnitCost: Double? = null,
    var UnitOfMeasure: String? = null,
    var UnitPrice: Double? = null,
    var Vat: Double? = null,
    var VatRate: Double? = null,
    var _partition: String = ""
): RealmObject()
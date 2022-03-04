package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey
import java.util.Date;
import org.bson.types.ObjectId;
open class Supplier(
    @PrimaryKey var _id: ObjectId? = null,
    var CreatedOn: Date? = null,
    var DUNSNo: String? = null,
    var InternId: String? = null,
    var LastUpdatedOn: Date? = null,
    var SupplierApprovalExpiryDate: Date? = null,
    var SupplierApproved: Boolean? = null,
    var SupplierApproverURL: String? = null,
    var _partition: String = ""
): RealmObject()
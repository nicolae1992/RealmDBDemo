package nicolae.cozma.realmdbdemo.data.local.entity

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import nicolae.cozma.realmdbdemo.model.State
import nicolae.cozma.realmdbdemo.model.SyncState
import java.lang.IllegalArgumentException

open class SurgeryModel : RealmObject() {
    @PrimaryKey
    var id:Int = 0
    var GRSN: String? = null
    var end_time: String? = null
    var notes: String? = null
    var patient_id: Int? = null
    var procedure: Procedure? = null
    var schedule_id: Int? = null
    var second_procedure: RealmList<Procedure> = RealmList()
    var start_time: String? = null
    var surgeon: Surgeon? = null
    var theatre: Theatre? = null
    var state: String = State.DRAFT.name
    private var sync_state: String = SyncState.SYNCED.state
    var syncEnum: SyncState
        get() {
            return try {
                SyncState.valueOf(sync_state)
            } catch (e: IllegalArgumentException) {
                SyncState.SYNCED
            }
        }
        set(value) {
            sync_state = value.state
        }
    var stateEnum: State
        get() {
            return try {
                State.valueOf(state)
            } catch (e: IllegalArgumentException) {
                State.DRAFT
            }
        }
        set(value) {
            state = value.name
        }
}
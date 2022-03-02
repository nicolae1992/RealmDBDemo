package nicolae.cozma.realmdbdemo.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import io.realm.Realm
import io.realm.RealmQuery
import io.realm.RealmResults
import io.realm.Sort
import kotlinx.coroutines.flow.Flow
import nicolae.cozma.realmdbdemo.data.local.entity.SurgeryModel
import nicolae.cozma.realmdbdemo.data.local.entity.Theatre
import nicolae.cozma.realmdbdemo.model.State
import nicolae.cozma.realmdbdemo.utils.loadJsonFromStream

class DemoViewModel : ViewModel() {
    private val realm: Realm by lazy {
        Realm.getDefaultInstance()
    }

    /**
     * Get Json and Insert in DB
     * @throws IllegalArgumentException if the file is not found or json parser will be crash
     * */
    fun readAndInsertDemo(context: Context) {
        loadJsonFromStream(context, realm) { callback ->
            println("is insert and read with succes -> $callback")
        }
    }

    /**
     *  Insert in RealDB manual single object {@link Theatre}
     * */
    fun insertDatabase(theatre: Theatre) {
        realm.use {
            it.beginTransaction()
            it.copyToRealm(theatre)
            it.commitTransaction()
        }
    }

    /**
     * Get All object with relationShip
     *  RealmResults can convert in list or in flow
     *  @return {@code RealmResults}
     *  @see io.realm.RealmResults
     * */
    fun getAllSurgery(): RealmResults<SurgeryModel> {
        return realm.where(SurgeryModel::class.java).findAll()
    }

    /**
     * Get All {@link SurgeryModel}
     *  Where have state = Cancelled
     *  @return {@code RealmResults}
     *  @see io.realm.RealmResults
     * */
    fun getSurgeryWithStateError(): RealmResults<SurgeryModel> {
        return realm.where(SurgeryModel::class.java).equalTo("state", State.CANCELLED.name)
            .findAll()
    }

    /**
     * Get All {@link SurgeryModel}
     *  Where have procedure#code = @param codeProcedure and +1
     *  @param codeProcedure value to update with.
     *  @return {@code RealmResults}
     *  @see io.realm.RealmResults
     * */
    fun getSurgeryWithCode(codeProcedure: Int): RealmResults<SurgeryModel> {
        return realm.where(SurgeryModel::class.java)
            .equalTo("second_procedure.code", codeProcedure)
            .equalTo("second_procedure.code", codeProcedure + 1)
            .findAll()
    }

    /**
     * Get object {@link Theatre}
     * return Theatre
     * this function findFirst() find first object and
     *  @return {@code Theatre} or {@code null}
     *  @see  nicolae.cozma.realmdbdemo.data.local.entity.Theatre
     * */
    fun getTheatre(): Theatre? {
        return realm.where(Theatre::class.java).findFirst()
    }

    /**
     * Get All items {@link SurgeryModel}
     *  Sort items by Start-DataTime in ASCENDING
     *  @return {@RealmResults}
     *  @see io.realm.RealmResults
     * */
    fun sortByDate(): RealmResults<SurgeryModel> {
        return realm.where(SurgeryModel::class.java).sort("start_time", Sort.ASCENDING).findAll()
    }

    /**
     * Pagination {@link SurgeryModel}
     *  with pagination
     *  @param perPage indicator page
     *  @param limit indicator limit items per one page
     *  @return {@RealmResults}
     *  @see io.realm.RealmResults
     * */
    fun getPerPage(perPage: Int, limit: Int): List<SurgeryModel> {
        // val personQuery = RealmQuery { realm.where<SurgeryModel>(SurgeryModel::class.java) }
        return realm.where(SurgeryModel::class.java)
            .limit(perPage * limit.toLong())
            .findAll()
            .toList()
            .takeLast(limit)
    }

    /**
     * Custom Query
     *  with pagination
     *  @return {@RealmResults}
     *  @see io.realm.RealmResults
     * */
    public fun customQuery(): RealmResults<SurgeryModel> {
        return realm.where(SurgeryModel::class.java)
            .rawPredicate("id = 3 SORT(start_time ASCENDING) LIMIT(3)").findAll()
    }

    override fun onCleared() {
        realm.close()
        super.onCleared()
    }
}
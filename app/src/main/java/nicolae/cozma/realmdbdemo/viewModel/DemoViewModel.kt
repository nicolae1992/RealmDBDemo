package nicolae.cozma.realmdbdemo.viewModel

import android.content.Context
import androidx.lifecycle.ViewModel
import io.realm.Realm
import io.realm.RealmResults
import nicolae.cozma.realmdbdemo.data.local.entity.SurgeryModel
import nicolae.cozma.realmdbdemo.data.local.entity.Theatre
import nicolae.cozma.realmdbdemo.utils.loadJsonFromStream

class DemoViewModel : ViewModel() {
    private val realm: Realm by lazy {
        Realm.getDefaultInstance()
    }

    /**
     * Get Json and Insert in DB
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
        return realm.where(SurgeryModel::class.java).equalTo("state", "Cancelled").findAll()
    }

    /**Get Theatre
     * return RealmResults<SurgeryModel>
     * this function findFirst() and
     *  @return {@code Theatre} or {@code null}
     *  @see  nicolae.cozma.realmdbdemo.data.local.entity.Theatre
     * */
    fun getTheatre(): Theatre? {
       return realm.where(Theatre::class.java).findFirst()
    }

    override fun onCleared() {
        realm.close()
        super.onCleared()
    }
}
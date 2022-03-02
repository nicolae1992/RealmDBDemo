package nicolae.cozma.realmdbdemo

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onEach
import nicolae.cozma.realmdbdemo.data.local.entity.Theatre
import nicolae.cozma.realmdbdemo.viewModel.DemoViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel: DemoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel.readAndInsertDemo(this)
        //viewModel.insertDatabase(createItemTree(3, 2, "description test"))
        //viewModel.insertDatabase(createItemTree(4, 5, "test description description "))

        /* viewModel.getAllSurgery().toList().forEach {
             println("list -> ..${it.notes}")
         }*/

        /* viewModel.getTheatre().apply {
             println("item -> ..${this}")
         }*/
        viewModel.getSurgeryWithStateError().toList().forEach {
            println("list -> ..${it.id}")
        }
    }

    private fun createItemTree(id: Int, code: Int, description: String): Theatre {
        val three = Theatre()
        three.id = id
        three.code = code
        three.description = description
        return three
    }
}
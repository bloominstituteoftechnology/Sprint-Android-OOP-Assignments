Author: Albert Yakubov
Date: 09/09/19
Language: Kotlin

OOP Assignment
Android Inheritance Shopping
For this project we will use inheritance to store different classes and objects in the same data structure and use it in a single recycler view.
1. build data class for shopping list item
2. give the class attributes such as color id (Int) and name(String)
3. write a first simple method to getDisplayName()
4. Write three sub classes(keep in mind still working in our shopping list item data class (steps 1-5))
5.  overrride getDisplayName() to get the new sublass 
6. In main activity generate test values and place them in array list
7. build a recycler view (with a card view(not required) ) to display the list

ShoppingList.kt
//TODO 1 Build a parent class for shopping Item
//TODO 2 Give the class at least the following attributes an int for a color id and a String for the product name
//Each class will have a unique color value for the color id int field,
// this will be used to visually distinguish each different class in your recyclerview
// The class's constructor should be protected
open class  ShoppingList protected constructor(val colorId: Int, val productName: String, val itemPrice: String) {


    //    TODO 3 Write a method for the class called getDisplayName which will return a String in this case, just the product name
    //Subclasses will override this method and put their own spin on this method
    open fun getDisplayName(): String {

        return """

            Product name: $productName, $itemPrice

            Product price: $itemPrice

        """.trimIndent() //println(withoutIndent) // ABC\n123\n456

    }
}
    // TODO 4 Write at least 3 subclasses for this class.
    class GroceryItem(colorId: Int, productName: String, itemPrice: String, val isRefrigurated: Boolean)
        :ShoppingList(colorId, productName, itemPrice){

        //TODO 5 Override the getDisplayName method to make a unique twist on the display name ie size of the clothing item,
        // or whether or not the grocery item must be refrigerated

        override fun getDisplayName(): String {

            var fridge = ""
            if (isRefrigurated) fridge = "Yes" else fridge = "No"

            return """
                Product name: $productName
                Product price: $itemPrice
                Requires refriguration: $fridge
                """.trimIndent()
        }


    }
// TODO 7 create second subclass
class Cosmetics(colorId: Int, productName: String, itemPrice: String, val brand: String)
    : ShoppingList(colorId, productName, itemPrice){
    override fun getDisplayName(): String {
        return """
        Product name: $productName
        Product price: $itemPrice
        Product brand: $brand
        """.trimIndent()


    }
}
//TODO 8 create third subclass
class AutoItem(colorId: Int, productName: String, itemPrice: String, val part: String): ShoppingList(colorId, productName, itemPrice){
    override fun getDisplayName(): String {
        return """
        Product name: $productName
        Product price: $itemPrice
        Product brand: $part
        """.trimIndent()
    }
}
MainActivity
class MainActivity : AppCompatActivity() {
    companion object {
        const val NOTIFICATION_ID = 1

        const val CONSTANT_STRING = "CLICKS"
        const val CONSTANT_STRING2 = "SHOPPING LIST CREATED"
        const val ALMOND = "Almond"


    }
    // TODO 6 create itemList array
    val itemList = ArrayList<ShoppingList>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // TODO 6.1 apply the itemList to the recycler view
        recycle.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = ShoppingListAdapter(itemList)
        }
        // TODO 6.2 generate test values
        generateTestValues()
    }
    // so it takes test values from below and puts them in the shopping list
    private fun generateTestValues(){
        testValues.forEach{
            itemList.add(it)
        }

    }

    // TODO 6.3 those are my test values
    val testValues: ArrayList<ShoppingList> = arrayListOf(
        GroceryItem(
            Color.GREEN,
            "Eggs",
            "2.99",
            true
        ),
        AutoItem(
            Color.GRAY,
            "Oil",
            "4.99",
        "Motor Oil"
        ),


        GroceryItem(
            Color.GREEN,
            "Bread",
            "1.99",
            false
        ),
        Cosmetics(
            Color.RED,
            "Lipstick",
        "5.99",
        "Maybelene"
        ),
        Cosmetics(
            Color.RED,
        "Mask",
        "10.99",
        "Cover Girl"
        ),
        AutoItem(
            Color.GRAY,
            "Valve",
        "199.99",
            "Engine Part"
        )


    )
}

ShoppingListAdapter(RecyclerView Adapter)
class ShoppingListAdapter(val itemList: ArrayList<ShoppingList>): RecyclerView.Adapter<ShoppingListAdapter.CustomViewHolder>(){


    //class for the card view view holder
    //card view is also inherited by the recycler view
    class CustomViewHolder(view: View): RecyclerView.ViewHolder(view){
        //declare val for layout
        val layout: CardView = view.card_view
        //declare a val for the text view
        val textView: TextView = view.textView2
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.shopping_list_item, parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        //bind holders
        holder.textView.text = itemList[position].getDisplayName()
        //since we declared layout val we can now set the background color to each item in the list
        holder.layout.setBackgroundColor(itemList[position].colorId)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

}

RUN THE APP!
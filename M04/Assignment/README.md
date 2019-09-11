# Android Design Patterns Assignment
Coding Assignment: Sprint 5, Module 4
Update last week's Pokemon API app to use Model-View-ViewModel and DataBinding.

### STEP 1 - Open Android Project
A) Using the Android Studio IDE, open the Pokemon project from [last week's sprint challenge](https://github.com/LambdaSchool/Android_Sprint_Networking_Challenge)

### STEP 2 - Declare packages
A) Declare appropriate packages for your API, Model, View and ViewModel.

B) Move the application components into their appropriate packages

C) Confirm that the app still builds and runs as expected

### STEP 3 - Build ViewModel
Build a `ViewModel` for your Pokemon application. The `ViewModel` will expose `@Bindable` properties that can be bound to the View / UI, and will handle any click interactions. Your ViewModel should expose any data that is bound to the UI, and should implement the "Save" and "View Details" interactions from the UI. It should also make the actual API calls to fetch Pokemon.

### STEP 4 - Implement DataBinding
Open MainActivity.kt and update the `onCreate` event to use DataBinding:

```Kotlin
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // TODO 5: Update your MainActivity to use DataBindingUtil to show the UI, rather than the regular setContentView
        val activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        activityMainBinding.viewModel = ***YourViewModelHere()***
        activityMainBinding.executePendingBindings()
    }
```

### STEP 5 - Implement DataBinding UI
A) Add the `ViewModel` to the top of your Activity layouts:
```Xml
<data>
  <variable
    name="viewModel"
    type="com.lambdaschool.android.mvvm.viewmodel.MyViewModel" />
</data>
```
B) Wire up the data-binding and any click handling:

```Xml
<TextView
  android:id="@+id/txtPokemonName"
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:text="@={viewModel.pokemonName}" />

...

<Button
  android:layout_width="match_parent"
  android:layout_height="wrap_content"
  android:layout_marginTop="8dp"
  android:onClick="@{()-> viewModel.handleViewDetailClicked()}"
  android:text="View Detail" />
```

C) Confirm that the app builds and runs as expected

### STRETCH - Research unit tests
Research writing a unit test for the ViewModel class. Write a simple passing test for one of your ViewModel methods. 

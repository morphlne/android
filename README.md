# Android Basics with Compose

This repository has my practice projects from Google's **[Android Basics with Compose](https://developer.android.com/courses/android-basics-compose/course)** course, which teaches modern Android development through hands-on apps. **Jetpack Compose** is Android's modern declarative UI toolkit that replaces legacy XML layouts with concise, reactive Kotlin code.

---

## Portfolio with UI screenshots

[https://morphlne.github.io/android/](https://morphlne.github.io/android/)

---

## Unit 1: Your first Android app

* **[U01_01_HappyBirthday](./U01_01_HappyBirthday)** - Simple greeting card app where I learned how to show text, images, and align elements on the screen.<br>
  `Text` `Image` `Column` `Row` `Box`

* **[U01_02_Tutorial](./U01_02_Tutorial)** - Simple article screen to practice working with paddings, text styles, and full-width images.<br>
  `Modifier` `ContentScale`

* **[U01_03_TaskManager](./U01_03_TaskManager)** | **[UI](https://morphlne.github.io/android/#basic-tutorials)** - Completion screen layout where I practiced centering UI blocks on the screen.<br>
  `Alignment` `Arrangement`

* **[U01_04_Quadrant](./U01_04_Quadrant)** | **[UI](https://morphlne.github.io/android/#basic-tutorials)** - Four-part screen layout that taught me how to split space equally between different blocks.<br>
  `Modifier.weight` `Surface`

* **[U01_05_BusinessCard](./U01_05_BusinessCard)** | **[UI](https://morphlne.github.io/android/#basic-tutorials)** - Digital business card app combining icons, colors, and nested layouts into one clean screen.<br>
  `Icon` `Spacer` `Material Icons`

---

## Unit 2: Building app UI

* **[U02_01_DiceRoller](./U02_01_DiceRoller)** | **[UI](https://morphlne.github.io/android/#dice-roller)** - Interactive dice rolling app where I learned how to handle button clicks and update the UI state.<br>
  `Button` `remember` `mutableStateOf`

* **[U02_02_Lemonade](./U02_02_Lemonade)** - Multi-step lemonade making game to practice changing screens and states after user taps.<br>
  `State Hoisting` `clickable`

* **[U02_03_TipCalculator](./U02_03_TipCalculator)** | **[UI](https://morphlne.github.io/android/#tip-calculator)** - Tip calculator app with text inputs, switches, and basic UI tests.<br>
  `TextField` `Switch` `State Hoisting` `Compose UI Testing`

---

## Unit 3: Display lists and use Material Design

* **[U03_01_Affirmations](./U03_01_Affirmations)** | **[UI](https://morphlne.github.io/android/#affirmations)** - Scrollable list of motivational cards with images and text.<br>
  `LazyColumn` `Card`

* **[U03_02_Courses](./U03_02_Courses)** - Two-column grid layout displaying different course topics and student counts.<br>
  `LazyVerticalGrid`

* **[U03_03_Woof](./U03_03_Woof)** | **[UI](https://morphlne.github.io/android/#woof)** - Dog adoption app with expandable cards, smooth animations, and custom Material 3 themes.<br>
  `Material Design 3` `TopAppBar` `animateContentSize` `Typography` `Shapes`

---

## Unit 5: Connect to the internet

* **[U05_01_RaceTracker](./U05_01_RaceTracker)** | **[UI](https://morphlne.github.io/android/#race-tracker)** - Race simulation app where I learned how to run parallel tasks asynchronously.<br>
  `Kotlin Coroutines` `LaunchedEffect` `LinearProgressIndicator`

* **[U05_02_MarsPhotos](./U05_02_MarsPhotos)** | **[UI](https://morphlne.github.io/android/#mars-photos)** - App that loads real Mars rover photos from the internet and shows them in a grid.<br>
  `Retrofit` `Coil` `Kotlin Coroutines` `Serialization` `Dependency injection` `ViewModel`

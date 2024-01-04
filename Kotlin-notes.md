# Features of Kotlin
**Concise:** Kotlin reduces writing the extra codes. This makes Kotlin more concise. \
**Null safety:** Kotlin is null safety language. Kotlin aimed to eliminate the NullPointerException (null reference) 
from the code.Interoperable. \
**Interoperable:** Kotlin easily calls the Java code in a natural way as well as Kotlin code can be used by Java.\
**Smart cast:** It explicitly typecasts the immutable values and inserts the value in its safe cast automatically.\
**Compilation Time:** It has better performance and fast compilation time.\
**Tool-friendly:** Kotlin programs are build using the command line as well as any of Java IDE.\
**Extension function:** Kotlin supports extension functions and extension properties which means it helps to extend 
the functionality of classes without touching their code.

# Hello World
```kotlin
fun main() {
    println("Hello, world!")
    // Hello, world!
}
```
- `fun` is used to declare a function

- the `main()` function is where your program starts from

- the body of a function is written within curly braces` {}`

- `println()` and `print()` functions print their arguments to standard output

# Variables

- read-only variables with `val`

- mutable variables with `var`

```kotlin
val popcorn = 5    // There are 5 boxes of popcorn
val hotdog = 7     // There are 7 hotdogs
var customers = 10 // There are 10 customers in the queue

// Some customers leave the queue
customers = 8
println(customers)
```

# String templates
A string value is a sequence of characters in double quotes `"`. Template expressions always start with a dollar 
sign `$`. 

To evaluate a piece of code in a template expression, place the code within curly braces `{}` after the dollar sign `$`.

```kotlin
val customers = 10
println("There are $customers customers")
// There are 10 customers

println("There are ${customers + 1} customers")
// There are 11 customers
```

# Basic Types
Kotlin was able to tell in the previous example that `customers` has type: Int. Kotlin's ability to **infer** the data type is called **type inference**. `customers` is assigned an integer value. From this, Kotlin infers that `customers` has numerical data type: `Int`. As a result, the compiler knows that you can perform arithmetic operations with `customers`:

| **Category**  | **Basic Types** |
| ----------| ----------- |
| Integers | Byte, Short, Int, Long | 
| Unsigned integers | UByte, UShort, UInt, ULong |
| Floating-point numbers | Float, Double |
| Booleans | Boolean |
| Characters | Char | 
| Strings | String |

**NOTE:** To declare a variable without initializing it, specify its type with : \
For example:
```kotlin
// Variable declared without initialization
val d: Int
// Variable initialized
d = 3

// Variable explicitly typed and initialized
val e: String = "hello"

// Variables can be read because they have been initialized
println(d) // 3
println(e) // hello
```

# Collections
| **Collection type** | **Description** | 
| ----------| ----------- |
| Lists  | Ordered collections of items  |
| Sets  | Unique unordered collections of items  |
| Maps  | Sets of key-value pairs where keys are unique and map to only one value  |

## List
lists are **ordered** and **allow duplicate** items 
- To create a read-only list (`List`), use the `listOf()` function. \
- To create a mutable list (`MutableList`), use the `mutableListOf()` function.

When creating lists, Kotlin can infer the type of items stored. To declare the type explicitly, add the type within angled brackets <> after the list declaration:

```kotlin
// Read only list
val readOnlyShapes = listOf("triangle", "square", "circle")
println(readOnlyShapes)
// [triangle, square, circle]

// Mutable list with explicit type declaration
val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
println(shapes)
// [triangle, square, circle]

println("The first item in the list is: ${readOnlyShapes[0]}")
// The first item in the list is: triangle
```

- To get the first or last item in a list, use `.first()` and `.last()` functions respectively. \
 **Note:** `.first()` and `.last()` functions are examples of **extension** functions. To call an extension function on an 
object, write the function name after the object appended with a period.
- To get the number of items in a list, use the `.count()` function.
- To check that an item is in a list, use the `in` operator.
```kotlin
val readOnlyShapes = listOf("triangle", "square", "circle")
println("circle" in readOnlyShapes)
// true
```

To add or remove items from a mutable list, use `.add()` and `.remove()` functions respectively:

## Set
sets are **unordered** and only store **unique** items.
- To create a read-only set (**Set**), use the **setOf()** function.
- To create a mutable set (**MutableSet**), use the **mutableSetOf()** function.

```kotlin
// Read-only set
val readOnlyFruit = setOf("apple", "banana", "cherry", "cherry")
// Mutable set with explicit type declaration
val fruit: MutableSet<String> = mutableSetOf("apple", "banana", "cherry", "cherry")

println(readOnlyFruit)
// [apple, banana, cherry]
```

- Count elements in a set: use the `.count()` function.
- To check that an item is in a set, use the `in` operator.
- To add or remove items from a mutable set, use `.add()` and `.remove()` functions respectively 

## Map
Maps store items as key-value pairs.
- To create a read-only map (`Map`), use the `mapOf()` function.
- To create a mutable map (`MutableMap`), use the `mutableMapOf()` function.

The easiest way to create maps is to use `to` between each key and its related value:
```kotlin
// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu)
// {apple=100, kiwi=190, orange=100}

// Mutable map with explicit type declaration
val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(juiceMenu)
// {apple=100, kiwi=190, orange=100}
```

To access a value in a map, use the indexed access operator `[]` with its key:
```kotlin
// Read-only map
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("The value of apple juice is: ${readOnlyJuiceMenu["apple"]}")
// The value of apple juice is: 100
```

- To get the number of items in a map, use the `.count()` function.
- To add or remove items from a mutable map, use `.put()` and `.remove()` functions respectively.
- To check if a specific key is already included in a map, use the `.containsKey()` function.
- To obtain a collection of the keys or values of a map, use the `keys` and `values` properties respectively.\
**NOTE:** `keys` and `values` are examples of **properties** of an object. To access the property of an object, write the property name after the object appended with a period

```kotlin
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println(readOnlyJuiceMenu.keys)
// [apple, kiwi, orange]
println(readOnlyJuiceMenu.values)
// [100, 190, 100]
```
 
- To check that a key or value is in a map, use the `in` operator:
```kotlin
val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
println("orange" in readOnlyJuiceMenu.keys)
// true
println(200 in readOnlyJuiceMenu.values)
// false
```

# Conditional expressions
Kotlin provides `if` and `when` for checking conditional expressions.\
**NOTE:** If you have to choose between `if` and `when`, Experts recommend using `when` as it leads to more robust and safer programs.

## If
To use `if`, add the conditional expression within parentheses `()` and the action to take if the result is true within curly braces `{}`:

**No ternary operator `?`**\
There is no ternary operator `condition ? then : else` in Kotlin. Instead, `if` can be used as an expression. When using `if` as an expression, there are no curly braces `{}`:

```kotlin
val d: Int
val check = true

if (check) {
    d = 1
} else {
    d = 2
}

println(d)
// 1

val a = 1
val b = 2

println(if (a > b) a else b) // Returns a value: 2
```

## When
Use `when` when you have a conditional expression with multiple branches.

- Place the conditional expression within parentheses `()` and the actions to take within curly braces `{}`.
- Use `->` in each branch to separate each condition from each action.

```kotlin
val obj = "Hello"

when (obj) {
    // Checks whether obj equals to "1"
    "1" -> println("One")
    // Checks whether obj equals to "Hello"
    "Hello" -> println("Greeting")
    // Default statement
    else -> println("Unknown")     
}
// Greeting
```

using `when` as an expression:
```kotlin
val obj = "Hello"    

val result = when (obj) {
    // If obj equals "1", sets result to "one"
    "1" -> "One"
    // If obj equals "Hello", sets result to "Greeting"
    "Hello" -> "Greeting"
    // Sets result to "Unknown" if no previous condition is satisfied
    else -> "Unknown"
}
println(result)
// Greeting
```

If `when` is used as an expression, the else branch is mandatory.

`when` is also useful when you need to check a chain of Boolean expressions:
```kotlin
val temp = 18

val description = when {
    // If temp < 0 is true, sets description to "very cold"
    temp < 0 -> "very cold"
    // If temp < 10 is true, sets description to "a bit cold"
    temp < 10 -> "a bit cold"
    // If temp < 20 is true, sets description to "warm"
    temp < 20 -> "warm"
    // Sets description to "hot" if no previous condition is satisfied
    else -> "hot"             
}
println(description)
// warm
```

# Ranges
How to construct ranges for loops to iterate over.
- The most common way to create a range in Kotlin is to use the `..` operator. For example, `1..4` is equivalent to 
`1, 2, 3, 4`.
- To declare a range that doesn't include the end value, use the `..<` operator. For example,` 1..<4` is equivalent to `1, 2, 3`.
- To declare a range in **reverse** order, use `downTo`. For example, `4 downTo 1` is equivalent to `4, 3, 2, 1`.
- To declare a range that increments in a step that isn't 1, use `step` and your desired increment value. For example, `1..5 step 2` is equivalent to` 1, 3, 5`.
- You can also do the same with `Char` ranges:
  - `'a'..'d'` is equivalent to `'a', 'b', 'c', 'd'`
  - `'z' downTo 's' step 2` is equivalent to `'z', 'x', 'v', 't' `

# Loops
`for` and `while`

## For
```kotlin
for (number in 1..5) { 
    // number is the iterator and 1..5 is the range
    print(number)
}
// 12345
```

## While
`while` can be used in two ways:
- To execute a code block while a conditional expression is true. (`while`)
- To execute the code block first and then check the conditional expression. (`do-while`)

In the first use case (`while`):
- Declare the conditional expression for your while loop to continue within parentheses `()`.
- Add the action you want to complete within curly braces `{}`.
```kotlin
var cakesEaten = 0
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
// Eat a cake
// Eat a cake
// Eat a cake
```

do-while:
```kotlin
var cakesEaten = 0
var cakesBaked = 0
while (cakesEaten < 3) {
    println("Eat a cake")
    cakesEaten++
}
do {
    println("Bake a cake")
    cakesBaked++
} while (cakesBaked < cakesEaten)
// Eat a cake
// Eat a cake
// Eat a cake
// Bake a cake
// Bake a cake
// Bake a cake
```

# Functions 
TODO ...
**NOTE:** Refer Kotlin's official website for detailed doc - https://kotlinlang.org/docs/home.html

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

- function parameters are written within parentheses `()`.
- each parameter must have a type, and multiple parameters must be separated by commas `,`.
- the return type is written after the function's parentheses (), separated by a colon `:`.
- the body of a function is written within curly braces `{}`. 
- the `return` keyword is used to exit or return something from a function.

```kotlin
fun hello() {
    return println("Hello, world!")
}
fun sum(x: Int, y: Int): Int {
    return x + y
}
fun main() {
    hello()
    println(sum(1, 2))
    // 3
}
```
## Named Arguments

With named argument parameters, you can write the parameters in any order. See below example where arguments are 
swapped in a caller.

```kotlin
fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun main() {
    // Uses named arguments with swapped parameter order
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
}
```

## Default parameter values
To declare a default value, use the assignment operator = after the type:
```kotlin
fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun main() {
    // Function called with both parameters
    printMessageWithPrefix("Hello", "Log") 
    // [Log] Hello
    
    // Function called only with message parameter
    printMessageWithPrefix("Hello")        
    // [Info] Hello
    
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    // [Log] Hello
}
```

## Single expression functions
The `sum()` function then becomes one line:

```kotlin
// before
// fun sum(x: Int, y: Int): Int {
//    return x + y
// }

// After
fun sum(x: Int, y: Int) = x + y // single-expression function

fun main() {
    println(sum(1, 2))
    // 3
}
```

**NOTE:** Omitting the return type is only possible when your function has no body (`{}`). Unless your function's return 
type is `Unit`.

## Lambda Expressions
For example, the following uppercaseString() function:
```kotlin
fun uppercaseString(string: String): String {
    return string.uppercase()
}
fun main() {
    println(uppercaseString("hello"))
    // HELLO
}
```
Can also be written as a lambda expression:
```kotlin
fun main() {
    println({ string: String -> string.uppercase() }("hello"))
    // HELLO
}
```

Lambda expressions can be hard to understand at first glance so let's break it down. Lambda expressions are written within curly braces `{}`.

Within the lambda expression, you write:

- the parameters followed by an `->`. 
- the function body after the `->`.

In the previous example:
- `string` is a function parameter. 
- `string` has type `String`. 
- the function returns the result of the `.uppercase()` function called on `string`.

Lambda expressions can be used in a number of ways. You can:

* assign a lambda to a variable that you can then invoke later 
* pass a lambda expression as a parameter to another function 
* return a lambda expression from a function 
* invoke a lambda expression on its own

### Assign to variable
```kotlin
fun main() {
    val upperCaseString = { string: String -> string.uppercase() }
    println(upperCaseString("hello"))
    // HELLO
}
```
### Pass to another function
```kotlin
val numbers = listOf(1, -2, 3, -4, 5, -6)
val positives = numbers.filter { x -> x > 0 }
val negatives = numbers.filter { x -> x < 0 }
println(positives)
// [1, 3, 5]
println(negatives)
// [-2, -4, -6]
```
The `.filter()` function accepts a lambda expression as a predicate:

### Function types
The syntax for a function type has:

- each parameter's type written within parentheses `() `and separated by commas` ,`.

- the return type written after `->`.

For example: `(String) -> String` or `(Int, Int) -> Int`.
```kotlin
val upperCaseString: (String) -> String = { string -> string.uppercase() }

fun main() {
    println(upperCaseString("hello"))
    // HELLO
}
```

### Return from a function
```kotlin
fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}

fun main() {
    val timesInMinutes = listOf(2, 10, 15, 1)
    val min2sec = toSeconds("minute")
    val totalTimeInSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeInSeconds secs")
    // Total time is 1680 secs
}
```

### Invoke separately
```kotlin
println({ string: String -> string.uppercase() }("hello"))
// HELLO
```

### Trailing Lambdas
As you have already seen, if a lambda expression is the only function parameter, you can drop the function parentheses` ()`. If a lambda expression is passed as the last parameter of a function, then the expression can be written outside the function parentheses `()`. In both cases, this syntax is called a **trailing lambda**.

For example, the `.fold()` function accepts an initial value and an operation:
```kotlin
// The initial value is zero. 
// The operation sums the initial value with every item in the list cumulatively.
println(listOf(1, 2, 3).fold(0, { x, item -> x + item })) // 6

// Alternatively, in the form of a trailing lambda
println(listOf(1, 2, 3).fold(0) { x, item -> x + item })  // 6
```

# Classes

To declare a class, use the `class` keyword:
```kotlin
class Customer
```

## Properties
Characteristics of a class's object can be declared in properties. You can declare properties for a class:
- Within parentheses `()` after the class name.
```kotlin
class Contact(val id: Int, var email: String)
```
- Within the class body defined by curly braces `{}`.
```kotlin
class Contact(val id: Int, var email: String) {
    val category: String = ""
}
```
You can declare properties without `val` or `var` within parentheses but these properties are not accessible after an instance has been created.

**NOTE:** The content contained within parentheses `()` is called the class header.

## Constructor
By default, Kotlin automatically creates a constructor with the parameters declared in the class header.

Kotlin classes can have many constructors, including ones that you define yourself.

A class in Kotlin has a **primary** constructor and possibly one or more **secondary** constructors. The primary constructor is declared in the class header, and it goes after the class name and optional type parameters.

## Create Instance
To create an object from a class, you declare a class **instance** using a **constructor**.

```kotlin
class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
}
```

In the example:

- `Contact` is a class. 
- `contact` is an instance of the `Contact` class. 
- `id` and `email` are properties. 
- `id` and `email` are used with the default constructor to create `contact`.

## Visibility Modifiers
There are four visibility modifiers in Kotlin: `private`, `protected`, `internal`, and `public`. The default visibility is public.

```kotlin
// file name: example.kt
package foo

private fun foo() { ... } // visible inside example.kt

public var bar: Int = 5 // property is visible everywhere
    private set         // setter is visible only in example.kt

internal val baz = 6    // visible inside the same module
```

For members declared inside a **class**:
- `private` means that the member is visible inside this class only (including all its members).
- `protected` means that the member has the same visibility as one marked as private, but that it is also visible in 
subclasses.
- `internal` means that any client inside this module who sees the declaring class sees its internal members.
- `public` means that any client who sees the declaring class sees its public members.

## Access Properties
To access a property of an instance, write the name of the property after the instance name appended with a period `.`:
```kotlin
class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    
    // Prints the value of the property: email
    println(contact.email)           
    // mary@gmail.com

    // Updates the value of the property: email
    contact.email = "jane@gmail.com"
    
    // Prints the new value of the property: email
    println(contact.email)           
    // jane@gmail.com
}
```

## Member Functions
To call a member function on an instance, write the function name after the instance name appended with a period `.`. For example:
```kotlin
class Contact(val id: Int, var email: String) {
    fun printId() {
        println(id)
    }
}

fun main() {
    val contact = Contact(1, "mary@gmail.com")
    // Calls member function printId()
    contact.printId()           
    // 1
}
```
## Data Classes
Kotlin has **data classes** which are particularly useful for storing data. Data classes have the same functionality as classes, but **they come automatically with additional member functions**. These member functions allow you to easily print the instance to readable output, compare instances of a class, copy instances, and more. As these functions are automatically available, you don't have to spend time writing the same boilerplate code for each of your classes.

To declare a data class, use the keyword `data`:
```kotlin
data class User(val name: String, val id: Int)
```

The most useful predefined member functions of data classes are:

| Function          | Description                                                                              |
|-------------------|------------------------------------------------------------------------------------------|
| `.toString()`     | Prints a readable string of the class instance and its properties.                       |
| `.equals() or ==` | Compares instances of a class.                                                           | 
| `.copy()`         | Creates a class instance by copying another, potentially with some different properties. | 


# Null Safety
In Kotlin, it's possible to have a `null` value. To help prevent issues with `null` values in your programs, Kotlin has null safety in place. Null safety detects potential problems with `null` values at **compile time, rather than at run time**.

Null safety is a combination of features that allow you to:

- explicitly declare when `null` values are allowed in your program.
- check for `null` values.
- use safe calls to properties or functions that may contain `null` values.
- declare actions to take if `null` values are detected.

## Nullable Types
Kotlin supports nullable types which allows the possibility for the declared type to have `null` values. By default, a type is **not** allowed to accept `null` values. Nullable types are declared by explicitly adding `?` after the type declaration.

```kotlin
fun main() {
    // neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compiler error
    neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here"

    // This is OK  
    nullable = null

    // By default, null values aren't accepted
    var inferredNonNull = "The compiler assumes non-nullable"

    // Throws a compiler error
    inferredNonNull = null

    // notNull doesn't accept null values
    fun strLength(notNull: String): Int {                 
        return notNull.length
    }

    println(strLength(neverNull)) // 18
    println(strLength(nullable))  // Throws a compiler error
}
```

## Use safe calls
To safely access properties of an object that might contain a `null` value, use the safe call operator `?.`. The safe call operator returns null if the object's property is `null`. This is useful if you want to avoid the presence of `null` values triggering errors in your code.

```kotlin
fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() { 
    var nullString: String? = null
    println(lengthString(nullString))
    // null
}
```

```kotlin
// Safe calls can be chained so that if any property of an object contains a null value, then null is returned without an error being thrown. For example:
person.company?.address?.country
```

## Use Elvis Operator
You can provide a default value to return if a `null` value is detected by using the **Elvis operator** `?:`.

In the following example, `nullString` is `null` so the safe call to access the `length` property returns a `null` value. As a result, the Elvis operator returns `0`:
```kotlin
fun main() {
    var nullString: String? = null
    println(nullString?.length ?: 0)
    // 0
}
```




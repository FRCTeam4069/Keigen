/*
 * This file is taken from [Kotlingrad](https://github.com/breandan/kotlingrad). It provides a type-safe notion of numbers from
 * 0 to 100
 */
package frc.team4069.keigen

open class `0`(override val i: Int = 0): `1`(i) { companion object: `0`(), Nat<`0`> }
open class `1`(override val i: Int = 1): `2`(i) { companion object: `1`(), Nat<`1`> }
open class `2`(override val i: Int = 2): `3`(i) { companion object: `2`(), Nat<`2`> }
open class `3`(override val i: Int = 3): `4`(i) { companion object: `3`(), Nat<`3`> }
open class `4`(override val i: Int = 4): `5`(i) { companion object: `4`(), Nat<`4`> }
open class `5`(override val i: Int = 5): `6`(i) { companion object: `5`(), Nat<`5`> }
open class `6`(override val i: Int = 6): `7`(i) { companion object: `6`(), Nat<`6`> }
open class `7`(override val i: Int = 7): `8`(i) { companion object: `7`(), Nat<`7`> }
open class `8`(override val i: Int = 8): `9`(i) { companion object: `8`(), Nat<`8`> }
open class `9`(override val i: Int = 9): `10`(i) { companion object: `9`(), Nat<`9`> }
open class `10`(override val i: Int = 10): `11`(i) { companion object: `10`(), Nat<`10`> }
open class `11`(override val i: Int = 11): `12`(i) { companion object: `11`(), Nat<`11`> }
open class `12`(override val i: Int = 12): `13`(i) { companion object: `12`(), Nat<`12`> }
open class `13`(override val i: Int = 13): `14`(i) { companion object: `13`(), Nat<`13`> }
open class `14`(override val i: Int = 14): `15`(i) { companion object: `14`(), Nat<`14`> }
open class `15`(override val i: Int = 15): `16`(i) { companion object: `15`(), Nat<`15`> }
open class `16`(override val i: Int = 16): `17`(i) { companion object: `16`(), Nat<`16`> }
open class `17`(override val i: Int = 17): `18`(i) { companion object: `17`(), Nat<`17`> }
open class `18`(override val i: Int = 18): `19`(i) { companion object: `18`(), Nat<`18`> }
open class `19`(override val i: Int = 19): `20`(i) { companion object: `19`(), Nat<`19`> }
open class `20`(override val i: Int = 20): `21`(i) { companion object: `20`(), Nat<`20`> }
open class `21`(override val i: Int = 21): `22`(i) { companion object: `21`(), Nat<`21`> }
open class `22`(override val i: Int = 22): `23`(i) { companion object: `22`(), Nat<`22`> }
open class `23`(override val i: Int = 23): `24`(i) { companion object: `23`(), Nat<`23`> }
open class `24`(override val i: Int = 24): `25`(i) { companion object: `24`(), Nat<`24`> }
open class `25`(override val i: Int = 25): `26`(i) { companion object: `25`(), Nat<`25`> }
open class `26`(override val i: Int = 26): `27`(i) { companion object: `26`(), Nat<`26`> }
open class `27`(override val i: Int = 27): `28`(i) { companion object: `27`(), Nat<`27`> }
open class `28`(override val i: Int = 28): `29`(i) { companion object: `28`(), Nat<`28`> }
open class `29`(override val i: Int = 29): `30`(i) { companion object: `29`(), Nat<`29`> }
open class `30`(override val i: Int = 30): `31`(i) { companion object: `30`(), Nat<`30`> }
open class `31`(override val i: Int = 31): `32`(i) { companion object: `31`(), Nat<`31`> }
open class `32`(override val i: Int = 32): `33`(i) { companion object: `32`(), Nat<`32`> }
open class `33`(override val i: Int = 33): `34`(i) { companion object: `33`(), Nat<`33`> }
open class `34`(override val i: Int = 34): `35`(i) { companion object: `34`(), Nat<`34`> }
open class `35`(override val i: Int = 35): `36`(i) { companion object: `35`(), Nat<`35`> }
open class `36`(override val i: Int = 36): `37`(i) { companion object: `36`(), Nat<`36`> }
open class `37`(override val i: Int = 37): `38`(i) { companion object: `37`(), Nat<`37`> }
open class `38`(override val i: Int = 38): `39`(i) { companion object: `38`(), Nat<`38`> }
open class `39`(override val i: Int = 39): `40`(i) { companion object: `39`(), Nat<`39`> }
open class `40`(override val i: Int = 40): `41`(i) { companion object: `40`(), Nat<`40`> }
open class `41`(override val i: Int = 41): `42`(i) { companion object: `41`(), Nat<`41`> }
open class `42`(override val i: Int = 42): `43`(i) { companion object: `42`(), Nat<`42`> }
open class `43`(override val i: Int = 43): `44`(i) { companion object: `43`(), Nat<`43`> }
open class `44`(override val i: Int = 44): `45`(i) { companion object: `44`(), Nat<`44`> }
open class `45`(override val i: Int = 45): `46`(i) { companion object: `45`(), Nat<`45`> }
open class `46`(override val i: Int = 46): `47`(i) { companion object: `46`(), Nat<`46`> }
open class `47`(override val i: Int = 47): `48`(i) { companion object: `47`(), Nat<`47`> }
open class `48`(override val i: Int = 48): `49`(i) { companion object: `48`(), Nat<`48`> }
open class `49`(override val i: Int = 49): `50`(i) { companion object: `49`(), Nat<`49`> }

sealed class `50`(open val i: Int = 50) {
  companion object: `50`(), Nat<`50`>

  override fun toString() = "$i"
}

interface Nat<T: `50`> { val i: Int }
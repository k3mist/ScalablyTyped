package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Success[T] extends Result[T] {
  var status: parsimmonLib.parsimmonLibNumbers.`true`
  var value: T
}


package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuccessReply[T] extends Reply[T] {
  var expected: js.Array[java.lang.String]
  var furthest: parsimmonLib.parsimmonLibNumbers.`-1`
  var index: scala.Double
  var status: parsimmonLib.parsimmonLibNumbers.`true`
  var value: T
}


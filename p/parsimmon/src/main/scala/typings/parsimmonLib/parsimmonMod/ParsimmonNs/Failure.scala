package typings
package parsimmonLib.parsimmonMod.ParsimmonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Failure
  extends Result[js.Any] {
  var expected: js.Array[java.lang.String]
  var index: Index
  var status: parsimmonLib.parsimmonLibNumbers.`false`
}


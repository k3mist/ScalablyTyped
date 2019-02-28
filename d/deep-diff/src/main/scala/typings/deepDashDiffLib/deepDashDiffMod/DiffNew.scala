package typings
package deepDashDiffLib.deepDashDiffMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiffNew[RHS]
  extends Diff[js.Any, RHS] {
  var kind: deepDashDiffLib.deepDashDiffLibStrings.N
  var path: js.UndefOr[js.Array[_]] = js.undefined
  var rhs: RHS
}


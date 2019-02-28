package typings
package immutabilityDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object immutabilityDashHelperMod {
  type CustomCommands[T] = T with immutabilityDashHelperLib.Anon_NoInferenceCustomCommandsBrand
  type Spec[T, C /* <: CustomCommands[js.Object] */] = (_Spec[T, C]) | immutabilityDashHelperLib.SetSpec[js.Any] | (immutabilityDashHelperLib.MapSpec[js.Any, js.Any]) | (immutabilityDashHelperLib.ArraySpec[js.Any, C]) | (js.Function1[/* v */ T, T]) | js.Any
}

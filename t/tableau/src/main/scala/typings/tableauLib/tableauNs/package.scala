package typings
package tableauLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tableauNs {
  type ListenerFunction[T /* <: TableauEvent */] = js.Function1[/* event */ T, scala.Unit]
}

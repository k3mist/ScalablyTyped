package typings
package virtualDashDomLib.VirtualDOMNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// enum VPatch {
//   NONE = 0,
//   VTEXT = 1,
//   VNODE = 2,
//   WIDGET = 3,
//   PROPS = 4,
//   ORDER = 5,
//   INSERT = 6,
//   REMOVE = 7,
//   THUNK = 8
// }
trait VPatch extends js.Object {
  var patch: js.Any
  /**
    type is set to 'VirtualPatch' on the prototype, but overridden in the
    constructor with a number.
    */
  var `type`: scala.Double
  var vNode: VNode
  var version: java.lang.String
}

object VPatch {
  @scala.inline
  def apply(patch: js.Any, `type`: scala.Double, vNode: VNode, version: java.lang.String): VPatch = {
    val __obj = js.Dynamic.literal(patch = patch, `type` = `type`, vNode = vNode, version = version)
  
    __obj.asInstanceOf[VPatch]
  }
}


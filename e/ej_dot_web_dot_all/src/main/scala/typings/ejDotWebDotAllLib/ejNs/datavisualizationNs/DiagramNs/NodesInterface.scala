package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.DiagramNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NodesInterface extends js.Object {
  /** Defines a collection of attributes of the interface
    * @Default {[]}
    */
  var attributes: js.UndefOr[js.Array[NodesInterfaceAttribute]] = js.undefined
  /** Defines the collection of public methods of an interface
    * @Default {[]}
    */
  var methods: js.UndefOr[js.Array[NodesInterfaceMethod]] = js.undefined
  /** Sets the name of the interface
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object NodesInterface {
  @scala.inline
  def apply(
    attributes: js.Array[NodesInterfaceAttribute] = null,
    methods: js.Array[NodesInterfaceMethod] = null,
    name: java.lang.String = null
  ): NodesInterface = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (methods != null) __obj.updateDynamic("methods")(methods)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[NodesInterface]
  }
}


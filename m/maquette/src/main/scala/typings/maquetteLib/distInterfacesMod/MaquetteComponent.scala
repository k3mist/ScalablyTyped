package typings
package maquetteLib.distInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaquetteComponent extends js.Object {
  /**
    * A function that returns the DOM representation of the component.
    */
  def render(): js.UndefOr[VNode | scala.Null]
}

object MaquetteComponent {
  @scala.inline
  def apply(render: () => js.UndefOr[VNode | scala.Null]): MaquetteComponent = {
    val __obj = js.Dynamic.literal(render = js.Any.fromFunction0(render))
  
    __obj.asInstanceOf[MaquetteComponent]
  }
}


package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResizeSettings extends js.Object {
  /** Gets or sets a value that indicates whether to define the mode of resizing.
    * @Default {ej.Grid.ResizeMode.Normal}
    */
  var resizeMode: js.UndefOr[ResizeMode | java.lang.String] = js.undefined
}

object ResizeSettings {
  @scala.inline
  def apply(resizeMode: ResizeMode | java.lang.String = null): ResizeSettings = {
    val __obj = js.Dynamic.literal()
    if (resizeMode != null) __obj.updateDynamic("resizeMode")(resizeMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResizeSettings]
  }
}


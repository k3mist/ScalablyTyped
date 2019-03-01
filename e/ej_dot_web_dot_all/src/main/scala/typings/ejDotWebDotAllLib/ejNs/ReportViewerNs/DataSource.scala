package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSource extends js.Object {
  /** Gets or sets the name of the data source.
    * @Default {empty}
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets the values of data source.
    * @Default {[]}
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object DataSource {
  @scala.inline
  def apply(name: java.lang.String = null, value: js.Array[_] = null): DataSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataSource]
  }
}


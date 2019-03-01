package typings
package datatablesDotNetLib.DataTablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion "util-methods"
trait CommonSubMethods extends js.Object {
  /**
    * Get the DataTables cached data for the selected cell
    *
    * @param t Specify which cache the data should be read from. Can take one of two values: search or order
    */
  def cache(t: java.lang.String): Api
}

object CommonSubMethods {
  @scala.inline
  def apply(cache: js.Function1[java.lang.String, Api]): CommonSubMethods = {
    val __obj = js.Dynamic.literal(cache = cache)
  
    __obj.asInstanceOf[CommonSubMethods]
  }
}


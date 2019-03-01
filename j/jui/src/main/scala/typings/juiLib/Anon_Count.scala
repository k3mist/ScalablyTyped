package typings
package juiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Count extends js.Object {
  /**
    * @cfg {Integer} [count=0]
    * Total number of data records subject to paging)
    */
  var count: js.UndefOr[scala.Double] = js.undefined
  var event: js.UndefOr[js.Any] = js.undefined
  /**
    * @cfg {Integer} [pageCount=10]
    * Number of data records per page
    */
  var pageCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * @cfg {Integer} [screenCount=5]
    * Number of pages shown on the paging screen
    */
  var screenCount: js.UndefOr[scala.Double] = js.undefined
  var tpl: js.UndefOr[js.Any] = js.undefined
}

object Anon_Count {
  @scala.inline
  def apply(
    count: scala.Int | scala.Double = null,
    event: js.Any = null,
    pageCount: scala.Int | scala.Double = null,
    screenCount: scala.Int | scala.Double = null,
    tpl: js.Any = null
  ): Anon_Count = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (event != null) __obj.updateDynamic("event")(event)
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    if (screenCount != null) __obj.updateDynamic("screenCount")(screenCount.asInstanceOf[js.Any])
    if (tpl != null) __obj.updateDynamic("tpl")(tpl)
    __obj.asInstanceOf[Anon_Count]
  }
}


package typings
package gapiDotClientDotBooksLib.gapiNs.clientNs.booksNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Series extends js.Object {
  /** Resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var series: js.UndefOr[js.Array[gapiDotClientDotBooksLib.Anon_BannerImageUrl]] = js.undefined
}

object Series {
  @scala.inline
  def apply(
    kind: java.lang.String = null,
    series: js.Array[gapiDotClientDotBooksLib.Anon_BannerImageUrl] = null
  ): Series = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (series != null) __obj.updateDynamic("series")(series)
    __obj.asInstanceOf[Series]
  }
}


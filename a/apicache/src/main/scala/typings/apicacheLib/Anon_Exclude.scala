package typings
package apicacheLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exclude extends js.Object {
  /** list status codes to specifically exclude (e.g. [404, 403] cache all responses unless they had a 404 or 403 status) */
  var exclude: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /** list status codes to require (e.g. [200] caches ONLY responses with a success/200 code) */
  var include: js.UndefOr[js.Array[scala.Double]] = js.undefined
}

object Anon_Exclude {
  @scala.inline
  def apply(exclude: js.Array[scala.Double] = null, include: js.Array[scala.Double] = null): Anon_Exclude = {
    val __obj = js.Dynamic.literal()
    if (exclude != null) __obj.updateDynamic("exclude")(exclude)
    if (include != null) __obj.updateDynamic("include")(include)
    __obj.asInstanceOf[Anon_Exclude]
  }
}


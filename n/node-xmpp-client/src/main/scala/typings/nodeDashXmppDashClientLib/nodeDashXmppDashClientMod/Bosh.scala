package typings
package nodeDashXmppDashClientLib.nodeDashXmppDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bosh extends js.Object {
  var prebind: js.UndefOr[js.Function2[/* error */ js.Any, /* data */ js.Any, scala.Unit]] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object Bosh {
  @scala.inline
  def apply(
    prebind: js.Function2[/* error */ js.Any, /* data */ js.Any, scala.Unit] = null,
    url: java.lang.String = null
  ): Bosh = {
    val __obj = js.Dynamic.literal()
    if (prebind != null) __obj.updateDynamic("prebind")(prebind)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Bosh]
  }
}


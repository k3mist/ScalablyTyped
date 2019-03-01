package typings
package meteorDashPublishDashCompositeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfigN extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfigN]] = js.undefined
  var collectionName: js.UndefOr[java.lang.String] = js.undefined
  def find(args: js.Any*): meteorLib.MongoNs.Cursor[_]
}

object PublishCompositeConfigN {
  @scala.inline
  def apply(
    find: js.Function1[/* repeated */ js.Any, meteorLib.MongoNs.Cursor[_]],
    children: js.Array[PublishCompositeConfigN] = null,
    collectionName: java.lang.String = null
  ): PublishCompositeConfigN = {
    val __obj = js.Dynamic.literal(find = find)
    if (children != null) __obj.updateDynamic("children")(children)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    __obj.asInstanceOf[PublishCompositeConfigN]
  }
}


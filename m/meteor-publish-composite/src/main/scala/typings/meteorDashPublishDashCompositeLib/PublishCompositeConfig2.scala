package typings
package meteorDashPublishDashCompositeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] extends js.Object {
  var children: js.UndefOr[js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]]] = js.undefined
  var collectionName: js.UndefOr[java.lang.String] = js.undefined
  def find(arg2: InLevel2, arg1: InLevel1): meteorLib.MongoNs.Cursor[OutLevel]
}

object PublishCompositeConfig2 {
  @scala.inline
  def apply[InLevel1, InLevel2, OutLevel](
    find: js.Function2[InLevel2, InLevel1, meteorLib.MongoNs.Cursor[OutLevel]],
    children: js.Array[PublishCompositeConfig3[InLevel1, InLevel2, OutLevel, _]] = null,
    collectionName: java.lang.String = null
  ): PublishCompositeConfig2[InLevel1, InLevel2, OutLevel] = {
    val __obj = js.Dynamic.literal(find = find)
    if (children != null) __obj.updateDynamic("children")(children)
    if (collectionName != null) __obj.updateDynamic("collectionName")(collectionName)
    __obj.asInstanceOf[PublishCompositeConfig2[InLevel1, InLevel2, OutLevel]]
  }
}


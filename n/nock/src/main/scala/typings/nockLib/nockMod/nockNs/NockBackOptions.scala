package typings
package nockLib.nockMod.nockNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NockBackOptions extends js.Object {
  var after: js.UndefOr[js.Function1[/* scope */ Scope, scala.Unit]] = js.undefined
  var afterRecord: js.UndefOr[js.Function1[/* defs */ js.Array[NockDefinition], js.Array[NockDefinition]]] = js.undefined
  var before: js.UndefOr[js.Function1[/* def */ NockDefinition, scala.Unit]] = js.undefined
  var recorder: js.UndefOr[RecorderOptions] = js.undefined
}

object NockBackOptions {
  @scala.inline
  def apply(
    after: js.Function1[/* scope */ Scope, scala.Unit] = null,
    afterRecord: js.Function1[/* defs */ js.Array[NockDefinition], js.Array[NockDefinition]] = null,
    before: js.Function1[/* def */ NockDefinition, scala.Unit] = null,
    recorder: RecorderOptions = null
  ): NockBackOptions = {
    val __obj = js.Dynamic.literal()
    if (after != null) __obj.updateDynamic("after")(after)
    if (afterRecord != null) __obj.updateDynamic("afterRecord")(afterRecord)
    if (before != null) __obj.updateDynamic("before")(before)
    if (recorder != null) __obj.updateDynamic("recorder")(recorder)
    __obj.asInstanceOf[NockBackOptions]
  }
}


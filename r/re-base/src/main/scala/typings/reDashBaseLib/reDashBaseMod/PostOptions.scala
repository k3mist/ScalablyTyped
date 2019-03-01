package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostOptions extends js.Object {
  /**
    * The data you're wanting to persist to Firebase.
    */
  var data: js.Any
  /**
    * A callback that will get invoked once the new data has been saved to
    * Firebase. If there is an error, it will be the only argument to this
    * function.
    */
  var `then`: js.UndefOr[js.Function1[/* result */ js.Any, scala.Unit]] = js.undefined
}

object PostOptions {
  @scala.inline
  def apply(data: js.Any, `then`: js.Function1[/* result */ js.Any, scala.Unit] = null): PostOptions = {
    val __obj = js.Dynamic.literal(data = data)
    if (`then` != null) __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[PostOptions]
  }
}


package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListenToOptions extends js.Object {
  /**
    * Returns the Firebase data at the specified endpoint as an Array
    * instead of an Object.
    */
  var asArray: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The context of your component.
    */
  var context: js.Object
  /**
    * The callback function that will be invoked if the current user does
    * not have read permissions at the location.
    */
  var onFailure: js.UndefOr[js.Function1[/* error */ js.Any, scala.Unit]] = js.undefined
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.undefined
  /**
    * The callback function that will be invoked with the data from the
    * specified endpoint when the endpoint changes.
    */
  def `then`(result: js.Any): scala.Unit
}

object ListenToOptions {
  @scala.inline
  def apply(
    context: js.Object,
    `then`: js.Function1[js.Any, scala.Unit],
    asArray: js.UndefOr[scala.Boolean] = js.undefined,
    onFailure: js.Function1[/* error */ js.Any, scala.Unit] = null,
    queries: js.Object = null
  ): ListenToOptions = {
    val __obj = js.Dynamic.literal(context = context, `then` = `then`)
    if (!js.isUndefined(asArray)) __obj.updateDynamic("asArray")(asArray)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    __obj.asInstanceOf[ListenToOptions]
  }
}


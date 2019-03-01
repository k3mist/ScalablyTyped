package typings
package reDashBaseLib.reDashBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncStateOptions extends js.Object {
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
    * A default value to set when the Firebase endpoint has no value (i.e.,
    * on init) (use this if you want a value other than an empty object or
    * empty array)
    */
  var defaultValue: js.UndefOr[java.lang.String | scala.Boolean | scala.Double | js.Object] = js.undefined
  /**
    * Will keep any firebase generated keys intact when manipulating data
    * using the asArray option.
    */
  var keepKeys: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A callback function that will be invoked if the current user does
    * not have read or write permissions at the location.
    */
  var onFailure: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Queries to be used with your read operations. See
    * [Query Options](https://github.com/tylermcginnis/re-base#queries)
    * for more details.
    */
  var queries: js.UndefOr[js.Object] = js.undefined
  /**
    * The state property you want to sync with Firebase; can be an
    * arbitrarily nested property a là `foo.bar`.
    */
  var state: java.lang.String
  /**
    * The callback function that will be invoked when the initial listener
    * is established with Firebase. Typically used (with syncState) to
    * change this.state.loading to false.
    */
  var `then`: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object SyncStateOptions {
  @scala.inline
  def apply(
    context: js.Object,
    state: java.lang.String,
    asArray: js.UndefOr[scala.Boolean] = js.undefined,
    defaultValue: java.lang.String | scala.Boolean | scala.Double | js.Object = null,
    keepKeys: js.UndefOr[scala.Boolean] = js.undefined,
    onFailure: js.Function0[scala.Unit] = null,
    queries: js.Object = null,
    `then`: js.Function0[scala.Unit] = null
  ): SyncStateOptions = {
    val __obj = js.Dynamic.literal(context = context, state = state)
    if (!js.isUndefined(asArray)) __obj.updateDynamic("asArray")(asArray)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(keepKeys)) __obj.updateDynamic("keepKeys")(keepKeys)
    if (onFailure != null) __obj.updateDynamic("onFailure")(onFailure)
    if (queries != null) __obj.updateDynamic("queries")(queries)
    if (`then` != null) __obj.updateDynamic("then")(`then`)
    __obj.asInstanceOf[SyncStateOptions]
  }
}


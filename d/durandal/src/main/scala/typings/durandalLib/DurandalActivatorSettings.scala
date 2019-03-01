package typings
package durandalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DurandalActivatorSettings extends js.Object {
  /**
    * Lower-cased words which represent a truthy value.
    * @default ['yes', 'ok', 'true']
    */
  var affirmations: js.Array[java.lang.String]
  /**
    * The default value passed to an object's deactivate function as its close parameter.
    * @default true
    */
  var closeOnDeactivate: scala.Boolean
  /**
    * Called immediately after the old item is deactivated.
    * @param {object} oldItem The previous item.
    * @param {boolean} close Whether or not the previous item was closed.
    * @param {function} setter The activate item setter function.
    */
  def afterDeactivate(oldItem: js.Any, close: scala.Boolean, setter: js.Function): scala.Unit
  /**
    * Determines whether or not the current item and the new item are the same.
    * @param {object} currentItem
    * @param {object} newItem
    * @param {object} currentActivationData
    * @param {object} newActivationData
    * @returns {boolean}
    */
  def areSameItem(currentItem: js.Any, newItem: js.Any, currentActivationData: js.Any, newActivationData: js.Any): scala.Boolean
  /**
    * Called immediately before the new item is activated.
    * @param {object} newItem
    */
  def beforeActivate(newItem: js.Any): js.Any
  /**
    * Interprets the response of a `canActivate` or `canDeactivate` call using the known affirmative values in the `affirmations` array.
    * @param {object} value
    * @returns {boolean}
    */
  def interpretResponse(value: js.Any): scala.Boolean
}

object DurandalActivatorSettings {
  @scala.inline
  def apply(
    affirmations: js.Array[java.lang.String],
    afterDeactivate: js.Function3[js.Any, scala.Boolean, js.Function, scala.Unit],
    areSameItem: js.Function4[js.Any, js.Any, js.Any, js.Any, scala.Boolean],
    beforeActivate: js.Function1[js.Any, js.Any],
    closeOnDeactivate: scala.Boolean,
    interpretResponse: js.Function1[js.Any, scala.Boolean]
  ): DurandalActivatorSettings = {
    val __obj = js.Dynamic.literal(affirmations = affirmations, afterDeactivate = afterDeactivate, areSameItem = areSameItem, beforeActivate = beforeActivate, closeOnDeactivate = closeOnDeactivate, interpretResponse = interpretResponse)
  
    __obj.asInstanceOf[DurandalActivatorSettings]
  }
}


package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScriptType extends js.Object {
  /**
    * Interface to define public script attributes available in the editor. 
    * @type {{ [key: string]: pc.AttributesArgs }}
    * @memberof Script
    */
  var attributes: js.UndefOr[org.scalablytyped.runtime.StringDictionary[playcanvasLib.pcNs.AttributesArgs]] = js.undefined
  /**
    * initialize is called if defined when script is about to run for the first time.
    * @memberof ScriptType
    */
  var initialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * postInitialize will run after all initialize methods are executed in the  
    * same tick or enabling chain of actions.
    * @memberof ScriptType
    */
  var postInitialize: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * postUpdate is called if defined for enabled (running state) scripts on each tick,  
    * after update.
    * @memberof ScriptType
    */
  var postUpdate: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * This method will be called when a ScriptType that already exists in the registry   
    * gets redefined. If the new ScriptType has a `swap` method in its prototype, 
    * then it will be executed to perform hot-reload at runtime. 
    * @memberof ScriptType
    */
  var swap: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * update is called if defined for enabled (running state) scripts on each tick.
    * @param {number} dt 
    * @memberof ScriptType
    */
  var update: js.UndefOr[js.Function1[/* dt */ scala.Double, scala.Unit]] = js.undefined
}

object ScriptType {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[playcanvasLib.pcNs.AttributesArgs] = null,
    initialize: js.Function0[scala.Unit] = null,
    name: java.lang.String = null,
    postInitialize: js.Function0[scala.Unit] = null,
    postUpdate: js.Function0[scala.Unit] = null,
    swap: js.Function0[scala.Unit] = null,
    update: js.Function1[/* dt */ scala.Double, scala.Unit] = null
  ): ScriptType = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (initialize != null) __obj.updateDynamic("initialize")(initialize)
    if (name != null) __obj.updateDynamic("name")(name)
    if (postInitialize != null) __obj.updateDynamic("postInitialize")(postInitialize)
    if (postUpdate != null) __obj.updateDynamic("postUpdate")(postUpdate)
    if (swap != null) __obj.updateDynamic("swap")(swap)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[ScriptType]
  }
}


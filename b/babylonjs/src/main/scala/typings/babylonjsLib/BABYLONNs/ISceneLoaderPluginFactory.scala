package typings
package babylonjsLib.BABYLONNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface used by SceneLoader plugin factory
  */
trait ISceneLoaderPluginFactory extends js.Object {
  /**
    * Boolean indicating if the plugin can direct load specific data
    */
  var canDirectLoad: js.UndefOr[js.Function1[/* data */ java.lang.String, scala.Boolean]] = js.undefined
  /**
    * Defines the name of the factory
    */
  var name: java.lang.String
  /**
    * Function called to create a new plugin
    * @return the new plugin
    */
  def createPlugin(): ISceneLoaderPlugin | ISceneLoaderPluginAsync
}

object ISceneLoaderPluginFactory {
  @scala.inline
  def apply(
    createPlugin: js.Function0[ISceneLoaderPlugin | ISceneLoaderPluginAsync],
    name: java.lang.String,
    canDirectLoad: js.Function1[/* data */ java.lang.String, scala.Boolean] = null
  ): ISceneLoaderPluginFactory = {
    val __obj = js.Dynamic.literal(createPlugin = createPlugin, name = name)
    if (canDirectLoad != null) __obj.updateDynamic("canDirectLoad")(canDirectLoad)
    __obj.asInstanceOf[ISceneLoaderPluginFactory]
  }
}


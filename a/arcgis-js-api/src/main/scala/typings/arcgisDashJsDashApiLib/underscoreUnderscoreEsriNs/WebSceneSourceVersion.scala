package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebSceneSourceVersion
  extends stdLib.Object {
  /**
    * The major version of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  var major: scala.Double
  /**
    * The minor version of the WebScene.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#sourceVersion)
    */
  var minor: scala.Double
}

object WebSceneSourceVersion {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    major: scala.Double,
    minor: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): WebSceneSourceVersion = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, major = major, minor = minor, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[WebSceneSourceVersion]
  }
}


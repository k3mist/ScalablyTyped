package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Loadable extends js.Object {
  /**
    * The Error object returned if an error occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#loadError)
    *
    * @default null
    */
  val loadError: Error = js.native
  /**
    * Represents the status of a [load](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#load) operation.
    *
    * Value | Description
    * ------|------------
    * not-loaded | The object's resources have not loaded.
    * loading | The object's resources are currently loading.
    * loaded | The object's resources have loaded without errors.
    * failed | The object's resources failed to load. See [loadError](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#loadError) for more details.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#loadStatus)
    *
    * @default not-loaded
    */
  val loadStatus: java.lang.String = js.native
  /**
    * A list of warnings which occurred while loading.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#loadWarnings)
    */
  val loadWarnings: js.Array[_] = js.native
  /**
    * Cancels a [load()](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#load) operation if it is already in progress.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#cancelLoad)
    *
    *
    */
  def cancelLoad(): scala.Unit = js.native
  /**
    * `isFulfilled()` may be used to verify if creating an instance of the class is fulfilled (either resolved or rejected). If it is fulfilled, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#isFulfilled)
    *
    *
    */
  def isFulfilled(): scala.Boolean = js.native
  /**
    * `isRejected()` may be used to verify if creating an instance of the class is rejected. If it is rejected, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#isRejected)
    *
    *
    */
  def isRejected(): scala.Boolean = js.native
  /**
    * `isResolved()` may be used to verify if creating an instance of the class is resolved. If it is resolved, `true` will be returned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#isResolved)
    *
    *
    */
  def isResolved(): scala.Boolean = js.native
  /**
    * Loads the resources referenced by this class. This method automatically executes for a [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html) and all of the resources it references in [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) if the view is constructed with a map instance.  This method must be called by the developer when accessing a resource that will not be loaded in a [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#load)
    *
    *
    */
  def load(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * `when()` may be leveraged once an instance of the class is created. This method takes two input parameters: a `callback` function and an `errback` function. The `callback` executes when the instance of the class loads. The `errback` executes if the instance of the class fails to load.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Loadable.html#when)
    *
    * @param callback The function to call when the promise resolves.
    * @param errback The function to execute when the promise fails.
    *
    */
  def when(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def when(callback: js.Function): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def when(callback: js.Function, errback: js.Function): arcgisDashJsDashApiLib.IPromise[_] = js.native
}


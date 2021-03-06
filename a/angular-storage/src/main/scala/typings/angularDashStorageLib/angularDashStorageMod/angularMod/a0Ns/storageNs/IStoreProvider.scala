package typings
package angularDashStorageLib.angularDashStorageMod.angularMod.a0Ns.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStoreProvider extends js.Object {
  /**
  		     * Sets the storage.
  		     *
  		     * @param {String} storage - The storage name
  		     */
  def setStore(storage: java.lang.String): scala.Unit
}

object IStoreProvider {
  @scala.inline
  def apply(setStore: java.lang.String => scala.Unit): IStoreProvider = {
    val __obj = js.Dynamic.literal(setStore = js.Any.fromFunction1(setStore))
  
    __obj.asInstanceOf[IStoreProvider]
  }
}


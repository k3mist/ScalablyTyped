package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A persistent property set, which can be saved in and restored from a {@link XPropertySetRegistry} .
  * @author Kai Sommerfeld
  * @version 1.0
  */
trait XPersistentPropertySet
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet {
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  val Key: java.lang.String
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  val Registry: XPropertySetRegistry
  /**
    * returns the key used to address the set in the property set registry.
    * @returns The key.
    */
  def getKey(): java.lang.String
  /**
    * returns the registry used to store the property set.
    * @returns The registry.
    */
  def getRegistry(): XPropertySetRegistry
}

object XPersistentPropertySet {
  @scala.inline
  def apply(
    Key: java.lang.String,
    PropertySetInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo,
    Registry: XPropertySetRegistry,
    acquire: js.Function0[scala.Unit],
    addPropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    addVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    getKey: js.Function0[java.lang.String],
    getPropertySetInfo: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySetInfo],
    getPropertyValue: js.Function1[java.lang.String, js.Any],
    getRegistry: js.Function0[XPropertySetRegistry],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removePropertyChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertyChangeListener, 
      scala.Unit
    ],
    removeVetoableChangeListener: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XVetoableChangeListener, 
      scala.Unit
    ],
    setPropertyValue: js.Function2[java.lang.String, js.Any, scala.Unit]
  ): XPersistentPropertySet = {
    val __obj = js.Dynamic.literal(Key = Key, PropertySetInfo = PropertySetInfo, Registry = Registry, acquire = acquire, addPropertyChangeListener = addPropertyChangeListener, addVetoableChangeListener = addVetoableChangeListener, getKey = getKey, getPropertySetInfo = getPropertySetInfo, getPropertyValue = getPropertyValue, getRegistry = getRegistry, queryInterface = queryInterface, release = release, removePropertyChangeListener = removePropertyChangeListener, removeVetoableChangeListener = removeVetoableChangeListener, setPropertyValue = setPropertyValue)
  
    __obj.asInstanceOf[XPersistentPropertySet]
  }
}


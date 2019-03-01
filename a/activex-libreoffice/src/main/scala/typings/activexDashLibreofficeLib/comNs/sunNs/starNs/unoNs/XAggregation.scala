package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Objects which implement this interface can become aggregates of a delegator.
  *
  * That means if an object "A" aggregates "B", "A" can provide all or some of the interfaces of "B". Whenever the method {@link
  * XInterface.queryInterface()} is called on either of the objects, the call will be forwarded to object "A". Object "A" now can determine whether to use
  * the interfaces of "A" or "B" or neither. Actually, any number of aggregates can be used, even nested ones (aggregated objects which are delegators by
  * themselves).
  *
  * The following rules are to be observed:  1. All calls to {@link XInterface.acquire()} which are made before the delegator was set (using the method
  * {@link XAggregation.setDelegator()} ) must not be taken back (using the method {@link XInterface.release()} ) before the delegation is removed by
  * calling `xAggregation->setDelegator(NULL)` .
  *
  *  2. The constructor of a delegator has to increment its own reference count by calling its method {@link XInterface.acquire()} before it sets itself
  * to any aggregate using the method {@link XAggregation.setDelegator()} . After that call it has to reset its own reference count without the destructor
  * getting called.
  *
  *  3. The destructor of a delegator has to reset the delegator in its aggregated objects by calling their method {@link XAggregation.setDelegator()}
  * with NULL before it releases its reference to its aggregated objects.
  * @deprecated DeprecatedAggregation will no longer be supported as a high-level concept of UNO. You may still have the option to implement an UNO object consis
  */
trait XAggregation extends XInterface {
  /**
    * is similar to {@link XInterface.queryInterface()} , but it is to be processed directly without being forwarded to the delegator.
    *
    * This method is only called from within an implementation of {@link XInterface.queryInterface()} or {@link XAggregation.queryAggregation()} . This
    * method is to be called by the delegator if it does not implement the interface itself. An object which got aggregated cannot depend on getting its own
    * interface when it calls the method {@link XInterface.queryInterface()} .
    * @see XAggregation.setDelegator
    */
  def queryAggregation(aType: activexDashLibreofficeLib.`type`): js.Any
  /**
    * sets the object to which all calls to the method {@link XInterface.queryInterface()} have to be forwarded.
    * @param pDelegator specifies the object which handles the calls to {@link XInterface.queryInterface()} . If **pDelegator** is NULL, the delegator is remo
    * @see XAggregation.queryAggregation
    */
  def setDelegator(pDelegator: XInterface): scala.Unit
}

object XAggregation {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    queryAggregation: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setDelegator: js.Function1[XInterface, scala.Unit]
  ): XAggregation = {
    val __obj = js.Dynamic.literal(acquire = acquire, queryAggregation = queryAggregation, queryInterface = queryInterface, release = release, setDelegator = setDelegator)
  
    __obj.asInstanceOf[XAggregation]
  }
}


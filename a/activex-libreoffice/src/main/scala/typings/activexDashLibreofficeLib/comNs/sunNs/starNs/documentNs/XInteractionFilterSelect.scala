package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * continuation used by interaction mechanism at filter detection during loading documents
  *
  * If during loading time the filter can't be detected and wasn't given at calling time, a possible {@link com.sun.star.task.InteractionHandler} will be
  * used. (it's a part of used {@link MediaDescriptor} ) A {@link NoSuchFilterRequest} will be used then to start right interaction on that to get a
  * decision which filter should be used for given URL. A possible continuation of that can be this {@link XInteractionFilterSelect} . It will transport
  * the decision back to generic filter detection and force using of it. Of course it's possible to abort the loading process by use another continuation
  * {@link com.sun.star.task.XInteractionAbort} .
  * @see MediaDescriptor
  * @see com.sun.star.task.InteractionHandler
  * @see NoSuchFilterRequest
  * @see com.sun.star.task.XInteractionAbort
  */
trait XInteractionFilterSelect
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionContinuation {
  /** used by detection to get selected filter */
  var Filter: java.lang.String
  /** used by detection to get selected filter */
  def getFilter(): java.lang.String
  /**
    * used by interaction to set selected filter
    *
    * This value must be saved till another one will be set and must be provided on {@link getFilter()} for interest users.
    */
  def setFilter(Name: java.lang.String): scala.Unit
}

object XInteractionFilterSelect {
  @scala.inline
  def apply(
    Filter: java.lang.String,
    acquire: js.Function0[scala.Unit],
    getFilter: js.Function0[java.lang.String],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    select: js.Function0[scala.Unit],
    setFilter: js.Function1[java.lang.String, scala.Unit]
  ): XInteractionFilterSelect = {
    val __obj = js.Dynamic.literal(Filter = Filter, acquire = acquire, getFilter = getFilter, queryInterface = queryInterface, release = release, select = select, setFilter = setFilter)
  
    __obj.asInstanceOf[XInteractionFilterSelect]
  }
}

